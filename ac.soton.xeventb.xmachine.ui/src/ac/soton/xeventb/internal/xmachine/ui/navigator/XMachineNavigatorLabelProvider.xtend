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

import ac.soton.xeventb.ui.AbstractXEventBNavigatorLabelProvider
import ac.soton.xeventb.ui.IXEventBSharedImages
import org.eclipse.jface.viewers.ILabelProvider

/**
 * Specific sub-class for XMachine label provider for navigator. 
 * 
 * @author htson
 * @version 1.0
 * @since 1.0 
 */
final class XMachineNavigatorLabelProvider
	extends AbstractXEventBNavigatorLabelProvider
	implements ILabelProvider {

	/**
	 * Returns the image key for XMachine navigator objects.
	 * 
	 * @return the image key for XMachine navigator objects.
	 */
	override getImageKey() {
		return IXEventBSharedImages.IMG_XMACHINE
	}

}
