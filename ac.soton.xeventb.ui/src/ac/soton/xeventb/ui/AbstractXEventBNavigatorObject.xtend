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

import org.eclipse.core.resources.IFile

/**
 * Abstract implementation for of an XEvent-B navigator object.
 * 
 * @author htson
 * @version 1.0
 * @since 1.0
 */
abstract class AbstractXEventBNavigatorObject
    implements IXEventBNavigatorObject {
	
	// The resource
	IFile resource
	
	/**
	 * Create an XEvent-B navigator object for the input resource.
	 * 
	 * @param resource
	 *          The input resource
	 */
	new (IFile resource) {
		this.resource = resource
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