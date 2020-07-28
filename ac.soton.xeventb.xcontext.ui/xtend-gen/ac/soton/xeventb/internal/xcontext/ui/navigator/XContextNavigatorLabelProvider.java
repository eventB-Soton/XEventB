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

import ac.soton.xeventb.ui.AbstractXEventBNavigatorLabelProvider;
import ac.soton.xeventb.ui.IXEventBSharedImages;
import org.eclipse.jface.viewers.ILabelProvider;

/**
 * Specific sub-class for XContext label provider for navigator.
 * 
 * @author dd4g12
 * @version 1.0
 * @since 1.0
 */
@SuppressWarnings("all")
public final class XContextNavigatorLabelProvider extends AbstractXEventBNavigatorLabelProvider implements ILabelProvider {
  /**
   * Returns the image key for XContext navigator objects.
   * 
   * @return the image key for XContext navigator objects.
   */
  @Override
  public String getImageKey() {
    return IXEventBSharedImages.IMG_XMACHINE;
  }
}
