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
package ac.soton.xeventb.internal.common;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

/**
 * <p>Abstract class for validating quick fixes to translate untranslated
 * formulae, i.e., predicates, expressions, assignments, types, and values.</p>
 * 
 * <p>Clients must implement the abstract method to set the translated formula
 * for an element</p>
 * 
 * @author htson - Initial API and implementation.
 * @since 2.0
 * @version 0.1
 */
@SuppressWarnings("all")
public abstract class UntranslatedFormulaeQuickFix<T extends EObject> {
  /**
   * Call back method to set the translated formula for the element.
   * 
   * @param element
   * 			the EObject for containing the attribute
   * @param translatedFormulae
   * 			the translated formulae
   */
  public abstract void setFormulae(final EObject element, final String translatedFormulae);
  
  /**
   * Utility method to throw an exception when setting the value for the
   * formulae.
   * 
   * @param element
   * 			the EObject for containing the attribute
   * @param formulaeType
   * 			the type of the formulae, e.g., predicates, assignments, etc.
   */
  protected void exception(final EObject element, final String formulaeType) {
    throw new UnsupportedOperationException(
      ((("Cannot set " + formulaeType) + " for ") + element));
  }
  
  /**
   * Quick fix for untranslated formulae. Offer to replace the formulae
   * by the translated formulae. This is copied from
   * {@link ac.soton.xeventb.xcontext.ui.quickfix.XMachineQuickfixProvider}.
   * 
   * @param issue
   * 			the validation issue
   * @param acceptor
   * 			the issue resolution acceptor
   * @param formulaType
   * 			the type of the formulae, e.g., "predicate", "assignment", etc.
   */
  protected void translateFormulae(final Issue issue, final IssueResolutionAcceptor acceptor, final String formulaeType) {
    final String[] data = issue.getData();
    final String predicate = data[0];
    final String translated = data[1];
    acceptor.accept(issue, 
      ((("Translated " + formulaeType) + " to ") + translated), 
      ((("Change from " + predicate) + " to ") + translated), 
      null, 
      new ISemanticModification() {
        @Override
        public void apply(final EObject element, final IModificationContext context) throws Exception {
          if ((element instanceof EObject)) {
            UntranslatedFormulaeQuickFix.this.setFormulae(element, translated);
          }
          UntranslatedFormulaeQuickFix.this.exception(element, formulaeType);
        }
      });
  }
}
