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

import ac.soton.eventb.emf.core.extension.coreextension.Type;
import ac.soton.xeventb.internal.common.UntranslatedFormulaeQuickFix;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

/**
 * An implementation for quick fixes to translate untranslated types.
 * 
 * @since 2.0
 * @version 1.0
 * @author htson - Initial API and implementation.
 */
@SuppressWarnings("all")
public class UntranslatedTypeQuickFix extends UntranslatedFormulaeQuickFix<Type> {
  private static String FORMULA_TYPE = "type";
  
  /**
   * Implementation of the abstract method to set the type of an Event-B
   * type element to the translated formulae.
   * 
   * @param element
   * 			the {@link Type} for containing the type
   * @param translatedFormulae
   * 			the translated formulae
   * @throw {@link UnsupportedOperationException} if the input element is not
   * 			a {@link Type}.
   */
  @Override
  public void setFormulae(final EObject element, final String translatedFormula) {
    if ((element instanceof Type)) {
      ((Type)element).setType(translatedFormula);
    } else {
      this.exception(element, UntranslatedTypeQuickFix.FORMULA_TYPE);
    }
  }
  
  /**
   * Quick fix for untranslated types. Offer to replace the type with the
   * translated formulae.
   * 
   * @param issue
   * 			the validation issue for the type element.
   * @param acceptor
   * 			the issue resolution acceptor
   * @see UntranslatedFormulaeQuickfix#translateFormulae(Issue, IssueResolutionAcceptor, String)
   */
  public void translateType(final Issue issue, final IssueResolutionAcceptor acceptor) {
    this.translateFormulae(issue, acceptor, UntranslatedTypeQuickFix.FORMULA_TYPE);
  }
}
