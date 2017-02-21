package org.metaborg.paplj.scoping

import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider
import org.eclipse.xtext.scoping.impl.ImportNormalizer
import org.eclipse.xtext.naming.QualifiedName

class PapljImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {

	public static final QualifiedName PAPLJ_LIB = QualifiedName::create("paplj", "lang");

	override protected getImplicitImports(boolean ignoreCase) {
		newArrayList(
			new ImportNormalizer(PAPLJ_LIB, true, ignoreCase)
		)
	}
	
}