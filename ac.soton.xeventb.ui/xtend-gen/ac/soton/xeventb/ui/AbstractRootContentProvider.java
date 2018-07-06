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
import ch.ethz.eventb.utils.EventBUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eventb.core.IEventBProject;
import org.eventb.core.IMachineRoot;
import org.rodinp.core.IInternalElement;

/**
 * Abstract implementation for Root element content provider.  This
 * implementation provide the corresponding root element as a single
 * child of a XEvent-B navigator object.
 * 
 * @author htson
 * @version 1.0
 * @since 1.0
 */
@SuppressWarnings("all")
public abstract class AbstractRootContentProvider implements ITreeContentProvider {
  /**
   * Returns the root element given the Event-B project and the name
   * of the element.
   * 
   * @param project
   *          The input Event-B project.
   * @param name
   *          The name of the root element.
   * @return the root element corresponding to the input project and
   *          name.
   */
  public abstract IInternalElement getRoot(final IEventBProject project, final String name);
  
  /**
   * Returns the Event-B root element corresponding to the XEvent-B
   * navigator object
   * 
   * @param parentElement
   *          The input parent element
   * @return The array containing the root element corresponding to
   *          the input parent element.
   */
  @Override
  public Object[] getChildren(final Object parentElement) {
    if ((parentElement instanceof IXEventBNavigatorObject)) {
      final IFile iFile = ((IXEventBNavigatorObject)parentElement).getResource();
      final IEventBProject project = EventBUtils.getEventBProject(iFile.getProject().getName());
      final String fileName = iFile.getName();
      final int index = fileName.lastIndexOf(".");
      final String name = fileName.substring(0, index);
      final IInternalElement root = this.getRoot(project, name);
      Object[] children = new Object[1];
      children[0] = root;
      return children;
    }
    return new Object[0];
  }
  
  /**
   * Returns the children of the input element.
   * 
   * @param The input element
   * 
   * @return the children of the input element.
   */
  @Override
  public Object[] getElements(final Object inputElement) {
    return this.getChildren(inputElement);
  }
  
  /**
   * Returns the containing project of the input element.
   * 
   * @param element
   *          The input element.
   * @return the containing project of the input element.
   */
  @Override
  public Object getParent(final Object element) {
    if ((element instanceof IMachineRoot)) {
      return ((IMachineRoot)element).getResource().getProject();
    }
    return null;
  }
  
  /**
   * Returns if the input element has some children.
   * 
   * @return <code>true</code> if the input element has some children.
   */
  @Override
  public boolean hasChildren(final Object element) {
    int _length = this.getChildren(element).length;
    return (_length != 0);
  }
}
