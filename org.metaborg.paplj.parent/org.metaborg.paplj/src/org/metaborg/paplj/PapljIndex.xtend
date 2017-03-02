package org.metaborg.paplj

import com.google.inject.Inject
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.IContainer
import org.metaborg.paplj.paplj.PapljPackage
import org.eclipse.emf.ecore.EClass

/**
 * Index.
 */
class PapljIndex {
	
	@Inject ResourceDescriptionsProvider rdp
	@Inject IContainer$Manager cm
	
	/**
	 * Gets the index with object descriptions of the
	 * specified resource, and returns the object description
	 * of the resource based on its URI.
	 */
	def getResourceDescription(EObject obj) {
		val index = rdp.getResourceDescriptions(obj.eResource)
		index.getResourceDescription(obj.eResource.URI)
	}
	
	/**
	 * Gets a list of object descriptions that are
	 * externally visible.
	 */
	def getExportedDescriptions(EObject obj) {
		obj.resourceDescription.exportedObjects
	}
	
	def getVisibleTypeDescriptions(EObject obj) {
		obj.getVisibleDescriptions(PapljPackage::eINSTANCE.type)
	}
	
	def getVisibleDescriptions(EObject obj) {
		obj.visibleContainers
			.map[container | container.exportedObjects]
			.flatten
	}

	def getVisibleDescriptions(EObject o, EClass type) {
		o.visibleContainers
			.map[container | container.getExportedObjectsByType(type)]
			.flatten
	}
			
	def getVisibleContainers(EObject obj) {
		val index = rdp.getResourceDescriptions(obj.eResource)
		val rd = index.getResourceDescription(obj.eResource.URI)
		if (rd === null)
			return emptyList
		cm.getVisibleContainers(rd, index)
	}
}