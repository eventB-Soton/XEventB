/*******************************************************************************
 *  Copyright (c) 2020 University of Southampton.
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

package ac.soton.xeventb.xmachine.ui.hover

import java.util.ArrayList
import java.util.List
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider
import org.eclipse.xtext.util.CancelIndicator
import org.eventb.emf.core.machine.Action
import org.eventb.emf.core.machine.Event
import org.eventb.emf.core.machine.Guard
import org.eventb.emf.core.machine.Parameter
import ac.soton.xeventb.xmachine.ui.XMachineUiModule

/**
 * <p>
 * Implementation providing hover information.
 * </p>
 * 
 * @author htson
 * @version 0.1
 * @see XMachineUiModule
 * @see XMachineHoverProvider
 * @since 2.0
 */
class XMachineEObjectDocumentationProvider implements IEObjectDocumentationProvider {

	// TAB space
	val TAB = "&nbsp&nbsp&nbsp&nbsp" //$NON-NLS-1$

	// A dummy cancel indicator (used for resolve cross references
	val cancelIndicator = new CancelIndicator() {
		override isCanceled() {
			return new NullProgressMonitor().isCanceled();
		}
	};

	/**
	 * Method to get the documentation for an input {@link EObject}.
	 */
	override getDocumentation(EObject obj) {
		if (obj instanceof Event) {
			// @htson: Important to resolve the cross references first 
			EcoreUtil2.resolveLazyCrossReferences(obj.eResource, cancelIndicator)
			val inheritedPars = getInheritedParameters(obj)
			val inheritedGrds = getInheritedGuards(obj)
			val inheritedActs = getInheritedActions(obj)
			return prettyprint(obj, inheritedPars, inheritedGrds, inheritedActs)
		}
		return ""
	}

	/*
	 * Pretty print event as HTML with inherited elements.
	 */
	def private prettyprint(Event evt, List<Parameter> inheritedPars,
		List<Guard> inheritedGrds, List<Action> inheritedActs) {
		var result = new StringBuffer
		result.append("<b>any</b><br>")
		// Inherited parameters
		for (par : inheritedPars) {
			result.append(TAB + "<i>" + par.name)
			if (par.comment === null || "" === par.comment) {
				result.append(" // inherited element</i><br>")
			} else {
				result.append(" // " + par.comment + "</i><br>")
			}
		}
		// Owned parameters
		for (par : evt.parameters) {
			result.append(TAB + par.name)
			if (par.comment === null || "" === par.comment) {
				result.append("<br>")
			} else {
				result.append(" // " + par.comment + "<br>")
			}

		}
		result.append("<b>where</b><br>")
		// Inherited guards
		for (grd : inheritedGrds) {
			result.append(TAB + "<i>@" + grd.name + ": " + grd.predicate)
			if (grd.comment === null || "" === grd.comment) {
				result.append(" // inherited element</i><br>")
			} else {
				result.append(" // " + grd.comment + "</i><br>")
			}
		}
		// Owned guards
		for (grd : evt.guards) {
			result.append(TAB + "@" + grd.name + ": " + grd.predicate)
			if (grd.comment === null || "" === grd.comment) {
				result.append("<br>")
			} else {
				result.append(" // " + grd.comment + "<br>")
			}
		}
		result.append("<b>then</b><br>")
		// Inherited actions
		for (act : inheritedActs) {
			result.append(TAB + "<i>@" + act.name + ": " + act.action)
			if (act.comment === null || "" === act.comment) {
				result.append(" // inherited element</i><br>")
			} else {
				result.append(" // " + act.comment + "</i><br>")
			}
		}
		// Owned actions
		for (act : evt.actions) {
			result.append(TAB + "@" + act.name + ": " + act.action)
			if (act.comment === null || "" === act.comment) {
				result.append("<br>")
			} else {
				result.append(" // " + act.comment + "<br>")
			}
		}
		val witnesses = evt.witnesses
		if (!witnesses.isEmpty()) {
			result.append("<b>with</b><br>")
			for (wit : evt.witnesses) {
				result.append(TAB + "@" + wit.name + ": " + wit.predicate)
				if (wit.comment === null || "" === wit.comment) {
					result.append("<br>")
				} else {
					result.append(" // " + wit.comment + "<br>")
				}
			}
		}
		result.append("<b>end</b>")
		return result.toString()
	}

	/*
	 * Utility method to get the inherited parameters.
	 */
	def private List<Parameter> getInheritedParameters(Event evt) {
		if (evt.extended) {
			return getAllParameters(evt.refines.get(0))
		}
		return new ArrayList<Parameter>
	}

	/*
	 * Utility method to get the inherited guards.
	 */
	def private List<Guard> getInheritedGuards(Event evt) {
		if (evt.extended) {
			return getAllGuards(evt.refines.get(0))
		}
		return new ArrayList<Guard>
	}

	/*
	 * Utility method to get the inherited actions.
	 */
	def private List<Action> getInheritedActions(Event evt) {
		if (evt.extended) {
			return getAllActions(evt.refines.get(0))
		}
		return new ArrayList<Action>
	}

	/*
	 * Utility method to get the all parameters including inherited parameters.
	 */
	def private List<Parameter> getAllParameters(Event evt) {
		var List<Parameter> result
		if (evt.extended) {
			result = getAllParameters(evt.refines.get(0))
		} else {
			result = new ArrayList<Parameter>
		}
		result.addAll(evt.parameters)
		return result
	}

	/*
	 * Utility method to get the all guards including inherited guards.
	 */
	def private List<Guard> getAllGuards(Event evt) {
		var List<Guard> result
		if (evt.extended) {
			result = getAllGuards(evt.refines.get(0))
		} else {
			result = new ArrayList<Guard>
		}
		result.addAll(evt.guards)
		return result
	}

	/*
	 * Utility method to get the all actions including inherited actions.
	 */
	def private List<Action> getAllActions(Event evt) {
		var List<Action> result
		if (evt.extended) {
			result = getAllActions(evt.refines.get(0))
		} else {
			result = new ArrayList<Action>
		}
		result.addAll(evt.actions)
		return result
	}

}
