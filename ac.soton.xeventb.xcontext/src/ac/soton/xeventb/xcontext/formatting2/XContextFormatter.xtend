/*******************************************************************************
 * Copyright (c) 2018 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     University of Southampton - initial API and implementation
 *******************************************************************************/
package ac.soton.xeventb.xcontext.formatting2

import ac.soton.xeventb.xcontext.services.XContextGrammarAccess
import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.eventb.emf.core.context.Axiom
import org.eventb.emf.core.context.CarrierSet
import org.eventb.emf.core.context.Constant
import org.eventb.emf.core.context.Context
import org.eventb.emf.core.AbstractExtension
import ac.soton.eventb.emf.record.Record

/**
 * <p>
 * XContextFormatter contains custom formatting details
 * </p>
 * 
 * @author dd4g12
 * @since 1.0
 */
class XContextFormatter extends AbstractFormatter2 {

	@Inject extension XContextGrammarAccess

	def dispatch void format(Context context, extension IFormattableDocument document) {
		// format HiddenRegions around keywords, attributes, cross references, etc. 
		// add new lines before and after some context keywords
		context.regionFor.keyword("extends").prepend[newLine];
		context.regionFor.keyword("sets").prepend[newLine];
		context.regionFor.keyword("constants").prepend[newLine];
		context.regionFor.keyword("axioms").prepend[newLine];
		context.regionFor.keyword("records").prepend[newLine];
		context.regionFor.keyword("end").prepend[newLine];

		// add new line after multi line comment
		context.allRegionsFor.ruleCallTo(ML_COMMENTRule).append[newLine]

		for (CarrierSet carrierSet : context.getSets()) {
			carrierSet.format.prepend[newLine];

			// add new line after multi line comment
			carrierSet.allRegionsFor.ruleCallTo(ML_COMMENTRule).append[newLine]
		}
		for (Constant constant : context.getConstants()) {
			constant.format.prepend[newLine];

			// add new line after multi line comment
			constant.allRegionsFor.ruleCallTo(ML_COMMENTRule).append[newLine]
		}
		for (Axiom axiom : context.getAxioms()) {
			axiom.format.prepend[newLine];

			// add new line after multi line comment
			axiom.allRegionsFor.ruleCallTo(ML_COMMENTRule).append[newLine]
		}
		// Add a line before each record
		for (AbstractExtension abstractExtension : context.getExtensions()) {
			abstractExtension.format.prepend[newLine];

			// add a line before each field
			if (abstractExtension instanceof Record) {
				val record = abstractExtension as Record
				if (!record.fields.empty) {
					//add a line before each field
					for (field : record.fields)
						field.format.prepend[newLine];
                  
                   // indent the fields
					val first = record.fields.head
					val last = record.fields.last
					set(first.regionForEObject.previousHiddenRegion, last.regionForEObject.nextHiddenRegion)[indent]
				}

			}

			// add new line after multi line comment
			abstractExtension.allRegionsFor.ruleCallTo(ML_COMMENTRule).append[newLine]
		}
		// indent the sets
		if (!context.sets.empty) {
			val firstSet = context.sets.head
			val lastSet = context.sets.last
			set(firstSet.regionForEObject.previousHiddenRegion, lastSet.regionForEObject.nextHiddenRegion)[indent]
		}

		// indent the axioms
		if (!context.axioms.empty) {
			val firstAxiom = context.axioms.head
			val lastAxiom = context.axioms.last
			set(firstAxiom.regionForEObject.previousHiddenRegion, lastAxiom.regionForEObject.nextHiddenRegion)[indent]
		}

		// indent the constants
		if (!context.constants.empty) {
			val firstCnst = context.constants.head
			val lastCnst = context.constants.last
			set(firstCnst.regionForEObject.previousHiddenRegion, lastCnst.regionForEObject.nextHiddenRegion)[indent]
		}

		// indent the records
		if (!context.extensions.empty) {
			val first = context.extensions.head
			val last = context.extensions.last
			set(first.regionForEObject.previousHiddenRegion, last.regionForEObject.nextHiddenRegion)[indent]

		}
	}

}
