package org.metaborg.paplj.types

import org.metaborg.paplj.paplj.*
import static extension org.eclipse.xtext.EcoreUtil2.*
import com.google.inject.Inject
import org.metaborg.paplj.lib.PapljLib

/**
 * Determines the type of an expression. 
 */
class PapljTypeProvider {
	
	@Inject extension PapljLib
	
	val ep = PapljPackage::eINSTANCE
	
	public static val BoolT = PapljFactory::eINSTANCE.createType => [name='Bool']
	public static val NumT = PapljFactory::eINSTANCE.createType => [name='Num']
	public static val NullT = PapljFactory::eINSTANCE.createType => [name='Null']
	// Top type:
	public static val AnyT = PapljFactory::eINSTANCE.createType => [name='Any']
	// Bottom type:
	public static val EmptyT = PapljFactory::eINSTANCE.createType => [name='Empty']
	
	def Type typeOf(Expr e) {
		switch (e) {
			Or: BoolT
			And: BoolT
			Eq: BoolT
			Neq: BoolT
			Lt: BoolT
			Add: NumT
			Sub: NumT
			Mul: NumT
			Div: NumT
			Not: BoolT
			Min: NumT
			Num: NumT
			Bool: BoolT
			This: e.getContainerOfType(typeof(Type))
			Null: NullT
			New: e.type
			Var: e.member?.type
			MemberRef: e.member?.type
			Block2: e.exprs.last.typeOf
		}
	}
	
	def Type expectedTypeOf(Expr e) {
		val c = e.eContainer
		val f = e.eContainingFeature
		
		switch (c) {
			// The if-statement's condition must be Bool.
			If         case f == ep.if_Condition: BoolT
			// The assignment's value must be the type of the member it's assigned to.
			Assignment case f == ep.assignment_Value: c.left.typeOf
			// The method's body must return a value of the type of the method.
			Method     case f == ep.method_Body: c.type
			// A possible method call's arguments must match the types of the parameters. 
			MemberRef  case f == ep.memberRef_Args: {
				try {
					(c.member as Method).params.get(c.args.indexOf(e)).type
				} catch (Throwable t) {
					null
				}
			}
		}
	}
	
	/**
	 * Determines whether the specified type is a primitive type.
	 */
	def isPrimitive(Type t) {
		// Types that we created programmatically
		// have no associated resource, which allows
		// us to identify them as the primitive types
		// we created.
		t.eResource === null
	}
	
}