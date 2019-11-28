package org.xtext.dsl.restaurante.ui;

import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.nodemodel.BidiTreeIterator;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.xtext.dsl.restaurante.restaurante.Restaurante;

public class RestauranteHighlightingCalculator implements ISemanticHighlightingCalculator {

	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor, CancelIndicator cancel) {
		if (resource == null) return;

		INode raiz = resource.getParseResult().getRootNode();
		BidiTreeIterator<INode> it = raiz.getAsTreeIterable().iterator();
		
		while (it.hasNext()) {
			INode node = it.next();
			
			//Elementos gramaticales
			if (node.getGrammarElement() instanceof Keyword) {
				Keyword k = (Keyword)node.getGrammarElement();
				if (k.getValue().equals("Restaurantes") || k.getValue().equals("Ingredientes")) {
					acceptor.addPosition(node.getOffset(), node.getLength(), RestauranteHighlightingConfiguration.PALABRA_CLAVE_PRINCIPAL);
				} 
				else acceptor.addPosition(node.getOffset(), node.getLength(), RestauranteHighlightingConfiguration.PALABRA_CLAVE);
			}
			else if (node.getGrammarElement() instanceof CrossReference) {
				//Completaremos...
			}
			else if (node.getGrammarElement() instanceof TerminalRule) { //reglas descolgadas del árbol
				//Completaremos...
			}
			else if (node.getGrammarElement() instanceof RuleCall) { //todas las reglas del árbol
				RuleCall r = (RuleCall)node.getGrammarElement();
				//Para Java 1.7 --> problemas al exportar plugin si usamos SWITCH
				if (r.getRule().getName().equals("STRING"))
					acceptor.addPosition(node.getOffset(), node.getLength(), RestauranteHighlightingConfiguration.CADENA_TEXTO);
				//Completaremos...
				else acceptor.addPosition(node.getOffset(), node.getLength(), RestauranteHighlightingConfiguration.NORMAL);
			}
			
			//Elementos semánticos
			if (node.getSemanticElement() instanceof Restaurante) {
				//Completaremos...
			} //if
			
		}
	}


}