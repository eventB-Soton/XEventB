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
 * @author htson
 * @version 0.1
 * @since 0.0.2
 */
public class XContextTransientValueService extends DefaultTransientValueService {

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
		
		// For context, serialise only "name", "comment", "context extension",
		// "sets", "constants" and "axioms".
		if (owner instanceof Context) {
			if (feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME))
				return false;
			if (feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT))
				return true;//return false;
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
		
		// For carrier set, serialise only "name" and "comment"
		if (owner instanceof CarrierSet) {
			if (feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME))
				return false;
			if (feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT))
				return true;//return false;
			return true;
		}
		
		// For constant, serialise only "name" and  "comment"
		if (owner instanceof Constant) {
			if (feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME))
				return false;
			else if (feature
					.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT))
				return true;//return false;
			return true;
		}
		
		// For axiom, serialise only "name", "predicate", "comment", and
		// "theorem"
		if (owner instanceof Axiom) {
			if (feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME))
				return false;
			if (feature
					.equals(CorePackage.Literals.EVENT_BPREDICATE__PREDICATE))
				return false;
			if (feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT))
				return true;//return false;
			if (feature.equals(CorePackage.Literals.EVENT_BDERIVED__THEOREM))
				return false;
			return true;
		}
		
		// Ignore other objects and features
		return true;
	}

}
