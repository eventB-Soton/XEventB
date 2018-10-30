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

import ch.ethz.eventb.utils.EventBUtils
import org.eclipse.core.resources.IFile
import org.eclipse.jface.viewers.ITreeContentProvider
import org.eventb.core.IEventBProject
import org.eventb.core.IMachineRoot
import org.rodinp.core.IInternalElement

/**
 * Abstract implementation for Root element content provider.  This
 * implementation provide the corresponding root element as a single
 * child of a XEvent-B navigator object. 
 * 
 * @author htson
 * @version 1.0
 * @since 0.1 
 */
abstract class AbstractRootContentProvider implements ITreeContentProvider {
	
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
	def abstract IInternalElement getRoot(IEventBProject project, String name) 
	
	/**
	 * Returns the Event-B root element corresponding to the XEvent-B
	 * navigator object
	 * 
	 * @param parentElement
	 *          The input parent element
	 * @return The array containing the root element corresponding to
	 *          the input parent element.  
	 */
	override getChildren(Object parentElement) {
		if (parentElement instanceof IXEventBNavigatorObject) {
			val IFile iFile = parentElement.resource
			val project = EventBUtils.getEventBProject(iFile.project.name)
			val fileName = iFile.name
			val index = fileName.lastIndexOf('.');
			val name = fileName.substring(0, index)
	        val root = getRoot(project, name)
 		  	var Object[] children = newArrayOfSize(1)
 		  	children.set(0, root)
 		  	return children			
		}
		return newArrayOfSize(0)
	}
	
	/**
	 * Returns the children of the input element.
	 * 
	 * @param The input element
	 * 
	 * @return the children of the input element.
	 */
	override getElements(Object inputElement) {
		return getChildren(inputElement)
	}
	
	/**
	 * Returns the containing project of the input element.
	 * 
	 * @param element
	 *          The input element.
	 * @return the containing project of the input element.
	 */
	override getParent(Object element) {
		if (element instanceof IMachineRoot) {
			return element.resource.project
		}
		return null;
	}
	
	/**
	 * Returns if the input element has some children.
	 * 
	 * @return <code>true</code> if the input element has some children.
	 */
	override hasChildren(Object element) {
		return this.getChildren(element).length != 0
	}
	
}