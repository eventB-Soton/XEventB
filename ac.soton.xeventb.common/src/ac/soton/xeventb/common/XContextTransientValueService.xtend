/*******************************************************************************
 *  Copyright (c) 2018, 2021 University of Southampton.
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

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService
import org.eventb.emf.core.CorePackage
import org.eventb.emf.core.context.Axiom
import org.eventb.emf.core.context.CarrierSet
import org.eventb.emf.core.context.Constant
import org.eventb.emf.core.context.Context
import org.eventb.emf.core.context.ContextPackage

/** 
 * <p>
 * An implementation of transient value service in order to filter out
 * unsupported elements during serilisation of XContext from Event-B EMF.
 * </p>
 * 
 * @author htson - Initial implementation
 * @version 0.1.2
 * @since 0.1
 */
class XContextTransientValueService extends DefaultTransientValueService {
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
		//	return true
		// }
		
		// For context, serialise only "name", "context extension",
		// "sets", "constants" and "axioms".
		if (owner instanceof Context) {
			if(feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME))
				return false
			if(feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT))
				return true
			if(feature.equals(ContextPackage.Literals.CONTEXT__EXTENDS))
				return false
			if(feature.equals(ContextPackage.Literals.CONTEXT__SETS))
				return false
			if(feature.equals(ContextPackage.Literals.CONTEXT__CONSTANTS))
				return false
			if(feature.equals(ContextPackage.Literals.CONTEXT__AXIOMS))
				return false
			return true
		}
		// For carrier set, serialise only "name"
		if (owner instanceof CarrierSet) {
			if(feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME))
				return false
			if(feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT))
				return true
			return true
		}
		// For constant, serialise only "name"
		if (owner instanceof Constant) {
			if (feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME))
				return false
			if (feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT))
				return true
			return true
		}
		// For axiom, serialise only "name", "predicate", and "theorem"
		if (owner instanceof Axiom) {
			if (feature.equals(CorePackage.Literals.EVENT_BNAMED__NAME))
				return false
			if (feature.equals(CorePackage.Literals.EVENT_BPREDICATE__PREDICATE))
				return false
			if (feature.equals(CorePackage.Literals.EVENT_BCOMMENTED__COMMENT))
				return true
			if (feature.equals(CorePackage.Literals.EVENT_BDERIVED__THEOREM))
				return false
			return true
		}
		// Ignore other objects and features
		return true
	}
}