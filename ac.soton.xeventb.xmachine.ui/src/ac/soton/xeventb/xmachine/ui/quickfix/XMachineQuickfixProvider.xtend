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
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue
import ac.soton.xeventb.common.quickfixes.UntranslatedAssignmentQuickFix
import ac.soton.xeventb.common.quickfixes.UntranslatedExpressionQuickFix
import ac.soton.xeventb.common.quickfixes.UntranslatedPredicateQuickFix
import ac.soton.xeventb.common.quickfixes.UntranslatedTypeQuickFix
import ac.soton.xeventb.common.quickfixes.UntranslatedValueQuickFix

/**
 * <p>
 * Custom quick fixes for XMachine.  
 * </p>
 * 
 * @author htson (v0.1) - Initial API and implementation.
 * @author htson (v0.2) - Refactor common quick fixes with XContext
 * @version 0.2
 * @since 2.0
 */
class XMachineQuickfixProvider extends DefaultQuickfixProvider {

	/**
	 * Extension instance of {@link UntranslatedAssignmentQuickFix} to use for 
	 * assignment quick fixes. 
	 */
	extension UntranslatedAssignmentQuickFix assignmentQuickFix =
			new UntranslatedAssignmentQuickFix()

	/**
	 * Extension instance of {@link UntranslatedExpressionQuickFix} to use for 
	 * expression quick fixes. 
	 */
	extension UntranslatedExpressionQuickFix expressionQuickFix =
			new UntranslatedExpressionQuickFix()

	/**
	 * Extension instance of {@link UntranslatedPredicateQuickFix} to use for 
	 * predicate quick fixes. 
	 */
	extension UntranslatedPredicateQuickFix predicateQuickFix =
			new UntranslatedPredicateQuickFix()

	/**
	 * Extension instance of {@link UntranslatedTypeQuickFix} to use for 
	 * type quick fixes. 
	 */
	extension UntranslatedTypeQuickFix typeQuickFix =
			new UntranslatedTypeQuickFix()

	/**
	 * Extension instance of {@link UntranslatedValueQuickFix} to use for 
	 * value quick fixes. 
	 */
	extension UntranslatedValueQuickFix valueQuickFix =
			new UntranslatedValueQuickFix()

	/**
	 * Quick fix for untranslated assignments. Offer to replace the assignment
	 * by the translated formula.
	 * 
	 * @param issue
	 * 			the validation issue for the assignment element.
	 * @param acceptor
	 * 			the issue resolution acceptor
	 * @see UntranslatedPredicateQuickFix#translatePredicate(Issue, IssueResolutionAcceptor)
	 */
	@Fix(IValidationIssueCode.UNTRANSLATED_ASSIGNMENT)
	def fixUntranslatedAssignment(Issue issue, IssueResolutionAcceptor acceptor) {
		translateAssignment(issue, acceptor)
	}

	/**
	 * Quick fix for untranslated expressions. Offer to replace the expression
	 * by the translated formula.
	 * 
	 * @param issue
	 * 			the validation issue for the expression element.
	 * @param acceptor
	 * 			the issue resolution acceptor
	 * @see UntranslatedPredicateQuickFix#translatePredicate(Issue, IssueResolutionAcceptor)
	 */
	@Fix(IValidationIssueCode.UNTRANSLATED_EXPRESSION)
	def fixUntranslatedExpression(Issue issue, IssueResolutionAcceptor acceptor) {
		translateExpression(issue, acceptor)
	}

	/**
	 * Quick fix for untranslated predicates. Offer to replace the predicate by
	 * the translated formula.
	 * 
	 * @param issue
	 * 			the validation issue for the predicate element.
	 * @param acceptor
	 * 			the issue resolution acceptor
	 * @see UntranslatedPredicateQuickFix#translatePredicate(Issue, IssueResolutionAcceptor)
	 */
	@Fix(IValidationIssueCode.UNTRANSLATED_PREDICATE)
	def fixUntranslatedPredicate(Issue issue, IssueResolutionAcceptor acceptor) {
		translatePredicate(issue, acceptor)
	}

	/**
	 * Quick fix for untranslated types. Offer to replace the type by the
	 * translated formula.
	 * 
	 * @param issue
	 * 			the validation issue for the type element.
	 * @param acceptor
	 * 			the issue resolution acceptor
	 * @see UntranslatedTypeQuickFix#translateType(Issue, IssueResolutionAcceptor)
	 * @since 3.0
	 */
	@Fix(IValidationIssueCode.UNTRANSLATED_TYPE)
	def fixUntranslatedType(Issue issue, IssueResolutionAcceptor acceptor) {
		translateType(issue, acceptor)
	}

	/**
	 * Quick fix for untranslated values. Offer to replace the value by the
	 * translated formula.
	 * 
	 * @param issue
	 * 			the validation issue for the value element.
	 * @param acceptor
	 * 			the issue resolution acceptor
	 * @see UntranslatedValueQuickFix#translateValue(Issue, IssueResolutionAcceptor)
	 * @since 3.0
	 */
	@Fix(IValidationIssueCode.UNTRANSLATED_VALUE)
	def fixedUntranslatedValue(Issue issue, IssueResolutionAcceptor acceptor) {
		translateValue(issue, acceptor)
	}

}
