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
package ac.soton.xeventb.internal.xcontext.ui.navigator

import ac.soton.xeventb.ui.AbstractRootContentProvider
import org.eclipse.jface.viewers.ITreeContentProvider
import org.eventb.core.IEventBProject

/**
 * A specific sub-class for context root content provider. This provide
 * the child of a XContext in the navigator.
 * 
 * @author dd4g12
 * @version 1.0
 * @since 1.0 
 */
final class ContextRootContentProvider extends AbstractRootContentProvider
	implements ITreeContentProvider {
	
	override getRoot(IEventBProject project, String name) {
		return project.getContextRoot(name)
	}
	
}