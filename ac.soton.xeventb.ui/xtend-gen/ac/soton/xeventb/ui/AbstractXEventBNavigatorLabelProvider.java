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

import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

/**
 * Abstract implementation for of a label provider for XEvent-B
 * navigator objects.
 * 
 * @author htson
 * @version 1.0
 * @since 0.1
 * @see IXEventBNavigatorObject
 */
@SuppressWarnings("all")
public abstract class AbstractXEventBNavigatorLabelProvider implements ILabelProvider {
  /**
   * Return the key to get the image from the image registry of this
   * XEvent-B UI plugin.
   * 
   * @return the key to retrieve the image from the registry
   */
  public abstract String getImageKey();
  
  /**
   * Do nothing at the moment.
   */
  @Override
  public void addListener(final ILabelProviderListener listener) {
  }
  
  /**
   * Do nothing at the moment.
   */
  @Override
  public void dispose() {
  }
  
  /**
   * Do nothing at the moment.
   */
  @Override
  public boolean isLabelProperty(final Object element, final String property) {
    return false;
  }
  
  /**
   * Do nothing at the moment.
   */
  @Override
  public void removeListener(final ILabelProviderListener listener) {
  }
  
  /**
   * Returns the image corresponding to the image key.
   * 
   * @param element
   *          The input element.
   * @return the image corresponding to the image key.
   */
  @Override
  public Image getImage(final Object element) {
    if ((element instanceof IXEventBNavigatorObject)) {
      final ImageRegistry registry = XEventBUIPlugin.getDefault().getImageRegistry();
      return registry.get(this.getImageKey());
    }
    return null;
  }
  
  /**
   * Returns the file name of the resource of the XEvent-B navigator
   * object.
   * 
   * @param element
   *          The input element.
   * @return the file name of the resource of the input navigator
   *          object.
   */
  @Override
  public String getText(final Object element) {
    if ((element instanceof IXEventBNavigatorObject)) {
      return ((IXEventBNavigatorObject)element).getResource().getName();
    }
    return null;
  }
}
