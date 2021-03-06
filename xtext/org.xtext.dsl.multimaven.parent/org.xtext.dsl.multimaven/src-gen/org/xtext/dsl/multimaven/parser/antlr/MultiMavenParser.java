/*
 * generated by Xtext 2.19.0
 */
package org.xtext.dsl.multimaven.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.dsl.multimaven.parser.antlr.internal.InternalMultiMavenParser;
import org.xtext.dsl.multimaven.services.MultiMavenGrammarAccess;

public class MultiMavenParser extends AbstractAntlrParser {

	@Inject
	private MultiMavenGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMultiMavenParser createParser(XtextTokenStream stream) {
		return new InternalMultiMavenParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Proyecto";
	}

	public MultiMavenGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MultiMavenGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
