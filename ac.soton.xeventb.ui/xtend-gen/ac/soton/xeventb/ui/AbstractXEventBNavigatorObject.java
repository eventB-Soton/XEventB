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

/**
 * Abstract implementation for of an XEvent-B navigator object.
 * 
 * @author htson
 * @version 1.0
 * @since 1.0
 */
@SuppressWarnings("all")
public abstract class AbstractXEventBNavigatorObject implements IXEventBNavigatorObject {
  private IFile resource;
  
  /**
   * Create an XEvent-B navigator object for the input resource.
   * 
   * @param resource
   *          The input resource
   */
  public AbstractXEventBNavigatorObject(final IFile resource) {
    this.resource = resource;
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
