/*******************************************************************************
 * Copyright (c) 2017,2021 University of Southampton.
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     University of Southampton - initial API and implementation
 *******************************************************************************/

package ac.soton.xeventb.xcontext.validation

import ac.soton.eventb.emf.core.^extension.coreextension.Type
import ac.soton.eventb.emf.core.^extension.coreextension.Value
import org.eclipse.core.resources.IMarker
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.Path
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.xtext.validation.Check
import org.eventb.core.IAxiom
import org.eventb.core.ICarrierSet
import org.eventb.core.IConstant
import org.eventb.core.IContextRoot
import org.eventb.emf.core.CorePackage
import org.eventb.emf.core.EventBObject
import org.eventb.emf.core.EventBPredicate
import org.eventb.emf.core.context.Axiom
import org.eventb.emf.core.context.CarrierSet
import org.eventb.emf.core.context.Constant
import org.eventb.emf.core.context.Context
import org.eventb.emf.core.context.ContextPackage
import org.eventb.emf.persistence.EventBEMFUtils
import org.rodinp.core.IAttributeType
import org.rodinp.core.IRodinElement
import org.rodinp.core.RodinMarkerUtil
import ac.soton.xeventb.common.UntranslatedFormulaeValidator

/**
 * <p>
 * XContext validator, provides custom validation rules for the XContexts.
 * </p>
 * 
 * @author dana - Initial Implementation
 * @author htson - Added support for lifting Rodin issues into XContext
 * @version 1.1
 * @since 1.0
 * @see XContextMarkerModule
 */
class XContextValidator extends AbstractXContextValidator {

	/**
	 * Object for validating untranslated formulae. This is an implementation of
	 * {@link ValidateUntranslatedFormulae} which redirect raising warnings to
	 * the method provided by {@link XContextValidator#warning(String, EObject,
	 * EStructuralFeature, String, String[])}.
	 * 
	 * @since 3.0
	 */
   	extension UntranslatedFormulaeValidator validator =
   			new UntranslatedFormulaeValidator() {
				override protected warning(String message, EObject source,
						EStructuralFeature feature, String code,
						String... issueData) {
					XContextValidator.this.warning(message, source, feature,
							code, issueData
					)
				}
			}

    /**
     * Check to ensure that the context name match the name of the file.
     * 
     * @author dana
     * @author htson - Renamed from "checkMachineName"
     * @since 2.0
     */
    @Check
    def checkContextName(Context ctx) {
        val res = ctx.eResource
        val fileName = res.URI.lastSegment.toString
        val ctxName = fileName.substring(0, fileName.indexOf('.'))
        if (ctxName != ctx.name)
            error('Context name should be the same as the file name', null)
    }

	/**
	 * Check for untranslated formulae in the context, i.e., predicates, types,
	 * and values. The actual check is done via the extension methods of
	 * {@link XContextValidator#validator}. 
	 * 
	 * @author htson
	 * @since 3.0
	 */
    @Check
    def checkUntranslatedFormulae(Context ctx) {
    	val orderedChildren = ctx.orderedChildren
		for (child : orderedChildren) {
			if (child instanceof EventBPredicate) {
				validatePredicate(child)
			}
			if (child instanceof Type) {
				validateType(child)
			}
			if (child instanceof Value) {
				validateValue(child)
			}
		}			
    }
		
    /**
     * A "Normal" check to clear the markers associated with the Rodin context.
     * This is important as the markers generated as the consequence of
     * @link{#checkRodinMarkers(Context)} are not cleared by when the file is
     * saved (hence they prevent the generator to run).
     * 
     * @author htson
     * @since 2.0
     */
    @Check(NORMAL)
    def clearRodinMarkers(Context ctx) {
        // htson: This clear all markers associated with the XContext file.
        // We probably should register a new marker type and clear only those.
        val uri = ctx.eResource.URI
        val resource = ResourcesPlugin.workspace.root.getFile(
            new Path(uri.toPlatformString(true))
        )
        val markers = resource.findMarkers(null, true, IResource.DEPTH_INFINITE);
        for (marker : markers)
            marker.delete
    }

    /**
     * Empty array of markers.
     * 
     * @since 2.0
     */
    val IMarker[] NO_MARKER = #[];

    /**
     * An "expensive" check to convert the Rodin Markers of an input Rodin
     * machine into issues for the corresponding XMachine.
     * 
     * @param mch
     * 			The input Rodin machine
     * 
     * @author htson
     * @since 2.0
     */
    @Check(EXPENSIVE)
    def checkRodinMarkers(Context ctx) {
        val ctxRoot = EventBEMFUtils.getRoot(ctx)
        val rodinMarkers = findRodinMarkers(ctxRoot)
        for (rodinMarker : rodinMarkers) {
            val rodinElement = RodinMarkerUtil.getElement(rodinMarker)
            var obj = getEObject(ctx, rodinElement)
            if (obj === null)
                obj = ctx
            createIssue(obj, rodinMarker)
        }
    }

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
    def private IMarker[] findRodinMarkers(IContextRoot ctxRoot) throws CoreException {
        val resource = ctxRoot.getResource();
        if (!resource.isAccessible()) {
            return NO_MARKER;
        }
        return resource.findMarkers(RodinMarkerUtil.RODIN_PROBLEM_MARKER, true, IResource.DEPTH_INFINITE);
    }

    /**
     * Method to find the EObject in a machine corresponding to the input Rodin
     * object. This is the "identified" attribute such as "identifier", "label".
     * 
     * @param mch
     * 		The input machine
     * @param rodinElement
     * 			The input Rodin element
     * @return the EObject corresponding to the input Rodin element within the
     *  		input machine or <code>null</code>  
     * 
     */
    // TODO These methods probably should go into EMFEventBUtils
    def private EObject getEObject(Context ctx, IRodinElement rodinElement) {
        if (rodinElement instanceof IContextRoot) {
            return ctx
        }
        if (rodinElement instanceof ICarrierSet) {
            return findCarrierSet(ctx, rodinElement.identifierString)
        }
        if (rodinElement instanceof IConstant) {
            return findConstant(ctx, rodinElement.identifierString)
        }
        if (rodinElement instanceof IAxiom) {
            return findAxiom(ctx, rodinElement.label)
        }
        return null
    }

    def private CarrierSet findCarrierSet(Context ctx, String name) {
        val sets = ctx.sets
        for (set : sets) {
            if (set.name == name)
                return set
        }
        return null
    }

    def private Constant findConstant(Context ctx, String name) {
        val csts = ctx.constants
        for (cst : csts) {
            if (cst.name == name)
                return cst
        }
        return null
    }

    def private Axiom findAxiom(Context ctx, String label) {
        val axms = ctx.axioms
        for (axm : axms) {
            if (axm.name == label)
                return axm
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
        if (feature === null) {
            elem = getContext(obj)
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
    def private EStructuralFeature getFeature(
        EObject obj,
        IAttributeType attributeType // This is the Rodin Attribute Type
    ) {
        if (attributeType === null)
            return null
        val id = attributeType.id
        if (obj instanceof CarrierSet) {
            // "Identifier" for carrier sets will be "name"
            if (id == "org.eventb.core.identifier")
                return CorePackage.Literals.EVENT_BNAMED__NAME
            return null
        }
        if (obj instanceof Constant) {
            // "Identifier" for constants will be "name"
            if (id == "org.eventb.core.identifier")
                return CorePackage.Literals.EVENT_BNAMED__NAME
            return null
        }
        if (obj instanceof Axiom) {
            // "Identifier" for variables will be "name"
            if (id == "org.eventb.core.label")
                return CorePackage.Literals.EVENT_BNAMED__NAME
            if (id == "org.eventb.core.predicate")
                return CorePackage.Literals.EVENT_BPREDICATE__PREDICATE
            return null
        }
        return null
    }

    /**
     * Utility method to get the context of an EObject. Return the Context 
     * parent of the input element. Return <code>null</code> if there is no
     * Context containing the input element.
     * 
     * @param obj
     *          The input EObject
     * @author htson
     * @since 2.1
     */
    def EObject getContext(EObject object) {
        if (object instanceof EventBObject)
            return object.getContaining(ContextPackage.Literals.CONTEXT)
        return null
    }

}
