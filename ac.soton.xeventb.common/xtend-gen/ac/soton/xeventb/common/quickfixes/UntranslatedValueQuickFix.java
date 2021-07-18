/**
 * Copyright (c) 2021 University of Southampton.
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
package ac.soton.xeventb.common.quickfixes;

import ac.soton.eventb.emf.core.extension.coreextension.Value;
import ac.soton.xeventb.internal.common.UntranslatedFormulaeQuickFix;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

/**
 * An implementation for quick fixes to translate untranslated values.
 * 
 * @author htson - Initial API and implementation.
 * @version 0.1
 * @since 2.0
 */
@SuppressWarnings("all")
public class UntranslatedValueQuickFix extends UntranslatedFormulaeQuickFix<Value> {
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
    }
    this.exception(element, UntranslatedValueQuickFix.FORMULA_TYPE);
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
  public void translateValue(final Issue issue, final IssueResolutionAcceptor acceptor) {
    this.translateFormulae(issue, acceptor, UntranslatedValueQuickFix.FORMULA_TYPE);
  }
}
