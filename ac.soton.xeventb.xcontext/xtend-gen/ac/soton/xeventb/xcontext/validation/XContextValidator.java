/**
 * Copyright (c) 2017, 2020 University of Southampton.
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
package ac.soton.xeventb.xcontext.validation;

import ac.soton.xeventb.common.IValidationIssueCode;
import ac.soton.xeventb.xcontext.validation.AbstractXContextValidator;
import com.google.common.base.Objects;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.validation.Check;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.EventBPredicate;
import org.eventb.emf.core.context.Context;
import org.rodinp.keyboard.core.RodinKeyboardCore;

/**
 * <p>
 * XContext validator, provides custom validation rules for the XContexts.
 * </p>
 * 
 * @author dana - Initial Implementation
 * @version 0.1
 * @since 1.0
 */
@SuppressWarnings("all")
public class XContextValidator extends AbstractXContextValidator {
  /**
   * Check to ensure that the context name match the name of the file.
   * 
   * @author dana
   * @author htson - Renamed from "checkMachineName"
   * @since 2.0
   */
  @Check
  public void checkContextName(final Context ctx) {
    final Resource res = ctx.eResource();
    final String fileName = res.getURI().lastSegment().toString();
    final String ctxName = fileName.substring(0, fileName.indexOf("."));
    String _name = ctx.getName();
    boolean _notEquals = (!Objects.equal(ctxName, _name));
    if (_notEquals) {
      this.error("Context name should be the same as the file name", null);
    }
  }
  
  /**
   * Check for untranslated predicates by comparing the translated string
   * with the predicate. Raise a warning with code
   * {@link IValidationIssueCode#UNTRANSLATE_PREDICATE}. The code is used for
   * providing quick fixes.
   * 
   * @param obj
   * 		an Event-B predicate EObject.
   * @author htson
   * @see IValidationIssueCode
   * @since 2.0
   */
  @Check
  public void untranslatedPredicate(final EventBPredicate obj) {
    final String predicate = obj.getPredicate();
    final String translated = RodinKeyboardCore.translate(predicate);
    boolean _notEquals = (!Objects.equal(predicate, translated));
    if (_notEquals) {
      this.warning(("Untranslated Predicate: " + predicate), obj, 
        CorePackage.Literals.EVENT_BPREDICATE__PREDICATE, 
        IValidationIssueCode.UNTRANSLATED_PREDICATE, predicate, translated);
    }
  }
}
