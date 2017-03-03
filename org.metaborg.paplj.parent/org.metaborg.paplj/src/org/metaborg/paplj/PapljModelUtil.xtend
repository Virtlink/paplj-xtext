package org.metaborg.paplj

import org.eclipse.xtext.AbstractElement
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import static extension org.eclipse.xtext.EcoreUtil2.*
import org.metaborg.paplj.paplj.*
import org.eclipse.emf.ecore.EObject
import org.metaborg.paplj.types.PapljTypeProvider
import org.metaborg.paplj.lib.PapljLib
import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider

/**
 * Utility functions for working with the PAPLJ model.
 */
class PapljModelUtil {
	
	def static asLet(Expr e) {
		e as Let
	}
	
	/**
	 * Returns the fields in a class.
	 */
	def static fields(Type c) {
		c.members.filter(Field)
	}
	
	/**
	 * Returns the methods in a class.
	 */
	def static methods(Type c) {
		c.members.filter(Method)
	}
	
	/**
	 * Gets the program that contains the specified object.
	 */
	def static containingProgram(EObject e) {
		e.getContainerOfType(Program)
	}
	
	/**
	 * Gets the class that contains the specified object.
	 */
	def static containingClass(EObject e) {
		e.getContainerOfType(Type)
	}
	
	/**
	 * Gets the method that contains the specified object.
	 */
	def static containingMethod(EObject e) {
		e.getContainerOfType(Method)
	}
	
	/**
	 * Gets the block that contains the specified object.
	 */
	def static containingBlock(EObject e) {
		e.getContainerOfType(Block2)
	}
	
	/**
	 * Returns the distinct ancestors of the specified class,
	 * starting at the direct parent of the class.
	 */
	def static ancestors(Type c) {
		val visited = <Type>newArrayList()
		
		var current = c.superType
		while (current !== null && !visited.contains(current)) {
			visited.add(current)
			current = current.superType
		}
		
		visited
	}
	
	/**
	 * Returns the let-expressions that contain the specified expression,
	 * starting at the let-expression that contains the expression.
	 */
	def static lets(Expr e) {
		val visited = <Let>newArrayList()
		
		var current = e.getContainerOfType(Let)
		while (current !== null) {
			visited.add(current)
			current = current.getContainerOfType(Let)
		}
		
		visited
	}
	
}