/*
 * generated by Xtext 2.11.0
 */
package org.metaborg.paplj.idea.highlighting;

import org.eclipse.xtext.idea.highlighting.SemanticHighlightVisitor;
import org.metaborg.paplj.idea.lang.PapljLanguage;

public class PapljSemanticHighlightVisitor extends SemanticHighlightVisitor {
	public PapljSemanticHighlightVisitor() {
		PapljLanguage.INSTANCE.injectMembers(this);
	}
}