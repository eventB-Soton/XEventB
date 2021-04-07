/*******************************************************************************
 *  Copyright (c) 2021 University of Southampton.
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
import ac.soton.eventb.emf.core.^extension.coreextension.Type
import ac.soton.eventb.emf.core.^extension.coreextension.Value
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eventb.emf.core.CorePackage
import org.eventb.emf.core.EventBPredicate
import org.rodinp.keyboard.core.RodinKeyboardCore

/**
 * Abstract class for validating untranslated formulae, i.e., predicates,
 * expressions, assignments, types, and values.
 * 
 * @author htson - Initial API and implementation.
 * @since 2.0
 */
abstract class UntranslatedFormulaeValidator {

	/**
	 * Method to be implemented by clients to raise a warning issue for a
	 * feature of an EObject with the issue code and issue associated data.
	 * 
	 * @param message
	 * 			the message for the warning
	 * @param source
	 * 			the source object for the issue
	 * @param feature
	 * 			the feature of the source object associated with the issue
	 * @param code
	 * 			the issue code
	 * @param issueData
	 * 			the data associated with the data
	 */
	def protected void warning(String message, EObject source,
			EStructuralFeature feature, String code, String... issueData
	) 
	
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
     * @since 3.0
     */
    def untranslatedPredicate(EventBPredicate obj) {
        val predicate = obj.predicate
        val translated = RodinKeyboardCore.translate(predicate)
        if (predicate != translated)
            warning(
                "Untranslated Predicate: " + predicate,
                obj,
                CorePackage.Literals.EVENT_BPREDICATE__PREDICATE,
                IValidationIssueCode.UNTRANSLATED_PREDICATE,
                predicate,
                translated
            )
    }

    /**
     * Check for untranslated types by comparing the translated string with the
     * type. Raise a warning with code
     * {@link IValidationIssueCode#UNTRANSLATE_TYPE}. The code is used for
     * providing quick fixes.
     * 
     * @param obj 
     * 		a Type.
     * @author htson
     * @see IValidationIssueCode
     * @since 3.0
     */
	def untranslatedType(Type obj) {
        val type = obj.type
        if (type === null)
        	return
        val translated = RodinKeyboardCore.translate(type)
        if (type != translated)
            warning(
                "Untranslated Type: " + type,
                obj,
                CoreextensionPackage.Literals.TYPE__TYPE,
                IValidationIssueCode.UNTRANSLATED_TYPE,
                type,
                translated
            )
	}
    
    /**
     * Check for untranslated values by comparing the translated string with the
     * value. Raise a warning with code
     * {@link IValidationIssueCode#UNTRANSLATE_TYPE}. The code is used for
     * providing quick fixes.
     * 
     * @param obj 
     * 		a Type.
     * @author htson
     * @see IValidationIssueCode
     * @since 3.0
     */
	def untranslatedValue(Value obj) {
		val value = obj.value
		if (value === null)
			return
		val translated = RodinKeyboardCore.translate(value)
		if (value != translated)
			warning(
				"Untranslated Value: " + value,
				obj,
				CoreextensionPackage.Literals.VALUE__VALUE,
				IValidationIssueCode.UNTRANSLATED_VALUE,
				value,
				translated
			)
	}

}
