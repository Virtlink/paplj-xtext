package org.metaborg.paplj.lib

import static extension org.metaborg.paplj.PapljModelUtil.*;
import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.common.util.URI
import org.metaborg.paplj.PapljIndex
import org.eclipse.emf.ecore.EObject
import org.metaborg.paplj.paplj.Type
import org.eclipse.xtext.naming.IQualifiedNameProvider

/**
 * Put the library in a source folder in the root of the project,
 * in subfolders that corresponds to the package of the library
 * (e.g. paplj/lang). 
 */
class PapljLib {
	
	@Inject extension IQualifiedNameProvider
	@Inject extension PapljIndex;
	@Inject Provider<ResourceSet> resourceSetProvider;
	
	// Package and filename of the library.
	public val static MAIN_LIB = "paplj/lang/mainlib.pj"
	
	/**
	 * Load the library from the JAR.
	 */
	def loadLib() {
		val stream = class.classLoader.getResourceAsStream(MAIN_LIB)
		resourceSetProvider.get() => [
			resourceSet |
			val resource = resourceSet.createResource(URI::createURI(MAIN_LIB))
			resource.load(stream, resourceSet.loadOptions)
		]
	}
	
	// Pre-defined types.
	public val static LIB_PACKAGE	= "paplj.lang"
	public val static LIB_ANY		= LIB_PACKAGE + ".Any"
	public val static LIB_NUM		= LIB_PACKAGE + ".Num"
	public val static LIB_BOOL		= LIB_PACKAGE + ".Bool"
	
	def getPapljAnyType(EObject context) {
		val desc = context.visibleTypeDescriptions.findFirst[qualifiedName.toString == LIB_ANY]
		if (desc === null)
			return null
		var obj = desc.EObjectOrProxy
		if (obj.eIsProxy)
			obj = context.eResource.resourceSet.getEObject(desc.EObjectURI, true)
		obj as Type
	}
	
	def ancestorsWithAny(Type c) {
		var ancestors = c.ancestors
		if (ancestors.last?.fullyQualifiedName?.toString != PapljLib::LIB_ANY) {
			val anyType = getPapljAnyType(c)
			if (anyType !== null)
				ancestors += anyType
		}
		ancestors
	}
}