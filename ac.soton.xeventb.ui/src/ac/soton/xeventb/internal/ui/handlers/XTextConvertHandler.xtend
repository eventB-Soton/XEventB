/*******************************************************************************
 * Copyright (c) 2016 University of Southampton.
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
 *******************************************************************************/
package ac.soton.xeventb.internal.ui.handlers

import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.core.commands.IHandler
import org.eclipse.core.resources.IProject
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.jface.viewers.ISelection
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.ui.handlers.HandlerUtil
import org.eventb.core.IContextRoot
import org.eventb.core.IEventBProject
import org.eventb.core.IMachineRoot
import org.eventb.emf.core.EventBElement
import org.eventb.emf.persistence.EMFRodinDB
import org.rodinp.core.IInternalElement
import org.rodinp.core.IRodinFile
import org.rodinp.core.RodinDBException
import ch.ethz.eventb.utils.EventBUtils

/** 
 * An implementation of a handler for XText Convert (from Event-B model).
 * 
 * @author htson
 * @version 0.1
 * @since 0.0.2
 */
class XTextConvertHandler extends AbstractHandler implements IHandler {
	/*
	 * (non-Javadoc)
	 * 
	 * @see IHandler#execute(ExecutionEvent)
	 */
	override Object execute(ExecutionEvent event) throws ExecutionException {
		var Object obj = getCurrentSelectedObject(event)
		if(obj === null) return null
		if (obj instanceof IProject) {
			var IProject prj = (obj as IProject)
			var IEventBProject eBPrj = EventBUtils::getEventBProject(prj.getName())
			if (eBPrj !== null) {
				try {
					var IRodinFile[] rodinFiles = eBPrj.getRodinProject().getRodinFiles()
					for (IRodinFile rodinFile : rodinFiles) {
						var IInternalElement root = rodinFile.getRoot()
						if (root instanceof IMachineRoot) {
							convert((root as IMachineRoot))
						} else if (root instanceof IContextRoot) {
							convert((root as IContextRoot))
						}
					}
				} catch (RodinDBException e) {
					e.printStackTrace()
				}

			}
		} else if (obj instanceof IMachineRoot) {
			convert((obj as IMachineRoot))
		} else if (obj instanceof IContextRoot) {
			convert((obj as IContextRoot))
		}
		return null
	}

	/** 
	 * Get the current only selected object. If more than one objects are
	 * selected, return <code>null</code>.
	 * 
	 * @param event
	 *          the execution event
	 * @return the only selected object.
	 * @throws ExecutionException
	 *          if some unexpected error occurs.
	 */
	def private Object getCurrentSelectedObject(ExecutionEvent event) throws ExecutionException {
		// Get the current selection
		var ISelection selection = HandlerUtil::getCurrentSelectionChecked(event)
		if (selection instanceof IStructuredSelection) {
			var IStructuredSelection ssel = (selection as IStructuredSelection)
			if (ssel.size() === 1) {
				return ssel.getFirstElement()
			}
		}
		return null
	}

	/** 
	 * Converting a machine root to XMachine.
	 * 
	 * @param root
	 *          the input machine root.
	 */
	def private void convert(IMachineRoot root) {
		var EMFRodinDB emfRodinDB = new EMFRodinDB()
		var EventBElement mch = emfRodinDB.loadEventBComponent(root)
		var String uriString = EcoreUtil::getURI(mch).toString()
		uriString = uriString.substring(0, uriString.lastIndexOf("bum"))
		uriString = '''«uriString»bumx'''.toString
		var URI uri = URI::createURI(uriString)
		emfRodinDB.saveResource(uri, mch)
	}

	/** 
	 * Converting a context root to XContext.
	 * 
	 * @param root
	 *          the input context root.
	 */
	def private void convert(IContextRoot root) {
		var EMFRodinDB emfRodinDB = new EMFRodinDB()
		var EventBElement ctx = emfRodinDB.loadEventBComponent(root)
		var String uriString = EcoreUtil::getURI(ctx).toString()
		uriString = uriString.substring(0, uriString.lastIndexOf("buc"))
		uriString = '''«uriString»bucx'''.toString
		var URI uri = URI::createURI(uriString)
		emfRodinDB.saveResource(uri, ctx)
	}
}
