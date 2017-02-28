package org.metaborg.paplj;

import com.google.inject.Binder;
import com.google.inject.name.Names;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.metaborg.paplj.AbstractPapljRuntimeModule;
import org.metaborg.paplj.scoping.PapljImportedNamespaceAwareLocalScopeProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class PapljRuntimeModule extends AbstractPapljRuntimeModule {
  @Override
  public void configureIScopeProviderDelegate(final Binder binder) {
    binder.<IScopeProvider>bind(IScopeProvider.class).annotatedWith(Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE)).to(PapljImportedNamespaceAwareLocalScopeProvider.class);
  }
}
