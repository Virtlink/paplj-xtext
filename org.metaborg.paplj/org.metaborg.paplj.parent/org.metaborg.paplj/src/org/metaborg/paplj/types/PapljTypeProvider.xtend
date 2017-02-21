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
			case f == ep.if_Condition: BoolT
			// TODO, page 221
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
		t.eResource == null
	}
	
}