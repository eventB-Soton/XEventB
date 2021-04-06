/*******************************************************************************
 * Copyright (c) 2021 University of Southampton.
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
package ac.soton.xeventb.internal.ui.handlers

import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.emf.common.util.URI
import org.eventb.emf.core.EventBElement
import org.eventb.emf.persistence.EMFRodinDB
import org.eventb.emf.persistence.SaveResourcesCommand

/**
 * A utility wrapper implementation for {@link SaveResourcesCommand}. The main
 * purpose is to avoid name clash of the execute method with the method
 * extension in {@link XTextConvertHandler}.
 * 
 * @author htson
 * @since 2.2
 */
class NullProgressSaveCommand {
	
	EMFRodinDB emfRodinDB

	URI uri
	
	EventBElement content

	/**
	 * Constructor to create a command to save some content into a resource
	 * specified by its URI using an EMF Rodin DB.
	 * 
	 * @param emfRodinDB the EMF Rodin DB to save the resource
	 * @param uri the URI of the resource
	 * @param content the content to be set for the resource. 
	 */
	new(EMFRodinDB emfRodinDB, URI uri, EventBElement content) {
		this.emfRodinDB = emfRodinDB
		this.uri = uri
		this.content = content
	}
	
	/**
	 * Method to execute the command to save (without progress monitor) when the
	 * command can be executed.
	 */
	def protected save() {
		var resource = emfRodinDB.getResource(uri)
		emfRodinDB.setContent(resource, content)
		resource.modified = true
		val cmd = new SaveResourcesCommand(emfRodinDB.editingDomain, resource)
		if (cmd.canExecute()) {
			cmd.execute(new NullProgressMonitor, null)
		}
	}
}