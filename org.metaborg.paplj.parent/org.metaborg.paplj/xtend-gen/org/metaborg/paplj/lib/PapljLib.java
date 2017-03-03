package org.metaborg.paplj.lib;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.google.inject.Provider;
import java.io.InputStream;
import java.util.ArrayList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.metaborg.paplj.PapljIndex;
import org.metaborg.paplj.PapljModelUtil;
import org.metaborg.paplj.paplj.Type;

/**
 * Put the library in a source folder in the root of the project,
 * in subfolders that corresponds to the package of the library
 * (e.g. paplj/lang).
 */
@SuppressWarnings("all")
public class PapljLib {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  @Extension
  private PapljIndex _papljIndex;
  
  @Inject
  private Provider<ResourceSet> resourceSetProvider;
  
  public final static String MAIN_LIB = "paplj/lang/mainlib.pj";
  
  /**
   * Load the library from the JAR.
   */
  public ResourceSet loadLib() {
    ResourceSet _xblockexpression = null;
    {
      final InputStream stream = this.getClass().getClassLoader().getResourceAsStream(PapljLib.MAIN_LIB);
      ResourceSet _get = this.resourceSetProvider.get();
      final Procedure1<ResourceSet> _function = (ResourceSet resourceSet) -> {
        try {
          final Resource resource = resourceSet.createResource(URI.createURI(PapljLib.MAIN_LIB));
          resource.load(stream, resourceSet.getLoadOptions());
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      _xblockexpression = ObjectExtensions.<ResourceSet>operator_doubleArrow(_get, _function);
    }
    return _xblockexpression;
  }
  
  public final static String LIB_PACKAGE = "paplj.lang";
  
  public final static String LIB_ANY = (PapljLib.LIB_PACKAGE + ".Any");
  
  public final static String LIB_NUM = (PapljLib.LIB_PACKAGE + ".Num");
  
  public final static String LIB_BOOL = (PapljLib.LIB_PACKAGE + ".Bool");
  
  public Type getPapljAnyType(final EObject context) {
    Type _xblockexpression = null;
    {
      final Function1<IEObjectDescription, Boolean> _function = (IEObjectDescription it) -> {
        String _string = it.getQualifiedName().toString();
        return Boolean.valueOf(Objects.equal(_string, PapljLib.LIB_ANY));
      };
      final IEObjectDescription desc = IterableExtensions.<IEObjectDescription>findFirst(this._papljIndex.getVisibleTypeDescriptions(context), _function);
      if ((desc == null)) {
        return null;
      }
      EObject obj = desc.getEObjectOrProxy();
      boolean _eIsProxy = obj.eIsProxy();
      if (_eIsProxy) {
        obj = context.eResource().getResourceSet().getEObject(desc.getEObjectURI(), true);
      }
      _xblockexpression = ((Type) obj);
    }
    return _xblockexpression;
  }
  
  public ArrayList<Type> ancestorsWithAny(final Type c) {
    ArrayList<Type> _xblockexpression = null;
    {
      ArrayList<Type> ancestors = PapljModelUtil.ancestors(c);
      Type _last = IterableExtensions.<Type>last(ancestors);
      QualifiedName _fullyQualifiedName = null;
      if (_last!=null) {
        _fullyQualifiedName=this._iQualifiedNameProvider.getFullyQualifiedName(_last);
      }
      String _string = null;
      if (_fullyQualifiedName!=null) {
        _string=_fullyQualifiedName.toString();
      }
      boolean _notEquals = (!Objects.equal(_string, PapljLib.LIB_ANY));
      if (_notEquals) {
        final Type anyType = this.getPapljAnyType(c);
        if ((anyType != null)) {
          ancestors.add(anyType);
        }
      }
      _xblockexpression = ancestors;
    }
    return _xblockexpression;
  }
}
