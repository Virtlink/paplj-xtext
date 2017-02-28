package org.metaborg.paplj.lib

import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.common.util.URI

/**
 * Put the library in a source folder in the root of the project,
 * in subfolders that corresponds to the package of the library
 * (e.g. paplj/lang). 
 */
class PapljLib {
	
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
	public val static LIB_BOOL		= LIB_PACKAGE + ".Bool"
	public val static LIB_NUM		= LIB_PACKAGE + ".Num"
	
}