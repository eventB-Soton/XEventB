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
import ac.soton.xeventb.common.UntranslatedFormlaeQuickfix
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue

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
	 * Extension instance of {@link UntranslatedFormlaeQuickfix} to use for 
	 * quick fixes. 
	 */
	extension UntranslatedFormlaeQuickfix quickfix =
			new UntranslatedFormlaeQuickfix()

	/**
	 * Quick fix for untranslated predicates. Offer to replace the predicate by
	 * the translated formula. This is delegated to the extension method of
	 * {@link XContextQuickfixProvider#quickfix}.
	 */
	@Fix(IValidationIssueCode.UNTRANSLATED_PREDICATE)
	def fixUntranslatedPredicate(Issue issue, IssueResolutionAcceptor acceptor) {
		translatePredicate(issue, acceptor)
	}

	/**
	 * Quick fix for untranslated types. Offer to replace the type by
	 * the translated formula. This is delegated to the extension method of
	 * {@link XContextQuickfixProvider#quickfix}.
	 */
	@Fix(IValidationIssueCode.UNTRANSLATED_TYPE)
	def fixUntranslatedType(Issue issue, IssueResolutionAcceptor acceptor) {
		translateType(issue, acceptor)
	}

	/**
	 * Quick fix for untranslated types. Offer to replace the type by
	 * the translated formula. This is delegated to the extension method of
	 * {@link XContextQuickfixProvider#quickfix}.
	 */
	@Fix(IValidationIssueCode.UNTRANSLATED_VALUE)
	def fixedUntranslatedValue(Issue issue, IssueResolutionAcceptor acceptor) {
		translateValue(issue, acceptor)
	}
}
