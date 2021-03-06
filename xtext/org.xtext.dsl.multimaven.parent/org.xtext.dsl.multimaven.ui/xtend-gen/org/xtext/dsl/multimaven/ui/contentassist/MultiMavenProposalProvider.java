/**
 * generated by Xtext 2.19.0
 */
package org.xtext.dsl.multimaven.ui.contentassist;

import com.google.common.collect.Iterables;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.dsl.multimaven.multiMaven.Directorio;
import org.xtext.dsl.multimaven.multiMaven.DirectorioPadre;
import org.xtext.dsl.multimaven.ui.contentassist.AbstractMultiMavenProposalProvider;

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
@SuppressWarnings("all")
public class MultiMavenProposalProvider extends AbstractMultiMavenProposalProvider {
  public void completeDirectorio_Name(final Directorio d, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    super.completeDirectorio_Name(d, assignment, context, acceptor);
    EObject _eContainer = d.eContainer();
    DirectorioPadre path = ((DirectorioPadre) _eContainer);
    int _size = IterableExtensions.size(Iterables.<Directorio>filter(path.getDirectorios(), Directorio.class));
    String name = ("Hijo " + Integer.valueOf(_size));
    ICompletionProposal propuesta = this.createCompletionProposal(name, context);
    acceptor.accept(propuesta);
  }
  
  @Override
  public void complete_Dependencia(final EObject o, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    ICompletionProposal propuesta = this.createCompletionProposal("{\r\n\t\t\tGroup = \'Grupo\'\r\n\t \t\tArtifact = \'Artifact-id\'\r\n\t \t\tVersion = \'Version\'\r\n\t  \t\tScope = \'Scope\' (Opcional)\r\n\t\t\t}", context);
    acceptor.accept(propuesta);
  }
  
  @Override
  public void complete_Plugin(final EObject o, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    ICompletionProposal propuesta = this.createCompletionProposal("{\r\n\t\t\tGroup = \'Grupo\'\r\n\t \t\tArtifact = \'Artifact-id\'\r\n\t \t\tVersion = \'Version\'\r\n\t\t\t}", context);
    acceptor.accept(propuesta);
  }
}
