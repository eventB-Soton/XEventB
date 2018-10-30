/*******************************************************************************
 * Copyright (c) 2017 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     University of Southampton - initial API and implementation
 *******************************************************************************/
package ac.soton.xeventb.xmachine.validation

import ac.soton.eventb.emf.inclusion.EventSynchronisation
import ac.soton.eventb.emf.inclusion.MachineInclusion
import org.eclipse.xtext.validation.Check
import org.eventb.emf.core.machine.Machine

/**
 * <p>
 * XMachine validator, provides custom validation rules for the xtext machine file.
 * </p>
 *
 * @author dana
 * @version 
 * @see
 * @since 
 */
class XMachineValidator extends AbstractXMachineValidator {

//  public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					MyDslPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}

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
          error('Event prefix must be one of the included machine prefixes',null)
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

}
