/*******************************************************************************
 *  Copyright (c) 2021 University of Southampton.
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
package ac.soton.xeventb.common

import ac.soton.eventb.emf.core.^extension.coreextension.Type
import ac.soton.eventb.emf.core.^extension.coreextension.Value
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue
import org.eventb.emf.core.EventBAction
import org.eventb.emf.core.EventBExpression
import org.eventb.emf.core.EventBPredicate

/**
 * Abstract class for validating quick fixes to translate untranslated formulae,
 * i.e., predicates, expressions, assignments, types, and values.
 * 
 * @author htson - Initial API and implementation.
 * @since 2.0
 */
class UntranslatedFormulaeQuickfix {

	/**
	 * Quick fix for untranslated predicates. Offer to replace the predicate by
	 * the translated formula. This is copied from
	 * {@link ac.soton.xeventb.xcontext.ui.quickfix.XContextQuickfixProvider}.
	 */
	def translatePredicate(Issue issue, IssueResolutionAcceptor acceptor) {
		val String[] data = issue.data
		val predicate = data.get(0)
		val translated = data.get(1)
		acceptor.accept(issue, "Translated Predicate to " + translated,
			"Change from " + predicate + " to " + translated, null,
					new ISemanticModification() {
						override apply(EObject element,
								IModificationContext context) throws Exception {
							if (element instanceof EventBPredicate) {
								element.predicate = translated
							}
						}
					}
		)
	}

	/**
	 * Quick fix for untranslated expressions. Offer to replace the expression
	 * by the translated formula. This is copied from
	 * {@link ac.soton.xeventb.xcontext.ui.quickfix.XMachineQuickfixProvider}.
	 */
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
	 * Quick fix for untranslated assignments. Offer to replace the assignment
	 * by the translated formula. This is copied from
	 * {@link ac.soton.xeventb.xcontext.ui.quickfix.XMachineQuickfixProvider}.
	 */
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

	/**
	 * Quick fix for untranslated types. Offer to replace the type by the
	 * translated formula. This is copied from
	 * {@link ac.soton.xeventb.xcontext.ui.quickfix.XContextQuickfixProvider}.
	 */
	def translateType(Issue issue, IssueResolutionAcceptor acceptor) {
		val String[] data = issue.data
		val type = data.get(0)
		val translated = data.get(1)
		acceptor.accept(issue, "Translated type to " + translated,
			 "Change from " + type + " to " + translated, null,
			 new ISemanticModification() {
				override apply(EObject element, IModificationContext context)
						throws Exception {
					if (element instanceof Type) {
						element.type = translated
					}
				}

			});
	}

	/**
	 * Quick fix for untranslated values. Offer to replace the value by the
	 * translated formula. This is copied from
	 * {@link ac.soton.xeventb.xcontext.ui.quickfix.XContextQuickfixProvider}.
	 */
	def translateValue(Issue issue, IssueResolutionAcceptor acceptor) {
		val String[] data = issue.data
		val value = data.get(0)
		val translated = data.get(1)
		acceptor.accept(issue, "Translated value to " + translated,
			 "Change from " + value + " to " + translated, null,
			 new ISemanticModification() {
				override apply(EObject element, IModificationContext context)
						throws Exception {
					if (element instanceof Value) {
						element.value = translated
					}
				}

			});
	}

}
