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
import ac.soton.xeventb.common.quickfixes.QuickFixFactory
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue

/**
 * <p>
 * Custom quick fixes for XMachine.  
 * </p>
 * 
 * @since 2.0
 * @version 1.0
 * @author htson (v1.1) - Initial API and implementation.
 * @author htson (v0.2) - Refactor common quick fixes with XContext
 * @author htson (v1.0) - Updated to use the new QuickFixFactory
 */
class XMachineQuickfixProvider extends DefaultQuickfixProvider {

	/**
	 * Extension instance of {@link QuickFixFactory} to use for getting various
	 * quick fixes. 
	 */
	extension QuickFixFactory quickFixFactory = QuickFixFactory.^default

	/**
	 * Quick fix for untranslated assignments. Offer to replace the assignment
	 * by the translated formula.
	 * 
	 * @param issue
	 * 			the validation issue for the assignment element.
	 * @param acceptor
	 * 			the issue resolution acceptor
	 * @see QuickFixFactory#getUntranslatedAssignmentQuickFix()
	 */
	@Fix(IValidationIssueCode.UNTRANSLATED_ASSIGNMENT)
	def fixUntranslatedAssignment(Issue issue, IssueResolutionAcceptor acceptor) {
		untranslatedAssignmentQuickFix.fix(issue, acceptor)
	}

	/**
	 * Quick fix for untranslated expressions. Offer to replace the expression
	 * by the translated formula.
	 * 
	 * @param issue
	 * 			the validation issue for the expression element.
	 * @param acceptor
	 * 			the issue resolution acceptor
	 * @see QuickFixFactory#getUntranslatedExpressionQuickFix()
	 */
	@Fix(IValidationIssueCode.UNTRANSLATED_EXPRESSION)
	def fixUntranslatedExpression(Issue issue, IssueResolutionAcceptor acceptor) {
		untranslatedExpressionQuickFix.fix(issue, acceptor)
	}

	/**
	 * Quick fix for untranslated predicates. Offer to replace the predicate by
	 * the translated formula.
	 * 
	 * @param issue
	 * 			the validation issue for the predicate element.
	 * @param acceptor
	 * 			the issue resolution acceptor
	 * @see QuickFixFactory#getUntranslatedPredicateQuickFix()
	 */
	@Fix(IValidationIssueCode.UNTRANSLATED_PREDICATE)
	def fixUntranslatedPredicate(Issue issue, IssueResolutionAcceptor acceptor) {
		untranslatedPredicateQuickFix.fix(issue, acceptor)
	}

	/**
	 * Quick fix for untranslated types. Offer to replace the type by the
	 * translated formula.
	 * 
	 * @param issue
	 * 			the validation issue for the type element.
	 * @param acceptor
	 * 			the issue resolution acceptor
	 * @see QuickFixFactory#getUntranslateTypeQuickFix()
	 * @since 3.0
	 */
	@Fix(IValidationIssueCode.UNTRANSLATED_TYPE)
	def fixUntranslatedType(Issue issue, IssueResolutionAcceptor acceptor) {
		untranslatedTypeQuickFix.fix(issue, acceptor)
	}

	/**
	 * Quick fix for untranslated values. Offer to replace the value by the
	 * translated formula.
	 * 
	 * @param issue
	 * 			the validation issue for the value element.
	 * @param acceptor
	 * 			the issue resolution acceptor
	 * @see QuickFixFactory#getUntranslatedValueQuickFix()
	 * @since 3.0
	 */
	@Fix(IValidationIssueCode.UNTRANSLATED_VALUE)
	def fixedUntranslatedValue(Issue issue, IssueResolutionAcceptor acceptor) {
		untranslatedValueQuickFix.fix(issue, acceptor)
	}

}
