package org.metaborg.paplj;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.metaborg.paplj.paplj.PapljPackage;

/**
 * Index.
 */
@SuppressWarnings("all")
public class PapljIndex {
  @Inject
  private ResourceDescriptionsProvider rdp;
  
  @Inject
  private IContainer.Manager cm;
  
  /**
   * Gets the index with object descriptions of the
   * specified resource, and returns the object description
   * of the resource based on its URI.
   */
  public IResourceDescription getResourceDescription(final EObject obj) {
    IResourceDescription _xblockexpression = null;
    {
      final IResourceDescriptions index = this.rdp.getResourceDescriptions(obj.eResource());
      _xblockexpression = index.getResourceDescription(obj.eResource().getURI());
    }
    return _xblockexpression;
  }
  
  /**
   * Gets a list of object descriptions that are
   * externally visible.
   */
  public Iterable<IEObjectDescription> getExportedDescriptions(final EObject obj) {
    return this.getResourceDescription(obj).getExportedObjects();
  }
  
  public Iterable<IEObjectDescription> getVisibleTypeDescriptions(final EObject obj) {
    return this.getVisibleDescriptions(obj, PapljPackage.eINSTANCE.getType());
  }
  
  public Iterable<IEObjectDescription> getVisibleDescriptions(final EObject obj) {
    final Function1<IContainer, Iterable<IEObjectDescription>> _function = (IContainer container) -> {
      return container.getExportedObjects();
    };
    return Iterables.<IEObjectDescription>concat(ListExtensions.<IContainer, Iterable<IEObjectDescription>>map(this.getVisibleContainers(obj), _function));
  }
  
  public Iterable<IEObjectDescription> getVisibleDescriptions(final EObject o, final EClass type) {
    final Function1<IContainer, Iterable<IEObjectDescription>> _function = (IContainer container) -> {
      return container.getExportedObjectsByType(type);
    };
    return Iterables.<IEObjectDescription>concat(ListExtensions.<IContainer, Iterable<IEObjectDescription>>map(this.getVisibleContainers(o), _function));
  }
  
  public List<IContainer> getVisibleContainers(final EObject obj) {
    List<IContainer> _xblockexpression = null;
    {
      final IResourceDescriptions index = this.rdp.getResourceDescriptions(obj.eResource());
      final IResourceDescription rd = index.getResourceDescription(obj.eResource().getURI());
      if ((rd == null)) {
        return CollectionLiterals.<IContainer>emptyList();
      }
      _xblockexpression = this.cm.getVisibleContainers(rd, index);
    }
    return _xblockexpression;
  }
}
