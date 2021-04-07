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
package ac.soton.xeventb.common;

import ac.soton.eventb.emf.core.extension.coreextension.Type;
import ac.soton.eventb.emf.core.extension.coreextension.Value;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.eventb.emf.core.EventBAction;
import org.eventb.emf.core.EventBExpression;
import org.eventb.emf.core.EventBPredicate;

/**
 * Abstract class for validating quick fixes to translate untranslated formulae,
 * i.e., predicates, expressions, assignments, types, and values.
 * 
 * @author htson - Initial API and implementation.
 * @since 2.0
 */
@SuppressWarnings("all")
public class UntranslatedFormlaeQuickfix {
  /**
   * Quick fix for untranslated predicates. Offer to replace the predicate by
   * the translated formula. This is copied from
   * {@link ac.soton.xeventb.xcontext.ui.quickfix.XContextQuickfixProvider}.
   */
  public void translatePredicate(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final String[] data = issue.getData();
    final String predicate = data[0];
    final String translated = data[1];
    acceptor.accept(issue, ("Translated Predicate to " + translated), 
      ((("Change from " + predicate) + " to ") + translated), null, 
      new ISemanticModification() {
        @Override
        public void apply(final EObject element, final IModificationContext context) throws Exception {
          if ((element instanceof EventBPredicate)) {
            ((EventBPredicate)element).setPredicate(translated);
          }
        }
      });
  }
  
  /**
   * Quick fix for untranslated expressions. Offer to replace the expression
   * by the translated formula. This is copied from
   * {@link ac.soton.xeventb.xcontext.ui.quickfix.XMachineQuickfixProvider}.
   */
  public void translateExpression(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final String[] data = issue.getData();
    final String expression = data[0];
    final String translated = data[1];
    acceptor.accept(issue, ("Translated Expression to " + translated), 
      ((("Change from " + expression) + " to ") + translated), null, 
      new ISemanticModification() {
        @Override
        public void apply(final EObject element, final IModificationContext context) throws Exception {
          if ((element instanceof EventBExpression)) {
            ((EventBExpression)element).setExpression(translated);
          }
        }
      });
  }
  
  /**
   * Quick fix for untranslated assignments. Offer to replace the assignment
   * by the translated formula. This is copied from
   * {@link ac.soton.xeventb.xcontext.ui.quickfix.XMachineQuickfixProvider}.
   */
  public void translateAssignment(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final String[] data = issue.getData();
    final String assignment = data[0];
    final String translated = data[1];
    acceptor.accept(issue, ("Translated Assignment to " + translated), 
      ((("Change from " + assignment) + " to ") + translated), null, 
      new ISemanticModification() {
        @Override
        public void apply(final EObject element, final IModificationContext context) throws Exception {
          if ((element instanceof EventBAction)) {
            ((EventBAction)element).setAction(translated);
          }
        }
      });
  }
  
  /**
   * Quick fix for untranslated types. Offer to replace the type by the
   * translated formula. This is copied from
   * {@link ac.soton.xeventb.xcontext.ui.quickfix.XContextQuickfixProvider}.
   */
  public void translateType(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final String[] data = issue.getData();
    final String type = data[0];
    final String translated = data[1];
    acceptor.accept(issue, ("Translated type to " + translated), 
      ((("Change from " + type) + " to ") + translated), null, 
      new ISemanticModification() {
        @Override
        public void apply(final EObject element, final IModificationContext context) throws Exception {
          if ((element instanceof Type)) {
            ((Type)element).setType(translated);
          }
        }
      });
  }
  
  /**
   * Quick fix for untranslated values. Offer to replace the value by the
   * translated formula. This is copied from
   * {@link ac.soton.xeventb.xcontext.ui.quickfix.XContextQuickfixProvider}.
   */
  public void translateValue(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final String[] data = issue.getData();
    final String value = data[0];
    final String translated = data[1];
    acceptor.accept(issue, ("Translated value to " + translated), 
      ((("Change from " + value) + " to ") + translated), null, 
      new ISemanticModification() {
        @Override
        public void apply(final EObject element, final IModificationContext context) throws Exception {
          if ((element instanceof Value)) {
            ((Value)element).setValue(translated);
          }
        }
      });
  }
}
