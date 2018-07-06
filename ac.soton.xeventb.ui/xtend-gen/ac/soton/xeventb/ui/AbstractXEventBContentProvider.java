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
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * Abstract implementation for of a tree content provider, which returns
 * the set of all XEvent-B constructs (given a file extension) for a
 * project.
 * 
 * @author htson
 * @version 1.0
 * @since 1.0
 * @see IXEventBNavigatorObject
 */
@SuppressWarnings("all")
public abstract class AbstractXEventBContentProvider implements ITreeContentProvider {
  /**
   * Method to return the file extension of the XEvent-B construct.
   * 
   * @return the file extension
   * @since 1.0
   */
  public abstract String getFileExtension();
  
  /**
   * Return the navigator object which is a wrapper for the input
   * resource.  This object will be used in the navigator.
   * 
   * @param project
   *          The project containing the resource.
   * @param resource
   *          The resource containing the XEvent-B construct.
   * @return The navigator object wrapper corresponding to the input
   *          project and resource
   * @since 1.0
   */
  public abstract IXEventBNavigatorObject getNavigatorObject(final IProject project, final IFile resource);
  
  /**
   * Returns the array of navigator objects corresponding to the
   * resource with the extension given by
   * {@link AbstractXEventBContentProvider#getFileExtension()}.
   * 
   * @param parentElement
   *          The input parent element.
   * @return the list of navigator objects
   * @since 1.0
   * @see IXEventBNavigatorObject
   */
  @Override
  public Object[] getChildren(final Object parentElement) {
    try {
      List<IXEventBNavigatorObject> children = new ArrayList<IXEventBNavigatorObject>();
      if ((parentElement instanceof IProject)) {
        final IResource[] resources = ((IProject)parentElement).members();
        for (final IResource resource : resources) {
          {
            final String fileExtension = resource.getFileExtension();
            String _fileExtension = this.getFileExtension();
            boolean _equals = Objects.equal(fileExtension, _fileExtension);
            if (_equals) {
              final IXEventBNavigatorObject navObj = this.getNavigatorObject(((IProject)parentElement), ((IFile) resource));
              children.add(navObj);
            }
          }
        }
      }
      final List<IXEventBNavigatorObject> _converted_children = (List<IXEventBNavigatorObject>)children;
      IXEventBNavigatorObject[] childrenArray = new IXEventBNavigatorObject[((Object[])Conversions.unwrapArray(_converted_children, Object.class)).length];
      childrenArray = children.<IXEventBNavigatorObject>toArray(childrenArray);
      return childrenArray;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Returns the children of the input element.
   * 
   * @param inputElement
   *          The input element.
   * @return the children of the input element.
   * @since 1.0
   */
  @Override
  public Object[] getElements(final Object inputElement) {
    return this.getChildren(inputElement);
  }
  
  /**
   * Returns the project containing the navigator object's resource
   * 
   * @returns the project containing the navigator object's resource
   */
  @Override
  public Object getParent(final Object element) {
    if ((element instanceof IXEventBNavigatorObject)) {
      return ((IXEventBNavigatorObject)element).getProject();
    }
    return null;
  }
  
  /**
   * Returns whether or not the input element has some children.
   * 
   * @return <code>true</code> if the input element has some children.
   */
  @Override
  public boolean hasChildren(final Object element) {
    int _length = this.getChildren(element).length;
    return (_length != 0);
  }
}
