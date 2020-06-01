/*******************************************************************************
 *  Copyright (c) 2017, 2020 University of Southampton.
 *
 *  This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *
 *  SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *    University of Southampton - initial API and implementation
 *******************************************************************************/

package ac.soton.xeventb.xmachine.ui.quickfix

import ac.soton.xeventb.common.IValidationIssueCode
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue
import org.eventb.emf.core.EventBAction
import org.eventb.emf.core.EventBExpression
import org.eventb.emf.core.EventBPredicate

/**
 * <p>
 * Custom quick fixes for XMachine.  
 * </p>
 * 
 * @author htson - Added quick fix for untranslated formulae.
 * @version 0.1
 * @since 2.0
 */
class XMachineQuickfixProvider extends DefaultQuickfixProvider {

	/**
	 * Quick fix for untranslated predicates. Offer to replace the predicate by
	 * the translated formula.
	 */
	@Fix(IValidationIssueCode.UNTRANSLATED_PREDICATE)
	def translatePredicate(Issue issue, IssueResolutionAcceptor acceptor) {
		val String[] data = issue.data
		val predicate = data.get(0)
		val translated = data.get(1)
		acceptor.accept(issue, "Translated Predicate to " + translated,
			 "Change from " + predicate + " to " + translated, null,
			 new ISemanticModification() {
				override apply(EObject element, IModificationContext context)
						throws Exception {
					if (element instanceof EventBPredicate) {
						element.predicate = translated
					}
				}

			});
	}

	/**
	 * Quick fix for untranslated expressions. Offer to replace the expression by
	 * the translated formula.
	 */
	@Fix(IValidationIssueCode.UNTRANSLATED_EXPRESSION)
	def translateExpression(Issue issue, IssueResolutionAcceptor acceptor) {
		val String[] data = issue.data
		val expression = data.get(0)
		val translated = data.get(1)
		acceptor.accept(issue, "Translated Expression to " + translated,
			 "Change from " + expression + " to " + translated, null,
			 new ISemanticModification() {
				override apply(EObject element, IModificationContext context)
						throws Exception {
					if (element instanceof EventBExpression) {
						element.expression = translated
					}
				}

			});
	}

	/**
	 * Quick fix for untranslated assignments. Offer to replace the assignment by
	 * the translated formula.
	 */
	@Fix(IValidationIssueCode.UNTRANSLATED_ASSIGNMENT)
	def translateAssignment(Issue issue, IssueResolutionAcceptor acceptor) {
		val String[] data = issue.data
		val assignment = data.get(0)
		val translated = data.get(1)
		acceptor.accept(issue, "Translated Assignment to " + translated,
			 "Change from " + assignment + " to " + translated, null,
			 new ISemanticModification() {
				override apply(EObject element, IModificationContext context)
						throws Exception {
					if (element instanceof EventBAction) {
						element.action = translated
					}
				}

			});
	}

}
