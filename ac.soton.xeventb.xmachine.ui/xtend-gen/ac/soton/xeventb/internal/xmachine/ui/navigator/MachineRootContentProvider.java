/**
 * Copyright (c) 2018 University of Southampton.
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
 */
package ac.soton.xeventb.internal.xmachine.ui.navigator;

import ac.soton.xeventb.ui.AbstractRootContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eventb.core.IEventBProject;
import org.rodinp.core.IInternalElement;

/**
 * A specific sub-class for machine root content provider. This provide
 * the child of a XMachine in the navigator.
 * 
 * @author htson
 * @version 1.0
 * @since 1.0
 */
@SuppressWarnings("all")
public final class MachineRootContentProvider extends AbstractRootContentProvider implements ITreeContentProvider {
  @Override
  public IInternalElement getRoot(final IEventBProject project, final String name) {
    return project.getMachineRoot(name);
  }
}
