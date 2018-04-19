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
package ac.soton.xeventb.xmachine.formatting2

import ac.soton.xeventb.xmachine.services.XMachineGrammarAccess
import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.eventb.emf.core.AbstractExtension
import org.eventb.emf.core.machine.Action
import org.eventb.emf.core.machine.Event
import org.eventb.emf.core.machine.Guard
import org.eventb.emf.core.machine.Invariant
import org.eventb.emf.core.machine.Machine
import org.eventb.emf.core.machine.Parameter
import org.eventb.emf.core.machine.Variable
import org.eventb.emf.core.machine.Witness


//import org.eclipse.xtext.formatting2.regionaccess.IComment

/**
 * <p>
 * XMachineFormatter contains custom formatting details
 * </p>
 *
 * @author dd4g12
 */
 
class XMachineFormatter extends AbstractFormatter2 {
	
	@Inject extension XMachineGrammarAccess

	def dispatch void format(Machine machine, extension IFormattableDocument document) {
	     // format HiddenRegions around keywords, attributes, cross references, etc. 
	     
		// add new lines before and after some machine keywords
		machine.regionFor.keyword("machine").prepend[newLine];
		machine.regionFor.keyword("includes").prepend[newLine];
		machine.regionFor.keyword("refines").prepend[newLine];
		machine.regionFor.keyword("sees").prepend[newLine]
		machine.regionFor.keyword("variables").prepend[newLine]
		machine.regionFor.keyword("invariants").prepend[newLine]
		machine.regionFor.keyword("variant").prepend[newLine]
		machine.regionFor.keyword("events").prepend[newLine].append[newLine];

		
		for (AbstractExtension abstractExtension : machine.getExtensions()) {
			abstractExtension.format.prepend[newLine];
			if(abstractExtension == machine.extensions.last)  // This is to avoid conflict exceptions
				abstractExtension.format.append[newLine]
		}
		for (Variable variable : machine.getVariables()) {
			variable.format.prepend[newLine];
			if(variable == machine.variables.last)  // This is to avoid conflict exceptions
				variable.format.append[newLine]
		}
		for (Invariant invariant : machine.getInvariants()) {
			invariant.format.prepend[newLine];
			if(invariant == machine.invariants.last)  // This is to avoid conflict exceptions
				invariant.format.append[newLine]
			
		}
		
//	// in case indenting invariants is required, removed to be similar to variables ...
//		interior( 
//		 	machine.regionFor.keyword('invariants'),
//		    machine.regionFor.keyword('events'), //or varaint
//		    [indent]
//        )
		
		
		machine.getVariant.format.prepend[newLine];
		
		for (Event event : machine.getEvents()) {
			event.format.append[newLines=2];

//			interior(
//		        event.regionFor.keyword('begin'),
//		        event.regionFor.keyword('end'),
//		        [indent]
//		    )	
//		    interior(
//		        event.regionFor.keyword('when'),
//		        event.regionFor.keyword('end'),
//		        [indent]
//		    )	
//		    interior(
//		        event.regionFor.keyword('then'),
//		        event.regionFor.keyword('end'),
//		        [indent]
//		    )
//		     interior(
//		        event.regionFor.keyword('where'),
//		        event.regionFor.keyword('then'),
//		        [indent]
//		    )
//		    //if there is a witness
//		    interior(
//		        event.regionFor.keyword('with'),
//		        event.regionFor.keyword('begin'),
//		        [indent]
//		    )
//		    
//		    interior(
//		        event.regionFor.keyword('when'),
//		        event.regionFor.keyword('with'),
//		        [indent]
//		    )
//		      interior(
//		        event.regionFor.keyword('where'),
//		        event.regionFor.keyword('with'),
//		        [indent]
//		    )
		}
		
  
	}

	def dispatch void format(Event event, extension IFormattableDocument document) {
		// format HiddenRegions around keywords, attributes, cross references, etc. 
				
		// add new lines before events keywords
        
	    event.regionFor.keyword("begin").prepend[newLine];
		event.regionFor.keyword("when").prepend[newLine];
		event.regionFor.keyword("where").prepend[newLine];
		event.regionFor.keyword("then").prepend[newLine];
		
		event.regionFor.keyword("refines").prepend[newLine];
		event.regionFor.keyword("any").prepend[newLine];
		event.regionFor.keyword("synchronises").prepend[newLine];
		event.regionFor.keyword("with").prepend[newLine];
		
		//add new line before event attributes and after the last attribute
		for (AbstractExtension abstractExtension : event.getExtensions()) {
			abstractExtension.format.prepend[newLine];
			if(abstractExtension == event.extensions.last)  // This is to avoid conflict exceptions
				abstractExtension.format.append[newLine]
		}
		for (Witness witness : event.getWitnesses()) {
			witness.format.prepend[newLine];
			if(witness == event.witnesses.last)
				witness.format.append[newLine]
		}
		for (Action action : event.getActions()) {
			action.format.prepend[newLine];
			if(action == event.actions.last)
				action.format.append[newLine]
		}
		for (Guard guard : event.getGuards()) {
			guard.format.prepend[newLine]
			if(guard == event.guards.last)
				guard.format.append[newLine]
		}
		for (Parameter parameter : event.getParameters()) {
			parameter.format.prepend[newLine]
			if(parameter == event.parameters.last)
				parameter.format.append[newLine]
		}
		
	}
	
}
