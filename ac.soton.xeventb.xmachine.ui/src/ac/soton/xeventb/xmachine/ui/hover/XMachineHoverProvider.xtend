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

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider
import org.eventb.emf.core.machine.Event
import ac.soton.xeventb.xmachine.ui.XMachineUiModule

/**
 * <p>
 * Implementation providing hover information for XMachine elements.
 * </p>
 * 
 * @author htson
 * @version 0.1
 * @see XMachineUiModule
 * @since 2.0
 */
class XMachineHoverProvider extends DefaultEObjectHoverProvider {
	
	def private String keyword(String keyword) {
		return "<span style=\"color:blue\"><b>" + keyword + "</b></span>"
	}

	/**
	 * Get the first line of the hover information.
	 */
	override getFirstLine(EObject obj) {
		if (obj instanceof Event) {
			return keyword("event ") + obj.label
		}
		return super.getFirstLine(obj)
	}

}
