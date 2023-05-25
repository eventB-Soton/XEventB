/**
 * Copyright (c) 2021, 2022 University of Southampton.
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
 */
package ac.soton.xeventb.internal.common.quickfixes;

import ac.soton.xeventb.common.quickfixes.IQuickFix;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.eventb.emf.core.EventBExpression;

/**
 * An implementation for quick fixes to translate untranslated expressions.
 * 
 * @since 2.0
 * @version 1.0
 * @author htson - v1.0 - Initial API and implementation.
 */
@SuppressWarnings("all")
public class UntranslatedExpressionQuickFix extends UntranslatedFormulaeQuickFix<EventBExpression> implements IQuickFix {
  private static String FORMULA_TYPE = "expression";

  /**
   * Implementation of the abstract method to set the expression of an Event-B
   * expression element to the translated formulae.
   * 
   * @param element
   * 			the {@link EventBExpression} for containing the expression
   * @param translatedFormulae
   * 			the translated formulae
   * @throw {@link UnsupportedOperationException} if the input element is not
   * 			an {@link EventBExpression}.
   */
  @Override
  public void setFormulae(final EObject element, final String translatedFormula) {
    if ((element instanceof EventBExpression)) {
      ((EventBExpression)element).setExpression(translatedFormula);
    } else {
      this.exception(element, UntranslatedExpressionQuickFix.FORMULA_TYPE);
    }
  }

  /**
   * Quick fix for untranslated expressions. Offer to replace the expression
   * with the translated formulae.
   * 
   * @param issue
   * 			the validation issue for the expression element.
   * @param acceptor
   * 			the issue resolution acceptor
   * @see UntranslatedFormulaeQuickfix#translateFormulae(Issue, IssueResolutionAcceptor, String)
   */
  @Override
  public void fix(final Issue issue, final IssueResolutionAcceptor acceptor) {
    this.translateFormulae(issue, acceptor, UntranslatedExpressionQuickFix.FORMULA_TYPE);
  }
}
