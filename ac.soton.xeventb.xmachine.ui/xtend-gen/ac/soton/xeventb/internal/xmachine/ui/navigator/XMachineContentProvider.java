/**
 * Copyright (c) 2018 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     University of Southampton - initial API and implementation
 */
package ac.soton.xeventb.internal.xmachine.ui.navigator;

import ac.soton.xeventb.internal.xmachine.ui.navigator.XMachineNavigatorObject;
import ac.soton.xeventb.ui.AbstractXEventBContentProvider;
import ac.soton.xeventb.ui.IXEventBNavigatorObject;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.ITreeContentProvider;

/**
 * Specific sub-class for XMachine content provider.
 * 
 * @author htson
 * @version 1.0
 * @since 1.0
 */
@SuppressWarnings("all")
public final class XMachineContentProvider extends AbstractXEventBContentProvider implements ITreeContentProvider {
  /**
   * Returns the file extension, i.e., "bumx" for XMachine files.
   * 
   * @return the file extension for XMachine files.
   */
  @Override
  public String getFileExtension() {
    return "bumx";
  }
  
  /**
   * Returns the specific XMachine navigator object constructed from
   * the containing project and the corresponding EMF resource.
   * 
   * @param project
   *          The input project containing the XMachine.
   * @param resource
   *          The input resource corresponding to the XMachine.
   * @return the specific XMachine navigator object corresponding to
   *          the input project and resource.
   */
  @Override
  public IXEventBNavigatorObject getNavigatorObject(final IProject project, final IFile resource) {
    return new XMachineNavigatorObject(project, resource);
  }
}
