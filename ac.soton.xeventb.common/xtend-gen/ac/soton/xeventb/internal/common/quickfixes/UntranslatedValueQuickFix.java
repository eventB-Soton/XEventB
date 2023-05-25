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

import ac.soton.eventb.emf.core.extension.coreextension.Value;
import ac.soton.xeventb.common.quickfixes.IQuickFix;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

/**
 * An implementation of {@link IQuickFix} based on
 * {@link UntranslatedFormulaeQuickFix} to fix untranslated values in
 * {@link Value} elements.
 * 
 * @since 2.0
 * @version 1.0
 * @author htson - Initial API and implementation.
 */
@SuppressWarnings("all")
public class UntranslatedValueQuickFix extends UntranslatedFormulaeQuickFix<Value> implements IQuickFix {
  private static String FORMULA_TYPE = "value";

  /**
   * Implementation of the abstract method to set the value of an Event-B
   * value element to the translated formulae.
   * 
   * @param element
   * 			the {@link Value} for containing the value
   * @param translatedFormulae
   * 			the translated formulae
   * @throw {@link UnsupportedOperationException} if the input element is not
   * 			an {@link Value}.
   */
  @Override
  public void setFormulae(final EObject element, final String translatedFormula) {
    if ((element instanceof Value)) {
      ((Value)element).setValue(translatedFormula);
    } else {
      this.exception(element, UntranslatedValueQuickFix.FORMULA_TYPE);
    }
  }

  /**
   * Quick fix for untranslated values. Offer to replace the type with the
   * translated formulae.
   * 
   * @param issue
   * 			the validation issue for the value element.
   * @param acceptor
   * 			the issue resolution acceptor
   * @see UntranslatedFormulaeQuickfix#translateFormulae(Issue, IssueResolutionAcceptor, String)
   */
  @Override
  public void fix(final Issue issue, final IssueResolutionAcceptor acceptor) {
    this.translateFormulae(issue, acceptor, UntranslatedValueQuickFix.FORMULA_TYPE);
  }
}
