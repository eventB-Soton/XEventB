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
package ac.soton.xeventb.internal.ui

import org.eclipse.core.resources.IResource
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

/**
 * The navigator manager for XEvent-B constructs. This is a singleton. 
 * 
 * @author htson
 * @version 1.0
 * @since 1.0
 */
class XEventBNavigatorManager {
	// The resource set.
	ResourceSet resourceset
	
	// The singleton instance
	static XEventBNavigatorManager singleton

	/**
	 * The private constructor.
	 */
	private new() {
		resourceset = new ResourceSetImpl
	}
	
	/**
	 * Returns the default instance (create if necessary).
	 * 
	 * @returns the default instance.
	 */
	def static XEventBNavigatorManager getDefault() {
		if (singleton === null) {
			singleton = new XEventBNavigatorManager
		}
		return singleton
	}

	/**
	 * Get the (EMF) resource corresponding the input resource. This
	 * resource is added to the resource set manages by the manager.
	 * 
	 * @param resource
	 *          The input resource
	 * @returns the (EMF) resource corresponding to the input resource. 
	 */
	def Resource getResource(IResource resource) {
		val fullPath = resource.getFullPath().toString()
		val URI fileURI = URI.createPlatformResourceURI(fullPath, true);
		return resourceset.getResource(fileURI, true)
	}
}