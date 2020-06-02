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
	// SPACE
	val SPACE = "&nbsp" //$NON-NLS-1$

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

	def private String keyword(String keyword) {
		return "<span style=\"color:blue\"><b>" + keyword + "</b></span>"
	}

	def private String inheritedFormula(String formula) {
		return "<span style=\"color:grey\"><i>" + formula + "</i></span>"
	}

	def private String formula(String formula) {
		return "<span style=\"color:black\">" + formula + "</span>"
	}

	def private String inheritedLabel(String label) {
		return "<span style=\"color:grey\"><i>@" + label + ":</i></span>"
	}

	def private String label(String label) {
		return "<span style=\"color:black\">@" + label + ":</span>"
	}

	def private String inheritedComment(String comment) {
		return "<span style=\"color:grey\"><i>" + SPACE + "//" + SPACE +
				comment + "</i></span>"
	}

	def private String comment(String comment) {
		return "<span style=\"color:black\">" + SPACE + "//" + SPACE +
				comment + "</span>"
	}

	/*
	 * Pretty print event as HTML with inherited elements.
	 */
	def private prettyprint(Event evt, List<Parameter> inheritedPars,
		List<Guard> inheritedGrds, List<Action> inheritedActs) {
		var result = new StringBuffer
		result.append(keyword("any"))
		result.append("<br>")
		// Inherited parameters
		for (par : inheritedPars) {
			result.append(TAB)
			result.append(inheritedFormula(par.name))
			if (par.comment === null || "" === par.comment) {
				result.append(inheritedComment("inherited element"))
			} else {
				result.append(inheritedComment(par.comment))
			}
			result.append("<br>")
		}
		// Owned parameters
		for (par : evt.parameters) {
			result.append(TAB)
			result.append(formula(par.name))
			if (par.comment !== null && "" != par.comment) {
				result.append(comment(par.comment))
			}
			result.append("<br>")
		}

		result.append(keyword("where"))
		result.append("<br>")
		// Inherited guards
		for (grd : inheritedGrds) {
			result.append(TAB)
			result.append(inheritedLabel(grd.name))
			result.append(SPACE)
			result.append(inheritedFormula(grd.predicate))
			if (grd.comment === null || "" === grd.comment) {
				result.append(inheritedComment("inherited element"))
			} else {
				result.append(inheritedComment(grd.comment))
			}
			result.append("<br>")
		}
		// Owned guards
		for (grd : evt.guards) {
			result.append(TAB)
			result.append(label(grd.name))
			result.append(SPACE)
			result.append(formula(grd.predicate))
			if (grd.comment !== null && "" != grd.comment) {
				result.append(comment(grd.comment))
			}
			result.append("<br>")
		}

		result.append(keyword("then"))
		result.append("<br>")
		// Inherited actions
		for (act : inheritedActs) {
			result.append(TAB)
			result.append(inheritedLabel(act.name))
			result.append(SPACE)
			result.append(inheritedFormula(act.action))
			if (act.comment === null || "" === act.comment) {
				result.append(inheritedComment("inherited element"))
			} else {
				result.append(inheritedComment(act.comment))
			}
			result.append("<br>")
		}
		// Owned actions
		for (act : evt.actions) {
			result.append(TAB)
			result.append(label(act.name))
			result.append(SPACE)
			result.append(formula(act.action))
			if (act.comment !== null && "" != act.comment) {
				result.append(comment(act.comment))
			}
			result.append("<br>")
		}
		val witnesses = evt.witnesses
		if (!witnesses.isEmpty()) {
			result.append(keyword("with"))
			for (wit : evt.witnesses) {
				result.append(TAB)
				result.append(label(wit.name))
				result.append(SPACE)
				result.append(formula(wit.predicate))
				if (wit.comment !== null || "" != wit.comment) {
					result.append(comment(wit.comment))
				}
				result.append("<br>")
			}
		}
		result.append(keyword("end"))

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
