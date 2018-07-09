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

import ac.soton.xeventb.ui.AbstractRootContentProvider
import org.eclipse.jface.viewers.ITreeContentProvider
import org.eventb.core.IEventBProject

/**
 * A specific sub-class for machine root content provider. This provide
 * the child of a XMachine in the navigator.
 * 
 * @author htson
 * @version 1.0
 * @since 1.0 
 */
final class MachineRootContentProvider extends AbstractRootContentProvider
	implements ITreeContentProvider {
	
	override getRoot(IEventBProject project, String name) {
		return project.getMachineRoot(name)
	}
	
}