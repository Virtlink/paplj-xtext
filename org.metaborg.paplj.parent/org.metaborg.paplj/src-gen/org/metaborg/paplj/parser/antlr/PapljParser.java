/*
 * generated by Xtext 2.11.0
 */
package org.metaborg.paplj.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.metaborg.paplj.parser.antlr.internal.InternalPapljParser;
import org.metaborg.paplj.services.PapljGrammarAccess;

public class PapljParser extends AbstractAntlrParser {

	@Inject
	private PapljGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalPapljParser createParser(XtextTokenStream stream) {
		return new InternalPapljParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Program";
	}

	public PapljGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PapljGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
