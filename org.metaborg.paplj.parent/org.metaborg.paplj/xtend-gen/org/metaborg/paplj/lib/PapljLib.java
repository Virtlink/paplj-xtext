package org.metaborg.paplj.lib;

import com.google.inject.Inject;
import com.google.inject.Provider;
import java.io.InputStream;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * Put the library in a source folder in the root of the project,
 * in subfolders that corresponds to the package of the library
 * (e.g. paplj/lang).
 */
@SuppressWarnings("all")
public class PapljLib {
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
  
  public final static String LIB_BOOL = (PapljLib.LIB_PACKAGE + ".Bool");
  
  public final static String LIB_NUM = (PapljLib.LIB_PACKAGE + ".Num");
}
