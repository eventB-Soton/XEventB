/**
 * Copyright (c) 2020, 2021 University of Southampton.
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

import ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage;
import ac.soton.eventb.emf.core.extension.coreextension.TypedVariable;
import ac.soton.eventb.emf.inclusion.InclusionPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.machine.Action;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Guard;
import org.eventb.emf.core.machine.Invariant;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;
import org.eventb.emf.core.machine.Parameter;
import org.eventb.emf.core.machine.Variable;
import org.eventb.emf.core.machine.Variant;
import org.eventb.emf.core.machine.Witness;

/**
 * <p>
 * An implementation of transient value service in order to filter out
 * unsupported elements during serilisation of XMachine from Event-B EMF.
 * </p>
 * @author htson - Initial implementation
 * @author dana - 0.2 - Added inclusion
 * @version 0.2.1
 * @since 0.1
 */
@SuppressWarnings("all")
public class XMachineTransientValueService extends DefaultTransientValueService {
  /**
   * (non-Javadoc)
   * 
   * @see DefaultTransientValueService#isTransient(EObject,
   * EStructuralFeature, int)
   */
  @Override
  public boolean isTransient(final EObject owner, final EStructuralFeature feature, final int index) {
    if ((owner instanceof Machine)) {
      boolean _equals = feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME);
      if (_equals) {
        return false;
      }
      boolean _equals_1 = feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT);
      if (_equals_1) {
        return false;
      }
      boolean _equals_2 = feature.equals(MachinePackage.Literals.MACHINE__REFINES);
      if (_equals_2) {
        return false;
      }
      boolean _equals_3 = feature.equals(MachinePackage.Literals.MACHINE__SEES);
      if (_equals_3) {
        return false;
      }
      boolean _equals_4 = feature.equals(CorePackage.Literals.EVENT_BELEMENT__ORDERED_CHILDREN);
      if (_equals_4) {
        return false;
      }
      boolean _equals_5 = feature.equals(MachinePackage.Literals.MACHINE__VARIABLES);
      if (_equals_5) {
        return true;
      }
      boolean _equals_6 = feature.equals(MachinePackage.Literals.MACHINE__INVARIANTS);
      if (_equals_6) {
        return true;
      }
      boolean _equals_7 = feature.equals(MachinePackage.Literals.MACHINE__VARIANTS);
      if (_equals_7) {
        return true;
      }
      boolean _equals_8 = feature.equals(MachinePackage.Literals.MACHINE__EVENTS);
      if (_equals_8) {
        return true;
      }
      boolean _equals_9 = feature.equals(InclusionPackage.Literals.MACHINE_INCLUSION__ABSTRACT_MACHINE);
      if (_equals_9) {
        return false;
      }
      boolean _equals_10 = feature.equals(InclusionPackage.Literals.MACHINE_INCLUSION__CONCRETE_MACHINE);
      if (_equals_10) {
        return false;
      }
      boolean _equals_11 = feature.equals(InclusionPackage.Literals.MACHINE_INCLUSION__PREFIXES);
      if (_equals_11) {
        return false;
      }
      return true;
    }
    if ((owner instanceof TypedVariable)) {
      boolean _equals_12 = feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME);
      if (_equals_12) {
        return false;
      }
      boolean _equals_13 = feature.equals(CoreextensionPackage.Literals.TYPE__TYPE);
      if (_equals_13) {
        return false;
      }
      boolean _equals_14 = feature.equals(CoreextensionPackage.Literals.VALUE__VALUE);
      if (_equals_14) {
        return false;
      }
      boolean _equals_15 = feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT);
      if (_equals_15) {
        return false;
      }
      return true;
    }
    if ((owner instanceof Variable)) {
      boolean _equals_16 = feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME);
      if (_equals_16) {
        return false;
      }
      boolean _equals_17 = feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT);
      if (_equals_17) {
        return false;
      }
      return true;
    }
    if ((owner instanceof Invariant)) {
      boolean _equals_18 = feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME);
      if (_equals_18) {
        return false;
      }
      boolean _equals_19 = feature.equals(CorePackage.Literals.EVENT_BPREDICATE__PREDICATE);
      if (_equals_19) {
        return false;
      }
      boolean _equals_20 = feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT);
      if (_equals_20) {
        return false;
      }
      boolean _equals_21 = feature.equals(CorePackage.Literals.EVENT_BDERIVED__THEOREM);
      if (_equals_21) {
        return false;
      }
      return true;
    }
    if ((owner instanceof Variant)) {
      boolean _equals_22 = feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME);
      if (_equals_22) {
        return false;
      }
      boolean _equals_23 = feature.equals(CorePackage.Literals.EVENT_BEXPRESSION__EXPRESSION);
      if (_equals_23) {
        return false;
      }
      boolean _equals_24 = feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT);
      if (_equals_24) {
        return false;
      }
      return true;
    }
    if ((owner instanceof Event)) {
      boolean _equals_25 = feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME);
      if (_equals_25) {
        return false;
      }
      boolean _equals_26 = feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT);
      if (_equals_26) {
        return false;
      }
      boolean _equals_27 = feature.equals(MachinePackage.Literals.EVENT__REFINES);
      if (_equals_27) {
        return false;
      }
      boolean _equals_28 = feature.equals(MachinePackage.Literals.EVENT__EXTENDED);
      if (_equals_28) {
        return false;
      }
      boolean _equals_29 = feature.equals(MachinePackage.Literals.EVENT__CONVERGENCE);
      if (_equals_29) {
        return false;
      }
      boolean _equals_30 = feature.equals(CorePackage.Literals.EVENT_BELEMENT__ORDERED_CHILDREN);
      if (_equals_30) {
        return false;
      }
      boolean _equals_31 = feature.equals(MachinePackage.Literals.EVENT__PARAMETERS);
      if (_equals_31) {
        return true;
      }
      boolean _equals_32 = feature.equals(MachinePackage.Literals.EVENT__GUARDS);
      if (_equals_32) {
        return true;
      }
      boolean _equals_33 = feature.equals(MachinePackage.Literals.EVENT__WITNESSES);
      if (_equals_33) {
        return true;
      }
      boolean _equals_34 = feature.equals(MachinePackage.Literals.EVENT__ACTIONS);
      if (_equals_34) {
        return true;
      }
      boolean _equals_35 = feature.equals(InclusionPackage.Literals.EVENT_SYNCHRONISATION__SYNCHRONISED_EVENT);
      if (_equals_35) {
        return false;
      }
      boolean _equals_36 = feature.equals(InclusionPackage.Literals.EVENT_SYNCHRONISATION__PREFIX);
      if (_equals_36) {
        return false;
      }
      return true;
    }
    if ((owner instanceof Parameter)) {
      boolean _equals_37 = feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME);
      if (_equals_37) {
        return false;
      }
      boolean _equals_38 = feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT);
      if (_equals_38) {
        return false;
      }
      return true;
    }
    if ((owner instanceof Guard)) {
      boolean _equals_39 = feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME);
      if (_equals_39) {
        return false;
      }
      boolean _equals_40 = feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT);
      if (_equals_40) {
        return false;
      }
      boolean _equals_41 = feature.equals(CorePackage.Literals.EVENT_BPREDICATE__PREDICATE);
      if (_equals_41) {
        return false;
      }
      boolean _equals_42 = feature.equals(CorePackage.Literals.EVENT_BDERIVED__THEOREM);
      if (_equals_42) {
        return false;
      }
      return true;
    }
    if ((owner instanceof Witness)) {
      boolean _equals_43 = feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME);
      if (_equals_43) {
        return false;
      }
      boolean _equals_44 = feature.equals(CorePackage.Literals.EVENT_BPREDICATE__PREDICATE);
      if (_equals_44) {
        return false;
      }
      boolean _equals_45 = feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT);
      if (_equals_45) {
        return false;
      }
      return true;
    }
    if ((owner instanceof Action)) {
      boolean _equals_46 = feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME);
      if (_equals_46) {
        return false;
      }
      boolean _equals_47 = feature.equals(CorePackage.Literals.EVENT_BACTION__ACTION);
      if (_equals_47) {
        return false;
      }
      boolean _equals_48 = feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT);
      if (_equals_48) {
        return false;
      }
      return true;
    }
    return true;
  }
}
