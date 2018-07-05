/***********************************************************************
 * Copyright (c) 2018 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     University of Southampton - initial API and implementation
 **********************************************************************/
package ac.soton.xeventb.ui

import org.eclipse.core.resources.IProject
import org.eclipse.emf.ecore.resource.Resource

/**
 * Abstract implementation for of an XEvent-B navigator object.
 * 
 * @author htson
 * @version 1.0
 * @since 1.0
 */
abstract class AbstractXEventBNavigatorObject
    implements IXEventBNavigatorObject {
	
	// The project
	IProject project

	// The (EMF) resource
	Resource resource
	
	/**
	 * Create an XEvent-B naviagtor object for the input project and
	 * resource.
	 * 
	 * @param project
	 *          The input project
	 * @param resource
	 *          The input (EMF) resource
	 */
	new (IProject project, Resource resource) {
		this.project = project
		this.resource = resource
	}

	/**
	 * Returns the project of the XEvent-B navigator object.
	 * 
	 * @return the project of the XEvent-B navigator object.
	 */
	override getProject() {
		return project
	}
	
	/**
	 * Returns the resource of the XEvent-B navigator object.
	 * 
	 * @return the resource of the XEvent-B navigator object.
	 */
	override getResource() {
		return resource
	}
	
}