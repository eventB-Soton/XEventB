/*******************************************************************************
 *  Copyright (c) 2020 University of Southampton.
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

package ac.soton.xeventb.xcontext.ui.quickfix

import ac.soton.xeventb.common.IValidationIssueCode
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue
import org.eventb.emf.core.EventBPredicate

/**
 * <p>
 * This class provides custom quick fixes for the XContexts.
 * </p>
 *
 * @author htson - Initial Implementation
 * @version 0.1 
 * @since 2.0
 */
class XContextQuickfixProvider extends DefaultQuickfixProvider {

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

}
