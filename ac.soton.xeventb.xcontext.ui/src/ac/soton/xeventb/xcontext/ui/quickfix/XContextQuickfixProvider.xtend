/*******************************************************************************
 * Copyright (c) 2020 University of Southampton.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     University of Southampton - initial API and implementation
 *******************************************************************************/

package ac.soton.xeventb.xcontext.ui.quickfix

import ac.soton.xeventb.common.IValidationIssueCode
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue
import ac.soton.xeventb.common.quickfixes.UntranslatedPredicateQuickFix
import ac.soton.xeventb.common.quickfixes.UntranslatedTypeQuickFix
import ac.soton.xeventb.common.quickfixes.UntranslatedValueQuickFix

/**
 * <p>
 * This class provides custom quick fixes for the XContexts.
 * </p>
 *
 * @author htson (v0.1) - Initial API and Implementation
 * @author htson (v0.2) - Refactor common quick fixes with XMachine
 * @version 0.2 
 * @since 2.0
 */
class XContextQuickfixProvider extends DefaultQuickfixProvider {

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
	 * Quick fix for untranslated types. Offer to replace the type by
	 * the translated formula.
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
	 * Quick fix for untranslated types. Offer to replace the type by
	 * the translated formula.
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
