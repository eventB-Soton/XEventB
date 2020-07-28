/*******************************************************************************
 *  Copyright (c) 2018 University of Southampton.
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
package ac.soton.xeventb.internal.xmachine.ui.navigator

import ac.soton.xeventb.ui.AbstractXEventBContentProvider
import org.eclipse.core.resources.IFile
import org.eclipse.jface.viewers.ITreeContentProvider

/**
 * Specific sub-class for XMachine content provider. 
 * 
 * @author htson
 * @version 1.0
 * @since 1.0 
 */
final class XMachineContentProvider
	extends AbstractXEventBContentProvider
	implements ITreeContentProvider {
	
	/**
	 * Returns the file extension, i.e., "bumx" for XMachine files.
	 * 
	 * @return the file extension for XMachine files.
	 */
	override getFileExtension() {
		return "bumx"
	}
	
	/**
	 * Returns the specific XMachine navigator object constructed from
	 * the corresponding resource.
	 * 
	 * @param resource
	 *          The input resource corresponding to the XMachine.
	 * @return the specific XMachine navigator object corresponding to
	 *          the input resource.
	 */
	override getNavigatorObject(IFile resource) {
		return new XMachineNavigatorObject(resource)
	}
	
	
}