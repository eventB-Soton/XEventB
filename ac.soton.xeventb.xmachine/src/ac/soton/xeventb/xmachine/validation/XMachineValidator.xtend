/*******************************************************************************
 *  Copyright (c) 2017,2020 University of Southampton.
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

package ac.soton.xeventb.xmachine.validation

import ac.soton.eventb.emf.inclusion.EventSynchronisation
import ac.soton.eventb.emf.inclusion.MachineInclusion
import ac.soton.xeventb.common.IValidationIssueCode
import org.eclipse.core.resources.IMarker
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.Path
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.xtext.validation.Check
import org.eventb.core.IAction
import org.eventb.core.IEvent
import org.eventb.core.IGuard
import org.eventb.core.IInvariant
import org.eventb.core.IMachineRoot
import org.eventb.core.IParameter
import org.eventb.core.IVariable
import org.eventb.emf.core.CorePackage
import org.eventb.emf.core.EventBAction
import org.eventb.emf.core.EventBExpression
import org.eventb.emf.core.EventBPredicate
import org.eventb.emf.core.machine.Action
import org.eventb.emf.core.machine.Event
import org.eventb.emf.core.machine.Guard
import org.eventb.emf.core.machine.Invariant
import org.eventb.emf.core.machine.Machine
import org.eventb.emf.core.machine.Parameter
import org.eventb.emf.core.machine.Variable
import org.eventb.emf.core.machine.Variant
import org.eventb.emf.core.machine.Witness
import org.eventb.emf.persistence.EventBEMFUtils
import org.rodinp.core.IAttributeType
import org.rodinp.core.IRodinElement
import org.rodinp.core.RodinMarkerUtil
import org.rodinp.keyboard.core.RodinKeyboardCore

/**
 * <p>
 * XMachine validator, provides custom validation rules for the xtext machine file.
 * </p>
 *
 * @author dana - Initial implementation
 * @author htson - Added support for lifting Rodin issues into XMachine
 * @version 1.1
 * @since 1.0
 * @see XMachineMarkerModule
 */
class XMachineValidator extends AbstractXMachineValidator {

    // Check the name of the .bumx file is the same as the machine name
	@Check
	def checkMachineName(Machine mch){
		val res = mch.eResource
		val fileName = res.URI.lastSegment.toString
		val mchName= fileName.substring(0, fileName.indexOf('.'))
		if (mchName != mch.name)
			error('Machine name should be the same as the file name', null) //MachinePackage.Literals.MACHINE.eContainingFeature
	}
	
	/**
	 * check the prefix of the event must be one of the prefixes of the included machine
	 * that contains the synchronised event
	 * 
	 * @since 1.0
	 */
	@Check
	def checkEventPrefix(EventSynchronisation evt){
		if(!evt.prefix.empty){
			val prefix = evt.prefix
			val mchContainer = evt.eContainer.eContainer as Machine
			
			for(ext: mchContainer.extensions){
				if(ext instanceof MachineInclusion ){
					val events = (ext as MachineInclusion).abstractMachine.events
					if((events).contains(evt.synchronisedEvent)){//used abstract machine as scoping
						if((ext as MachineInclusion).prefixes.contains(prefix)){
							return
						}
					}
				}
			}
			error('Event prefix must be one of the included machine prefixes', null)
		}
	}
	
    /**
     * Add Prefixing warning if more than one machine is inlcuded
	 * the  reason is to avoid event synchronisation problems if machines have the same event name e.g. INITIALISATION
	 * 
	 * @since 1.0
	 */
	@Check
	def checkMachinePrefix(Machine mch){
	    val mchExtensions = mch.extensions.filter(MachineInclusion)
	    
		if(mchExtensions.size > 1) {
			for(inc: mchExtensions){
				if (inc.prefixes.empty)
					warning('Prefixing is not defined for ' + inc.abstractMachine.name + '. Possible synchronisation ambiguity. ', null)
			}
		}
	}
	
	/**
	 * Check the prefix of the event must be one of the prefixes of the included machine
	 * that contains the synchronised event
	 * 
	 * @since 1.0
	 */
	@Check
	def checkEventPrefixEmpty(EventSynchronisation evt){
		System.out.println("Check event prefix empty")
	
		if(evt.prefix.empty){
			val mchContainer = evt.eContainer.eContainer as Machine
			val mchIncExtensions = mchContainer.extensions.filter(MachineInclusion)
			for(ext : mchIncExtensions){
				if(ext.abstractMachine.events.contains(evt.synchronisedEvent)){
					if(ext.prefixes.empty)
						return
					else
						warning('Prefixing should be applied to the synchronised event.', null)
				}
			}
		}
	}

	/**
	 * Empty array of markers.
	 * 
	 * @since 2.0
	 */
	val IMarker[] NO_MARKER = #[];

	/**
	 * Utility method to find all Rodin markers associated with a machine root.
	 * @param mchRoot
	 * 			The input machine root.
	 * 
	 * @return An array of the Rodin markers associated with the input machine
	 * root.
	 * 
	 * @author htson
	 * @since 2.0 
	 */
	def private IMarker[] findRodinMarkers(IMachineRoot mchRoot)
			throws CoreException {
		val resource = mchRoot.getResource();
		if (!resource.isAccessible()) {
			return NO_MARKER;
		}
		return resource.findMarkers(RodinMarkerUtil.RODIN_PROBLEM_MARKER, true,
				IResource.DEPTH_INFINITE);
	}

	/**
	 * Utility method to get the EStructuralFeature corresponding to an
	 * attribute of an input EObject (of some Event-B elements), given the
	 * attribute type.
	 * 
	 * @param obj
	 * 			The input EObject
	 * @param attributeType
	 * 			The input attribute type
	 * @return The EStructuralFeature corresponding to the Attribute Type for
	 * 			the EObject. If no EStructuralFeature exists, return
	 * 			<code>null</code>. 
	 * 
	 * @author htson
	 * @since 2.0
	 */
	// TODO This is probably incomplete
	def private EStructuralFeature getFeature(EObject obj,
		IAttributeType attributeType // This is the Rodin Attribute Type
	) {
	 	// TODO Colin: Is there a better way to do this
		if (attributeType === null)
			return null
		val id = attributeType.id
		if (obj instanceof Variable) {
			// "Identifier" for variables will be "name"
			if (id == "org.eventb.core.identifier")
				return CorePackage.Literals.EVENT_BNAMED__NAME
			return null
		}
		if (obj instanceof Invariant) {
			// "Label" for invariants will be "name"
			if (id == "org.eventb.core.label") {
				return CorePackage.Literals.EVENT_BNAMED__NAME
			}
			// "Predicate" for invariants will be "predicate"
			if (id == "org.eventb.core.predicate") {
				return CorePackage.Literals.EVENT_BPREDICATE__PREDICATE				
			}
			return null
		}
		if (obj instanceof Event) {
			// "Label" for events will be "name"
			if (id == "org.eventb.core.label") {
				return CorePackage.Literals.EVENT_BNAMED__NAME
			}
			return null
		}
		if (obj instanceof Parameter) {
			// "Identifier" for parameters will be "name"
			if (id == "org.eventb.core.identifier") {
				return CorePackage.Literals.EVENT_BNAMED__NAME
			}
			return null
		}
		if (obj instanceof Guard) {
			// "Label" for guards will be "name"
			if (id == "org.eventb.core.label") {
				return CorePackage.Literals.EVENT_BNAMED__NAME
			}
			// "Predicate" for guards will be "predicate"
			if (id == "org.eventb.core.predicate") {
				return CorePackage.Literals.EVENT_BPREDICATE__PREDICATE				
			}
			return null
		}
		if (obj instanceof Action) {
			// "Label" for actions will be "name"
			if (id == "org.eventb.core.label") {
				return CorePackage.Literals.EVENT_BNAMED__NAME
			}
			// "Assignment" for actions will be "action"
			if (id == "org.eventb.core.assignment") {
				return CorePackage.Literals.EVENT_BACTION__ACTION			
			}
			return null
		}
		if (obj instanceof Witness) {
			// "Label" for witnesses will be "name"
			if (id == "org.eventb.core.label") {
				return CorePackage.Literals.EVENT_BNAMED__NAME
			}
			// "Predicate" for witnesses will be "predicate"
			if (id == "org.eventb.core.predicate") {
				return CorePackage.Literals.EVENT_BPREDICATE__PREDICATE				
			}
			return null
		}
		if (obj instanceof Variant) {
			// "Expression" for variant will be "expression"
			if (id == "org.eventb.core.expression") {
				return CorePackage.Literals.EVENT_BEXPRESSION__EXPRESSION
			}
			return null
		}
		return null
	}
	
	/**
	 * Utility method to create an issue associated with an EObject from a Rodin
	 * marker associated with the Rodin element corresponding to the EObject.
	 * 
	 * @param obj
	 * 			The input EObject
	 * @param rodinMarker
	 * 			The input Rodin marker.
	 * @author htson
	 * @since 2.0
	 */
	def private createIssue(EObject obj, IMarker rodinMarker) {
		val attributeType = RodinMarkerUtil.getAttributeType(rodinMarker);
        val attributes = rodinMarker.attributes
        val severity = attributes.get(IMarker.SEVERITY)
        var message = attributes.get(IMarker.MESSAGE)
        
        var feature = getFeature(obj, attributeType)
        var elem = obj
        // If cannot find feature attach to the Machine name
	    if (feature === null) {
	        elem = getMachine(obj)
	        if (elem !== null)
	           feature = CorePackage.Literals.EVENT_BNAMED__NAME
	        else
	           elem = obj
	    } else {
            // XText markers does not have information about "start" and "end"
            // at the moment. We include this information in the message and
            // "decode" it later when create the markers. 
            val start = RodinMarkerUtil.getCharStart(rodinMarker)
            val end = RodinMarkerUtil.getCharEnd(rodinMarker)
            if (start != -1) {
                message = message + " (from " + start + " to " + end + ")"
            }	        
	    }
		if (severity == IMarker.SEVERITY_ERROR)
			error(message.toString, elem, feature)
		else if (severity == IMarker.SEVERITY_WARNING)
			warning(message.toString, elem, feature)
		else
			info(message.toString, elem, feature)
	}
    
    /**
     * Utility method to get the machine of an EObject. Return the Machine 
     * parent of the input element. Return <code>null</code> if there is no
     * Machine containing the input element.
     * 
     * @param obj
     *          The input EObject
     * @author htson
     * @since 2.1
     */
     def EObject getMachine(EObject object) {
        if (object instanceof Machine)
            return object
        if (object instanceof Variable)
            return object.eContainer
        if (object instanceof Invariant)
            return object.eContainer
        if (object instanceof Event)
            return object.eContainer
        if (object instanceof Parameter)
            return object.eContainer.eContainer
        if (object instanceof Guard)
            return object.eContainer.eContainer
        if (object instanceof Action)
            return object.eContainer.eContainer
        if (object instanceof Witness)
            return object.eContainer.eContainer
        if (object instanceof Variant)
            return object.eContainer.eContainer
        
        return null
    }

	/**
	 * An "expensive" check to convert the Rodin Markers of an input Rodin
	 * machine into issues for the corresponding XMachine.
	 * 
	 * @param mch
	 * 			The input Rodini machine
	 * 
	 * @author htson
	 * @since 2.0
	 */
	@Check(EXPENSIVE)
	def checkRodinMarkers(Machine mch) {
		val mchRoot = EventBEMFUtils.getRoot(mch)
		val rodinMarkers = findRodinMarkers(mchRoot)
		for (rodinMarker : rodinMarkers) {
			val rodinElement = RodinMarkerUtil.getElement(rodinMarker)
			var obj = getEObject(mch, rodinElement)
			if (obj === null)
				obj = mch
			createIssue(obj, rodinMarker)
		}
	}

	/**
	 * A "Normal" check to clear the markers associated with the Rodin machine.
	 * This is important as the markers generated as the consequence of
	 * @link{#checkRodinMarkers(Machine)} are not cleared by when the file is
	 * saved (hence they prevent the generator to run).
	 * 
	 * @author htson
	 * @since 2.0
	 */
	@Check(NORMAL)
	def clearRodinMarkers(Machine mch) {
		// htson: This clear all markers associated with the XMachine file.
		// We probably should register a new marker type and clear only those.
		val uri = mch.eResource.URI
		val resource = ResourcesPlugin.workspace.root.getFile(
			new Path(uri.toPlatformString(true))
		)
		val markers = resource.findMarkers(null, true,
				IResource.DEPTH_INFINITE);
		for (marker : markers)
			marker.delete
				
	}

	/**
	 * Method to find the EObject in a machine corresponding to the input Rodin
	 * object. This is the "identified" attribute such as "identifier", "label".
	 * 
	 * @param mch
	 *			The input machine
	 * @param rodinElement
	 * 			The input Rodin element
	 * @return the EObject corresponding to the input Rodin element within the
	 *  		input machine or <code>null</code>  
	 *
	 */
	// TODO These methods probably should go into EMFEventBUtils
	def private EObject getEObject(Machine mch, IRodinElement rodinElement) {
		if (rodinElement instanceof IMachineRoot) {
			return mch
		}
		if (rodinElement instanceof IVariable) {
			return findVariable(mch, rodinElement.identifierString)			
		}
		if (rodinElement instanceof IInvariant) {
			return findInvariant(mch, rodinElement.label)
		}
		if (rodinElement instanceof IEvent) {
			return findEvent(mch, rodinElement.label)
		}
		if (rodinElement instanceof IParameter) {
			val event = rodinElement.parent as IEvent
			return findParameter(mch, event.label, rodinElement.identifierString)
		}
		if (rodinElement instanceof IGuard) {
			val event = rodinElement.parent as IEvent
			return findGuard(mch, event.label, rodinElement.label)
		}
		if (rodinElement instanceof IAction) {
			val event = rodinElement.parent as IEvent
			return findAction(mch, event.label, rodinElement.label)
		}
		return null
	}
	
	def private Variable findVariable(Machine mch, String name) {
		val variables = mch.variables
		for (variable : variables) {
			if (variable.name == name)
				return variable
		}
		return null
	}

	def private Invariant findInvariant(Machine mch, String label) {
		val invariants = mch.invariants
		for (invariant : invariants) {
			if (invariant.name == label)
				return invariant
		}
		return null
	}
	
	def private Event findEvent(Machine mch, String label) {
		val events = mch.events
		for (event : events) {
			if (event.name == label)
				return event
		}
		return null
	}
	
	def private Parameter findParameter(Machine mch, String eventLabel, String parameterName) {
		val event = findEvent(mch, eventLabel)
		if (event === null)
			return null
		val parameters = event.parameters
		for (parameter : parameters) {
			if (parameter.name == parameterName)
				return parameter
		}
		return null		
	}

	def private Guard findGuard(Machine mch, String eventLabel, String guardLabel) {
		val event = findEvent(mch, eventLabel)
		if (event === null)
			return null
		val guards = event.guards
		for (guard : guards) {
			if (guard.name == guardLabel)
				return guard
		}
		return null		
	}

	def private Action findAction(Machine mch, String eventLabel, String actionLabel) {
		val event = findEvent(mch, eventLabel)
		if (event === null)
			return null
		val actions = event.actions
		for (action : actions) {
			if (action.name == actionLabel)
				return action
		}
		return null		
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
	def untranslatedPredicate(EventBPredicate obj) {
		val predicate = obj.predicate
		val translated = RodinKeyboardCore.translate(predicate)
		if (predicate != translated)
			warning("Untranslated Predicate: " + predicate, obj,
				CorePackage.Literals.EVENT_BPREDICATE__PREDICATE,
				IValidationIssueCode.UNTRANSLATED_PREDICATE, predicate, translated
			)
	}

	/**
	 * Check for untranslated expressions by comparing the translated string
	 * with the expression. Raise a warning with code
	 * {@link IValidationIssueCode#UNTRANSLATE_EXPRESSION}. The code is used for
	 * providing quick fixes.
	 * 
	 * @param obj 
	 * 		an Event-B expression EObject.
	 * @author htson
	 * @see IValidationIssueCode
	 * @since 2.0
	 */
	@Check
	def untranslatedExpression(EventBExpression obj) {
		val expression = obj.expression
		val translated = RodinKeyboardCore.translate(expression)
		if (expression != translated)
			warning("Untranslated Expression: " + expression, obj,
				CorePackage.Literals.EVENT_BEXPRESSION__EXPRESSION,
				IValidationIssueCode.UNTRANSLATED_EXPRESSION, expression, translated
			)
	}

	/**
	 * Check for untranslated assignments by comparing the translated string
	 * with the assignment. Raise a warning with code
	 * {@link IValidationIssueCode#UNTRANSLATE_ASSIGNMENT}. The code is used for
	 * providing quick fixes.
	 * 
	 * @param obj 
	 * 		an Event-B action EObject.
	 * @author htson
	 * @see IValidationIssueCode
	 * @since 2.0
	 */
	@Check
	def untranslatedAssignment(EventBAction obj) {
		val action = obj.action
		val translated = RodinKeyboardCore.translate(action)
		if (action != translated)
			warning("Untranslated Assignment: " + action, obj,
				CorePackage.Literals.EVENT_BACTION__ACTION,
				IValidationIssueCode.UNTRANSLATED_ASSIGNMENT, action, translated
			)
	}

}
