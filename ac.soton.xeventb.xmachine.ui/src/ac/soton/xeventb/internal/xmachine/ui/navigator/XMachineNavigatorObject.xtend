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
package ac.soton.xeventb.internal.xmachine.ui.navigator

import ac.soton.xeventb.ui.AbstractXEventBNavigatorObject
import ac.soton.xeventb.ui.IXEventBNavigatorObject
import org.eclipse.core.resources.IFile

/**
 * Specific sub-class for XMachine navigator object. 
 * 
 * @author htson
 * @version 1.0
 * @since 1.0 
 */
final class XMachineNavigatorObject
	extends AbstractXEventBNavigatorObject
	implements IXEventBNavigatorObject {
	
	/**
	 * Construct an instance of XMachine navigator object from the
	 * corresponding resource.
	 * 
	 * @param resource
	 *          The input resource
	 */
	new(IFile resource) {
		super(resource)
	}
	
}