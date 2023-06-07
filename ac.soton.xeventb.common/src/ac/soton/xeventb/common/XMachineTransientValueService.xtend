/*******************************************************************************
 *  Copyright (c) 2020, 2021 University of Southampton.
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

import ac.soton.eventb.emf.core.^extension.coreextension.CoreextensionPackage
import ac.soton.eventb.emf.core.^extension.coreextension.TypedVariable
import ac.soton.eventb.emf.inclusion.InclusionPackage
import ac.soton.eventb.emf.record.Record
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService
import org.eventb.emf.core.CorePackage
import org.eventb.emf.core.machine.Action
import org.eventb.emf.core.machine.Event
import org.eventb.emf.core.machine.Guard
import org.eventb.emf.core.machine.Invariant
import org.eventb.emf.core.machine.Machine
import org.eventb.emf.core.machine.MachinePackage
import org.eventb.emf.core.machine.Parameter
import org.eventb.emf.core.machine.Variable
import org.eventb.emf.core.machine.Variant
import org.eventb.emf.core.machine.Witness
import ac.soton.eventb.emf.record.RecordPackage
import ac.soton.eventb.emf.record.Field
import ac.soton.eventb.emf.record.Constraint

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
class XMachineTransientValueService extends DefaultTransientValueService {
	/*
	 * (non-Javadoc)
	 * 
	 * @see DefaultTransientValueService#isTransient(EObject,
	 * EStructuralFeature, int)
	 */
	override boolean isTransient(EObject owner, EStructuralFeature feature, int index) {
		// Ignore generated elements
		// v0.1.2 - htson - This cause issue #71.
		// if (owner instanceof EventBElement && ((owner as EventBElement)).isGenerated()) {
		//     return true
		// }
		// For machine, serialise only "name", "machine refinement",
		// "context seeing", "orderedChildren", "comments".
		// Dana: updated to include Machine Inclusion
		if (owner instanceof Machine) {
			if (feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME))
				return false
			if (feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT))
				return false
			if (feature.equals(MachinePackage.Literals.MACHINE__REFINES))
				return false
			if (feature.equals(MachinePackage.Literals.MACHINE__SEES))
				return false
			if(feature.equals(CorePackage.Literals.EVENT_BELEMENT__ORDERED_CHILDREN))
				return false
			if (feature.equals(MachinePackage.Literals.MACHINE__VARIABLES))
				return true
			if (feature.equals(MachinePackage.Literals.MACHINE__INVARIANTS))
				return true
			if (feature.equals(MachinePackage.Literals.MACHINE__VARIANTS))
				return true
			if (feature.equals(MachinePackage.Literals.MACHINE__EVENTS))
				return true
			if (feature.equals(InclusionPackage.Literals.MACHINE_INCLUSION__ABSTRACT_MACHINE))
				return false
			if (feature.equals(InclusionPackage.Literals.MACHINE_INCLUSION__CONCRETE_MACHINE))
				return false
			if (feature.equals(InclusionPackage.Literals.MACHINE_INCLUSION__PREFIXES))
				return false
			return true
		}
		// For typed variable, serialise only "name", "type", "value", "comment"
		// This must go before Variable
		if (owner instanceof TypedVariable) {
			if (feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME))
				return false
			if (feature.equals(CoreextensionPackage.Literals.TYPE__TYPE))
				return false
			if (feature.equals(CoreextensionPackage.Literals.VALUE__VALUE))
				return false
			if (feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT))
				return false
			return true
		}
		// For variable, serialise only "name", "comment"
		if (owner instanceof Variable) {
			if (feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME))
				return false
			if (feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT))
				return false
			return true
		}
		// For invariant, serialise only "name", "predicate", and "theorem",
		// "comment"
		if (owner instanceof Invariant) {
			if (feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME))
				return false
			if (feature.equals(CorePackage.Literals.EVENT_BPREDICATE__PREDICATE))
				return false
			if (feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT))
				return false
			if (feature.equals(CorePackage.Literals.EVENT_BDERIVED__THEOREM))
				return false
			return true
		}
		// For variant, serialise only "name", "expression", "comment"
		if (owner instanceof Variant) {
			if (feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME))
				return false
			if (feature.equals(CorePackage.Literals.EVENT_BEXPRESSION__EXPRESSION))
				return false
			if (feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT))
				return false
			return true
		}
		// For event, serialise only "name", "event refinement",
		// "extended", "convergence", "orderedChildren", "comment"
		// Dana: Updated to include Event Synchronisation
		if (owner instanceof Event) {
			if (feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME))
				return false
			if (feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT))
				return false
			if (feature.equals(MachinePackage.Literals.EVENT__REFINES))
				return false
			if (feature.equals(MachinePackage.Literals.EVENT__EXTENDED))
				// Dana: updated to False fix extended conversion problem
				return false
			if (feature.equals(MachinePackage.Literals.EVENT__CONVERGENCE))
				return false
			if(feature.equals(CorePackage.Literals.EVENT_BELEMENT__ORDERED_CHILDREN))
				return false
			if (feature.equals(MachinePackage.Literals.EVENT__PARAMETERS))
				return true
			if (feature.equals(MachinePackage.Literals.EVENT__GUARDS))
				return true
			if (feature.equals(MachinePackage.Literals.EVENT__WITNESSES))
				return true
			if (feature.equals(MachinePackage.Literals.EVENT__ACTIONS))
				return true
			if (feature.equals(InclusionPackage.Literals.EVENT_SYNCHRONISATION__SYNCHRONISED_EVENT))
				return false
			if (feature.equals(InclusionPackage.Literals.EVENT_SYNCHRONISATION__PREFIX))
				return false
			return true
		}
		// For parameter, serialise only "name"
		if (owner instanceof Parameter) {
			if (feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME))
				return false
			if (feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT))
				return false
			return true
		}
		// For guard, serialise only "name", "predicate" and "theorem".
		if (owner instanceof Guard) {
			if (feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME))
				return false
			if (feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT))
				return false
			if (feature.equals(CorePackage.Literals.EVENT_BPREDICATE__PREDICATE))
				return false
			if (feature.equals(CorePackage.Literals.EVENT_BDERIVED__THEOREM))
				return false
			return true
		}
		// For witness, serialise only "name", "predicate".
		if (owner instanceof Witness) {
			if (feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME))
				return false
			if (feature.equals(CorePackage.Literals.EVENT_BPREDICATE__PREDICATE))
				return false
			if (feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT))
				return false
			return true
		}
		// For action, serialise only "name", "action".
		if (owner instanceof Action) {
			if (feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME))
				return false
			if (feature.equals(CorePackage.Literals.EVENT_BACTION__ACTION))
				return false
			if (feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT))
				return false
			return true
		}

		// htson: This fixes issues with Quickfix for Records.
		// This fixes issue such as "EventBNamed.name is required to have a value, but it does not."
		// For records, serialise only "name", "comment",
		// "fields", "constraints", "inheritNames", "selfName"
		// "extended", "refined"
		if (owner instanceof Record) {
			if (feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME))
				return false
			if (feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT))
				return false
			if (feature.equals(RecordPackage.Literals.RECORD__FIELDS))
				return false
			if (feature.equals(RecordPackage.Literals.RECORD__CONSTRAINTS))
				return false
			if (feature.equals(RecordPackage.Literals.RECORD__INHERITS_NAMES))
				return false
			if (feature.equals(RecordPackage.Literals.RECORD__SELF_NAME))
				return false
			if (feature.equals(RecordPackage.Literals.RECORD__EXTENDED))
				return false
			if (feature.equals(RecordPackage.Literals.RECORD__REFINED))
				return false
		}
		// For fields, serialise only "name", "comment",
		// "type", "multiplicity"
		if (owner instanceof Field) {
			if (feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME))
				return false
			if (feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT))
				return false
			if (feature.equals(CoreextensionPackage.Literals.TYPE__TYPE))
				return false
			if (feature.equals(RecordPackage.Literals.FIELD__MULTIPLICITY))
				return false
		}
		// For constraints, serialise only "name", "comment",
		// "predicate"
		if (owner instanceof Constraint) {
			if (feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME))
				return false
			if (feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT))
				return false
			if (feature.equals(CorePackage.Literals.EVENT_BPREDICATE__PREDICATE))
				return false
		}		
		// Ignore other objects and features.
		return true
	}
}
