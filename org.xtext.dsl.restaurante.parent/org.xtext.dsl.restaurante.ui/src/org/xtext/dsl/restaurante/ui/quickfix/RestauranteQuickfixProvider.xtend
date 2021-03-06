/*
 * generated by Xtext 2.19.0
 */
package org.xtext.dsl.restaurante.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.xtext.dsl.restaurante.validation.RestauranteValidator
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor

/**
 * Custom quickfixes.
 *
 * See https:www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
class RestauranteQuickfixProvider extends DefaultQuickfixProvider {

	@Fix(RestauranteValidator.INVALID_NAME)
	def arreglarNombre(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Reducir nombre', 'Se limitar� el tama�o de nombre al m�ximo sugerido', 'ingrediente.ico') [
			context |
			val xtextDocument = context.xtextDocument
			val nombreActual = xtextDocument.get(issue.offset, issue.length)
			xtextDocument.replace(issue.offset, issue.length, nombreActual.substring(0,18) + '\'')
		]
	}

}
