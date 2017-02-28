package org.metaborg.paplj;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;

/**
 * Index.
 */
@SuppressWarnings("all")
public class PapljIndex {
  @Inject
  private ResourceDescriptionsProvider rdp;
  
  /**
   * Gets the index with object descriptions of the
   * specified resource, and returns the object description
   * of the resource based on its URI.
   */
  public IResourceDescription getResourceDescription(final EObject o) {
    IResourceDescription _xblockexpression = null;
    {
      final IResourceDescriptions index = this.rdp.getResourceDescriptions(o.eResource());
      _xblockexpression = index.getResourceDescription(o.eResource().getURI());
    }
    return _xblockexpression;
  }
  
  /**
   * Gets a list of object descriptions that are
   * externally visible.
   */
  public Iterable<IEObjectDescription> getExportedDescriptions(final EObject o) {
    return this.getResourceDescription(o).getExportedObjects();
  }
}
