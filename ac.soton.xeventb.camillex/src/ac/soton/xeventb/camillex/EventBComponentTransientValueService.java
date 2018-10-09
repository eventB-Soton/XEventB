/*******************************************************************************
 * Copyright (c) 2016 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     University of Southampton - initial API and implementation
 *******************************************************************************/

package ac.soton.xeventb.camillex;

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

import ac.soton.eventb.emf.inclusion.InclusionPackage;

/**
 * <p>
 * An implementation of transient value service in order to filter out
 * unsupported elements during serilisation of XContext from Event-B EMF.
 * </p>
 *
 * @author htson
 * @version 0.1
 * @since 0.0.2
 */
public class EventBComponentTransientValueService extends DefaultTransientValueService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see DefaultTransientValueService#isTransient(EObject,
	 * EStructuralFeature, int)
	 */
	@Override
	public boolean isTransient(EObject owner, EStructuralFeature feature,
			int index) {
		// Ignore generated elements
		if (owner instanceof EventBElement
				&& ((EventBElement) owner).isGenerated()) {
			return true;
		}
		
		// For context, serialise only "name", "context extension",
		// "sets", "constants" and "axioms".
		if (owner instanceof Context) {
			if (feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME))
				return false;
			if (feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT))
				return true; // We ignore comments 
			if (feature.equals(ContextPackage.Literals.CONTEXT__EXTENDS))
				return false;
			if (feature.equals(ContextPackage.Literals.CONTEXT__SETS))
				return false;
			if (feature.equals(ContextPackage.Literals.CONTEXT__CONSTANTS))
				return false;
			if (feature.equals(ContextPackage.Literals.CONTEXT__AXIOMS))
				return false;
			return true;
		}
		
		// For carrier set, serialise only "name"
		if (owner instanceof CarrierSet) {
			if (feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME))
				return false;
			if (feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT))
				return true; // We ignore comment
			return true;
		}
		
		// For constant, serialise only "name"
		if (owner instanceof Constant) {
			if (feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME))
				return false;
			else if (feature
					.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT))
				return true; // We ignore comment
			return true;
		}
		
		// For axiom, serialise only "name", "predicate", and
		// "theorem"
		if (owner instanceof Axiom) {
			if (feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME))
				return false;
			if (feature
					.equals(CorePackage.Literals.EVENT_BPREDICATE__PREDICATE))
				return false;
			if (feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT))
				return true; // We ignore comment
			if (feature.equals(CorePackage.Literals.EVENT_BDERIVED__THEOREM))
				return false;
			return true;
		}
		
		// For machine, serialise only "name", "machine refinement",
		// "context seeing", "variables", "invariants", "variant" and "events"
		// Dana: updated to include Machine Inclusion
		if (owner instanceof Machine) {
			if (feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME))
				return false;
			if (feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT))
				return true; // We ignore comments
			if (feature.equals(MachinePackage.Literals.MACHINE__REFINES))
				return false;
			if (feature.equals(MachinePackage.Literals.MACHINE__SEES))
				return false;
			if (feature.equals(MachinePackage.Literals.MACHINE__VARIABLES))
				return false;
			if (feature.equals(MachinePackage.Literals.MACHINE__INVARIANTS))
				return false;
			if (feature.equals(MachinePackage.Literals.MACHINE__VARIANT))
				return false;
			if (feature.equals(MachinePackage.Literals.MACHINE__EVENTS))
				return false;
			if (feature.equals(InclusionPackage.Literals.MACHINE_INCLUSION__ABSTRACT_MACHINE))
				return false;
			if (feature.equals(InclusionPackage.Literals.MACHINE_INCLUSION__CONCRETE_MACHINE))
				return false;
			if (feature.equals(InclusionPackage.Literals.MACHINE_INCLUSION__PREFIXES))
				return false;
			return true;
		}

		// For variable, serialise only "name"
		if (owner instanceof Variable) {
			if (feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME))
				return false;
			if (feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT))
				return true; // We ignore comments
			return true;
		}

		// For invariant, serialise only "name", "predicate", and
		// "theorem".
		if (owner instanceof Invariant) {
			if (feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME))
				return false;
			if (feature
					.equals(CorePackage.Literals.EVENT_BPREDICATE__PREDICATE))
				return false;
			if (feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT))
				return true; // We ignore comments
			if (feature.equals(CorePackage.Literals.EVENT_BDERIVED__THEOREM))
				return false;
			return true;
		}

		// For variant, serialise only "expression".
		if (owner instanceof Variant) {
			if (feature
					.equals(CorePackage.Literals.EVENT_BEXPRESSION__EXPRESSION))
				return false;
			if (feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT))
				return true; // We ignore comments
			return true;
		}

		// For event, serialise only "name", "event refinement",
		// "extended", "convergence", "parameters", "guards", "witnesses" and
		// "actions"
		//Dana: Updated to include Event Synchronisation
		if (owner instanceof Event) {
			if (feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME))
				return false;
			if (feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT))
				return true; // We ignore comments
			if (feature.equals(MachinePackage.Literals.EVENT__REFINES))
				return false;
			if (feature.equals(MachinePackage.Literals.EVENT__EXTENDED))
				return false;
			if (feature.equals(MachinePackage.Literals.EVENT__CONVERGENCE))
				return false;
			if (feature.equals(MachinePackage.Literals.EVENT__PARAMETERS))
				return false;
			if (feature.equals(MachinePackage.Literals.EVENT__GUARDS))
				return false;
			if (feature.equals(MachinePackage.Literals.EVENT__WITNESSES))
				return false;
			if (feature.equals(MachinePackage.Literals.EVENT__ACTIONS))
				return false;
			if (feature.equals(InclusionPackage.Literals.EVENT_SYNCHRONISATION__SYNCHRONISED_EVENT))
				return false;
			if (feature.equals(InclusionPackage.Literals.EVENT_SYNCHRONISATION__PREFIX))
				return false;
			return true;
		}

		// For parameter, serialise only "name"
		if (owner instanceof Parameter) {
			if (feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME))
				return false;
			if (feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT))
				return true; // We ignore comments
			return true;
		}

		// For guard, serialise only "name", "predicate" and
		// "theorem".
		if (owner instanceof Guard) {
			if (feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME))
				return false;
			if (feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT))
				return true; // We ignore comments
			if (feature
					.equals(CorePackage.Literals.EVENT_BPREDICATE__PREDICATE))
				return false;
			if (feature.equals(CorePackage.Literals.EVENT_BDERIVED__THEOREM))
				return false;
			return true;
		}

		// For witness, serialise only "name" and "predicate"
		if (owner instanceof Witness) {
			if (feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME))
				return false;
			if (feature
					.equals(CorePackage.Literals.EVENT_BPREDICATE__PREDICATE))
				return false;
			if (feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT))
				return true; // We ignore comments
			return true;
		}
		
		// For action, serialise only "name" and "action" 
		if (owner instanceof Action) {
			if (feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME))
				return false;
			if (feature.equals(CorePackage.Literals.EVENT_BACTION__ACTION))
				return false;
			if (feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT))
				return true; // We ignore comments
			return true;
		}

		// Ignore other objects and features
		return true;
	}

}
