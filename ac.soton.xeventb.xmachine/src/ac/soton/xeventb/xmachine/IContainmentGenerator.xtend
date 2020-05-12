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
 *  University of Southampton - initial API and implementation 
 *******************************************************************************/

package ac.soton.xeventb.xmachine

import ac.soton.eventb.emf.diagrams.Diagram
import org.eclipse.emf.transaction.TransactionalEditingDomain
import org.eventb.emf.core.machine.Machine
import ac.soton.xeventb.xmachine.generator.ContainmentRegistry
import ac.soton.xeventb.xmachine.generator.XMachineGenerator

/**
 * <p>
 * This is the common interface for containment generators. Client should provide the implementation to
 * process the contained component.
 * </p>
 *
 * @author htson - Initial API
 * @version 0.1
 * @see ContainmentRegistry
 * @see XMachineGenerator
 * @since 2.0
 */
interface IContainmentGenerator {

	/**
	 * Method to generate the content of the contained component into the source machine.
	 * 
	 * @param mch
	 * 		The input source machine (with contains clause)
	 * @param containedComponent
	 * 		The input contained component of the machine
	 * @param editingDomain
	 * 		The editing domain used for working with the input machine
	 */
	def void generate(Machine mch, Diagram containedComponent, TransactionalEditingDomain editingDomain)	
}