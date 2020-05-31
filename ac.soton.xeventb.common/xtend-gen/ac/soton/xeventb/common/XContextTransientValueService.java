/**
 * Copyright (c) 2018, 2020 University of Southampton.
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.context.Axiom;
import org.eventb.emf.core.context.CarrierSet;
import org.eventb.emf.core.context.Constant;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.context.ContextPackage;

/**
 * <p>
 * An implementation of transient value service in order to filter out
 * unsupported elements during serilisation of XContext from Event-B EMF.
 * </p>
 * 
 * @author htson - Initial implementation
 * @version 0.1.1
 * @since 0.1
 */
@SuppressWarnings("all")
public class XContextTransientValueService extends DefaultTransientValueService {
  /**
   * (non-Javadoc)
   * 
   * @see DefaultTransientValueService#isTransient(EObject,
   * EStructuralFeature, int)
   */
  @Override
  public boolean isTransient(final EObject owner, final EStructuralFeature feature, final int index) {
    if (((owner instanceof EventBElement) && ((EventBElement) owner).isGenerated())) {
      return true;
    }
    if ((owner instanceof Context)) {
      boolean _equals = feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME);
      if (_equals) {
        return false;
      }
      boolean _equals_1 = feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT);
      if (_equals_1) {
        return true;
      }
      boolean _equals_2 = feature.equals(ContextPackage.Literals.CONTEXT__EXTENDS);
      if (_equals_2) {
        return false;
      }
      boolean _equals_3 = feature.equals(ContextPackage.Literals.CONTEXT__SETS);
      if (_equals_3) {
        return false;
      }
      boolean _equals_4 = feature.equals(ContextPackage.Literals.CONTEXT__CONSTANTS);
      if (_equals_4) {
        return false;
      }
      boolean _equals_5 = feature.equals(ContextPackage.Literals.CONTEXT__AXIOMS);
      if (_equals_5) {
        return false;
      }
      return true;
    }
    if ((owner instanceof CarrierSet)) {
      boolean _equals_6 = feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME);
      if (_equals_6) {
        return false;
      }
      boolean _equals_7 = feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT);
      if (_equals_7) {
        return true;
      }
      return true;
    }
    if ((owner instanceof Constant)) {
      boolean _equals_8 = feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME);
      if (_equals_8) {
        return false;
      }
      boolean _equals_9 = feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT);
      if (_equals_9) {
        return true;
      }
      return true;
    }
    if ((owner instanceof Axiom)) {
      boolean _equals_10 = feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME);
      if (_equals_10) {
        return false;
      }
      boolean _equals_11 = feature.equals(CorePackage.Literals.EVENT_BPREDICATE__PREDICATE);
      if (_equals_11) {
        return false;
      }
      boolean _equals_12 = feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT);
      if (_equals_12) {
        return true;
      }
      boolean _equals_13 = feature.equals(CorePackage.Literals.EVENT_BDERIVED__THEOREM);
      if (_equals_13) {
        return false;
      }
      return true;
    }
    return true;
  }
}
