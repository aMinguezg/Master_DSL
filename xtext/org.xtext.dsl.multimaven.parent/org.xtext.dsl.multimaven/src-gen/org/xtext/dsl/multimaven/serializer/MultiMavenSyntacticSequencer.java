/*
 * generated by Xtext 2.19.0
 */
package org.xtext.dsl.multimaven.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.dsl.multimaven.services.MultiMavenGrammarAccess;

@SuppressWarnings("all")
public class MultiMavenSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MultiMavenGrammarAccess grammarAccess;
	protected AbstractElementAlias match_DirectorioPadre___DependenciasKeyword_11_0_LeftSquareBracketKeyword_11_1_RightSquareBracketKeyword_11_3__q;
	protected AbstractElementAlias match_DirectorioPadre___PluginsKeyword_12_0_LeftSquareBracketKeyword_12_1_RightSquareBracketKeyword_12_3__q;
	protected AbstractElementAlias match_Directorio___DependenciasKeyword_9_0_LeftSquareBracketKeyword_9_1_RightSquareBracketKeyword_9_3__q;
	protected AbstractElementAlias match_Directorio___PluginsKeyword_10_0_LeftSquareBracketKeyword_10_1_RightSquareBracketKeyword_10_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MultiMavenGrammarAccess) access;
		match_DirectorioPadre___DependenciasKeyword_11_0_LeftSquareBracketKeyword_11_1_RightSquareBracketKeyword_11_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDirectorioPadreAccess().getDependenciasKeyword_11_0()), new TokenAlias(false, false, grammarAccess.getDirectorioPadreAccess().getLeftSquareBracketKeyword_11_1()), new TokenAlias(false, false, grammarAccess.getDirectorioPadreAccess().getRightSquareBracketKeyword_11_3()));
		match_DirectorioPadre___PluginsKeyword_12_0_LeftSquareBracketKeyword_12_1_RightSquareBracketKeyword_12_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDirectorioPadreAccess().getPluginsKeyword_12_0()), new TokenAlias(false, false, grammarAccess.getDirectorioPadreAccess().getLeftSquareBracketKeyword_12_1()), new TokenAlias(false, false, grammarAccess.getDirectorioPadreAccess().getRightSquareBracketKeyword_12_3()));
		match_Directorio___DependenciasKeyword_9_0_LeftSquareBracketKeyword_9_1_RightSquareBracketKeyword_9_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDirectorioAccess().getDependenciasKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getDirectorioAccess().getLeftSquareBracketKeyword_9_1()), new TokenAlias(false, false, grammarAccess.getDirectorioAccess().getRightSquareBracketKeyword_9_3()));
		match_Directorio___PluginsKeyword_10_0_LeftSquareBracketKeyword_10_1_RightSquareBracketKeyword_10_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDirectorioAccess().getPluginsKeyword_10_0()), new TokenAlias(false, false, grammarAccess.getDirectorioAccess().getLeftSquareBracketKeyword_10_1()), new TokenAlias(false, false, grammarAccess.getDirectorioAccess().getRightSquareBracketKeyword_10_3()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_DirectorioPadre___DependenciasKeyword_11_0_LeftSquareBracketKeyword_11_1_RightSquareBracketKeyword_11_3__q.equals(syntax))
				emit_DirectorioPadre___DependenciasKeyword_11_0_LeftSquareBracketKeyword_11_1_RightSquareBracketKeyword_11_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DirectorioPadre___PluginsKeyword_12_0_LeftSquareBracketKeyword_12_1_RightSquareBracketKeyword_12_3__q.equals(syntax))
				emit_DirectorioPadre___PluginsKeyword_12_0_LeftSquareBracketKeyword_12_1_RightSquareBracketKeyword_12_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Directorio___DependenciasKeyword_9_0_LeftSquareBracketKeyword_9_1_RightSquareBracketKeyword_9_3__q.equals(syntax))
				emit_Directorio___DependenciasKeyword_9_0_LeftSquareBracketKeyword_9_1_RightSquareBracketKeyword_9_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Directorio___PluginsKeyword_10_0_LeftSquareBracketKeyword_10_1_RightSquareBracketKeyword_10_3__q.equals(syntax))
				emit_Directorio___PluginsKeyword_10_0_LeftSquareBracketKeyword_10_1_RightSquareBracketKeyword_10_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('Dependencias' '[' ']')?
	 *
	 * This ambiguous syntax occurs at:
	 *     packaging=Packaging (ambiguity) 'Plugins' '[' plugins+=Plugin
	 *     packaging=Packaging (ambiguity) ('Plugins' '[' ']')? 'Hijos' '[' ']' '}' (rule end)
	 *     packaging=Packaging (ambiguity) ('Plugins' '[' ']')? 'Hijos' '[' directorios+=Directorio
	 *     version=VERSION (ambiguity) 'Plugins' '[' plugins+=Plugin
	 *     version=VERSION (ambiguity) ('Plugins' '[' ']')? 'Hijos' '[' ']' '}' (rule end)
	 *     version=VERSION (ambiguity) ('Plugins' '[' ']')? 'Hijos' '[' directorios+=Directorio
	 */
	protected void emit_DirectorioPadre___DependenciasKeyword_11_0_LeftSquareBracketKeyword_11_1_RightSquareBracketKeyword_11_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('Plugins' '[' ']')?
	 *
	 * This ambiguous syntax occurs at:
	 *     dependencias+=Dependencia ']' (ambiguity) 'Hijos' '[' ']' '}' (rule end)
	 *     dependencias+=Dependencia ']' (ambiguity) 'Hijos' '[' directorios+=Directorio
	 *     packaging=Packaging ('Dependencias' '[' ']')? (ambiguity) 'Hijos' '[' ']' '}' (rule end)
	 *     packaging=Packaging ('Dependencias' '[' ']')? (ambiguity) 'Hijos' '[' directorios+=Directorio
	 *     version=VERSION ('Dependencias' '[' ']')? (ambiguity) 'Hijos' '[' ']' '}' (rule end)
	 *     version=VERSION ('Dependencias' '[' ']')? (ambiguity) 'Hijos' '[' directorios+=Directorio
	 */
	protected void emit_DirectorioPadre___PluginsKeyword_12_0_LeftSquareBracketKeyword_12_1_RightSquareBracketKeyword_12_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('Dependencias' '[' ']')?
	 *
	 * This ambiguous syntax occurs at:
	 *     packaging=Packaging (ambiguity) 'Plugins' '[' plugins+=Plugin
	 *     packaging=Packaging (ambiguity) ('Plugins' '[' ']')? '}' (rule end)
	 *     version=VERSION (ambiguity) 'Plugins' '[' plugins+=Plugin
	 *     version=VERSION (ambiguity) ('Plugins' '[' ']')? '}' (rule end)
	 */
	protected void emit_Directorio___DependenciasKeyword_9_0_LeftSquareBracketKeyword_9_1_RightSquareBracketKeyword_9_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('Plugins' '[' ']')?
	 *
	 * This ambiguous syntax occurs at:
	 *     dependencias+=Dependencia ']' (ambiguity) '}' (rule end)
	 *     packaging=Packaging ('Dependencias' '[' ']')? (ambiguity) '}' (rule end)
	 *     version=VERSION ('Dependencias' '[' ']')? (ambiguity) '}' (rule end)
	 */
	protected void emit_Directorio___PluginsKeyword_10_0_LeftSquareBracketKeyword_10_1_RightSquareBracketKeyword_10_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
