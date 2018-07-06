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
package ac.soton.xeventb.ui;

import ac.soton.xeventb.ui.IXEventBNavigatorObject;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;

/**
 * Abstract implementation for of an XEvent-B navigator object.
 * 
 * @author htson
 * @version 1.0
 * @since 1.0
 */
@SuppressWarnings("all")
public abstract class AbstractXEventBNavigatorObject implements IXEventBNavigatorObject {
  private IProject project;
  
  private IFile resource;
  
  /**
   * Create an XEvent-B naviagtor object for the input project and
   * resource.
   * 
   * @param project
   *          The input project
   * @param resource
   *          The input resource
   */
  public AbstractXEventBNavigatorObject(final IProject project, final IFile resource) {
    this.project = project;
    this.resource = resource;
  }
  
  /**
   * Returns the project of the XEvent-B navigator object.
   * 
   * @return the project of the XEvent-B navigator object.
   */
  @Override
  public IProject getProject() {
    return this.project;
  }
  
  /**
   * Returns the resource of the XEvent-B navigator object.
   * 
   * @return the resource of the XEvent-B navigator object.
   */
  @Override
  public IFile getResource() {
    return this.resource;
  }
}
