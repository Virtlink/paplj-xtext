package org.metaborg.paplj.scoping;

import java.util.List;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class PapljImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
  public final static QualifiedName PAPLJ_LIB = QualifiedName.create("paplj", "lang");
  
  @Override
  protected List<ImportNormalizer> getImplicitImports(final boolean ignoreCase) {
    ImportNormalizer _importNormalizer = new ImportNormalizer(PapljImportedNamespaceAwareLocalScopeProvider.PAPLJ_LIB, true, ignoreCase);
    return CollectionLiterals.<ImportNormalizer>newArrayList(_importNormalizer);
  }
}
