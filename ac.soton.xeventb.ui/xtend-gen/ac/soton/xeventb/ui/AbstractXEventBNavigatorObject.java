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
package ac.soton.xeventb.ui;

import ac.soton.xeventb.ui.IXEventBNavigatorObject;
import org.eclipse.core.resources.IFile;

/**
 * Abstract implementation for of an XEvent-B navigator object.
 * 
 * @author htson
 * @version 1.0
 * @since 0.1
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
