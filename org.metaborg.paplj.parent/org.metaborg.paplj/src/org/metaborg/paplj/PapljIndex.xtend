package org.metaborg.paplj

import com.google.inject.Inject
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider
import org.eclipse.emf.ecore.EObject

/**
 * Index.
 */
class PapljIndex {
	
	@Inject ResourceDescriptionsProvider rdp
	
	/**
	 * Gets the index with object descriptions of the
	 * specified resource, and returns the object description
	 * of the resource based on its URI.
	 */
	def getResourceDescription(EObject o) {
		val index = rdp.getResourceDescriptions(o.eResource)
		index.getResourceDescription(o.eResource.URI)
	}
	
	/**
	 * Gets a list of object descriptions that are
	 * externally visible.
	 */
	def getExportedDescriptions(EObject o) {
		o.getResourceDescription.exportedObjects
	}
	
}