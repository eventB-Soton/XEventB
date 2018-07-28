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

/**
 * A registry for common images used by the XEvent-B User Interface
 * which may be useful to other plug-ins.
 * <p>
 * This interface provides <code>Image</code> and
 * <code>ImageDescriptor</code>s for each named image in the interface.
 * All <code>Image</code> objects provided by this class are managed by
 * this class and must never be disposed by other clients.
 * </p>
 * 
 * @author htson
 * @version 1.0
 * @since 1.0
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 */
@SuppressWarnings("all")
public interface IXEventBSharedImages {
  /**
   * Image IDs, paths for XEvent-B Elements
   */
  public final static String IMG_XMACHINE = "XMachine";
  
  public final static String IMG_XMACHINE_PATH = "icons/full/obj16/xmch_obj.gif";
}
