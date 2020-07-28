/**
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
 */
package ac.soton.xeventb.internal.xcontext.ui.navigator;

import ac.soton.xeventb.ui.AbstractRootContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eventb.core.IEventBProject;
import org.rodinp.core.IInternalElement;

/**
 * A specific sub-class for context root content provider. This provide
 * the child of a XContext in the navigator.
 * 
 * @author dd4g12
 * @version 1.0
 * @since 1.0
 */
@SuppressWarnings("all")
public final class ContextRootContentProvider extends AbstractRootContentProvider implements ITreeContentProvider {
  @Override
  public IInternalElement getRoot(final IEventBProject project, final String name) {
    return project.getContextRoot(name);
  }
}
