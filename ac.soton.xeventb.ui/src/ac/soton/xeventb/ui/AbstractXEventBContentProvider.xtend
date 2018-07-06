/***********************************************************************
 * Copyright (c) 2018 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     University of Southampton - initial API and implementation
 **********************************************************************/
package ac.soton.xeventb.ui

import java.util.ArrayList
import java.util.List
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.jface.viewers.ITreeContentProvider

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
abstract class AbstractXEventBContentProvider implements ITreeContentProvider {
	
	/**
	 * Method to return the file extension of the XEvent-B construct.
	 * 
	 * @return the file extension
	 * @since 1.0
	 */
	def abstract String getFileExtension()
	
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
	def abstract IXEventBNavigatorObject getNavigatorObject(
		IFile resource
	)
	
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
	override getChildren(Object parentElement) {
		var List<IXEventBNavigatorObject> children =
		  	new ArrayList<IXEventBNavigatorObject>;

		if (parentElement instanceof IProject) {
			val resources = parentElement.members
			for (IResource resource : resources) {
				val fileExtension = resource.fileExtension
				if (fileExtension == getFileExtension()) {
					val IXEventBNavigatorObject navObj = 
						getNavigatorObject(resource as IFile) 
					children.add(navObj)
				}
			}
		}
		var IXEventBNavigatorObject[] childrenArray =
			newArrayOfSize(children.length)
		childrenArray = children.toArray(childrenArray)
		return childrenArray
	}
	
	/**
	 * Returns the children of the input element.
	 * 
	 * @param inputElement
	 *          The input element.
	 * @return the children of the input element.
	 * @since 1.0
	 */
	override getElements(Object inputElement) {
		return getChildren(inputElement)
	}

	/**
	 * Returns the project containing the navigator object's resource
	 * 
	 * @returns the project containing the navigator object's resource
	 */	
	override getParent(Object element) {
		if (element instanceof IXEventBNavigatorObject) {
			return element.resource.project
		}
		return null;
	}
	
	/**
	 * Returns whether or not the input element has some children.
	 * 
	 * @return <code>true</code> if the input element has some children.
	 */
	override hasChildren(Object element) {
		return this.getChildren(element).length != 0
	}
	
}