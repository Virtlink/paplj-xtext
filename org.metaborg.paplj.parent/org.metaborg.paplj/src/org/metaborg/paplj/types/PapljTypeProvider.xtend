package org.metaborg.paplj.types

import org.metaborg.paplj.paplj.*
import static extension org.eclipse.xtext.EcoreUtil2.*
import com.google.inject.Inject
import org.metaborg.paplj.lib.PapljLib
import org.eclipse.xtext.naming.IQualifiedNameProvider
import static extension org.metaborg.paplj.PapljModelUtil.*;
//import static org.eclipse.xtext.xbase.lib.IterableExtensions.*;
import java.util.List

/**
 * Determines the type of an expression. 
 */
class PapljTypeProvider {
	
	@Inject extension PapljLib
	@Inject extension IQualifiedNameProvider
	@Inject extension PapljTypeConformance
	
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
			Cast: e.type
			Block2: e.exprs.last.typeOf
			If: commonAncestorOf(e.onTrue.typeOf, e.onFalse.typeOf)
		}
	}
	
	def getSuperTypeOrAny(Type t) {
		t.superType ?: getPapljAnyType(t)
	}
	
	def Type commonAncestorOf(Type t1, Type t2) {
		var candidates = (#[t1] + t1.ancestorsWithAny).toList
		var type = candidates.findFirst[c|t2.isConformant(c)]
		type ?: getPapljAnyType(t1)
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
			// Let binding
			Binding    case f == ep.binding_Value: c.type
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
	
	def isNum(Type c) {
		c == PapljTypeProvider.NumT ||
		c.fullyQualifiedName.toString == PapljLib::LIB_NUM
	}
		
	def isBool(Type c) {
		c == PapljTypeProvider.BoolT ||
		c.fullyQualifiedName.toString == PapljLib::LIB_BOOL
	}
		
	def isAny(Type c) {
		c == PapljTypeProvider.AnyT ||
		c.fullyQualifiedName.toString == PapljLib::LIB_ANY
	}
	
	def memberAsString(Member member) {
		switch (member) {
			Field: member.name
			Method: '''«member.name»(«member.paramsTypesAsString»)'''
		}
	}
	
	def paramsTypesAsString(Method method) {
		method.params.map[type?.name].join(", ")
	}

	def memberAsStringWithType(Member member) {
		'''«member.memberAsString» : «member.type.name»'''
	}
	
	def argsTypesAsStrings(MemberRef ref) {
		"(" + ref.args.map[typeOf?.name].join(", ") + ")"
	}
	
}