/*******************************************************************************
 * Copyright (c) 2018 University of Southampton.
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
package ac.soton.xeventb.ui

import org.eclipse.core.resources.IFile

/**
 * Common interface for of an XEvent-B navigator object.
 * 
 * @author htson
 * @version 1.0
 * @since 0.1
 * @see AbstractXEventBNavigatorObject
 */
interface IXEventBNavigatorObject {

	/**
	 * Returns the resource of the XEvent-B navigator object.
	 * 
	 * @return the resource of the XEvent-B navigator object.
	 */
	def abstract IFile getResource()

}
