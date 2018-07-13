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

import org.eclipse.jface.action.Action
import org.eclipse.jface.action.IMenuManager
import org.eclipse.jface.action.Separator
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.jface.viewers.ISelection
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.ui.IActionBars
import org.eclipse.ui.IEditorDescriptor
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.PartInitException
import org.eclipse.ui.ide.IDE
import org.eclipse.ui.navigator.CommonActionProvider
import org.eclipse.ui.navigator.ICommonActionExtensionSite
import org.eclipse.ui.part.FileEditorInput

import static org.eclipse.ui.navigator.ICommonActionConstants.OPEN
import static org.eclipse.ui.navigator.ICommonMenuConstants.GROUP_NEW
import static org.eclipse.ui.navigator.ICommonMenuConstants.GROUP_OPEN



import static org.eclipse.ui.navigator.ICommonMenuConstants.GROUP_EDIT

/**
 * Abstract implementation for action provider for XEvent-B element.
 * 
 * @author htson, dd4g12
 * @version 1.0
 * @since 1.0 
 */
class AbstractXEventBActionProvider extends CommonActionProvider {
	
	/**
	 * Adds the following to the input action bars.
	 * <ul>
	 * <li>OPEN action
	 * </ul>
	 * 
	 * @param actionBars
	 *          The input action bars
	 */
	override fillActionBars(IActionBars actionBars) {
		super.fillActionBars(actionBars);
		val ICommonActionExtensionSite site = getActionSite();
		// forward doubleClick to doubleClickAction
		actionBars.setGlobalActionHandler(OPEN, getOpenAction(site));
		// TODO Add other actions
	
      
      actionBars.setGlobalActionHandler(GROUP_EDIT, getDeleteAction(site) );

     
 
	}
	
	/**
	 * Adds the following to the input context menu.
	 * <ul>
	 * <li>GROUP_NEW Separator
	 * 
	 * <li>GROUP_OPEN Separator
	 * 
	 * <li>OPEN Action to GROUP_OPEN.
	 * </ul>
	 * 
	 * @param menu
	 *          The input menu manager.
	 */
	override fillContextMenu(IMenuManager menu) {
		super.fillContextMenu(menu);
		val ICommonActionExtensionSite site = getActionSite();
		menu.add(new Separator(GROUP_NEW));
//		menu.appendToGroup(GROUP_NEW, getNewAction());
		menu.appendToGroup(GROUP_OPEN, getOpenAction(site));
//		menu.appendToGroup(GROUP_OPEN_WITH, buildOpenWithMenu());
//		menu.add(new Separator(GROUP_MODELLING));
//		menu.appendToGroup(GROUP_MODELLING, getDeleteAction(site));


       menu.appendToGroup(GROUP_EDIT,getDeleteAction(site))
	}

	/**
	 * Provides an open action for IXEventBNavigatorObject
	 *  
	 * @param site
	 *          The information for the action provider 
	 * @return An open action
	 */
	def Action getOpenAction(ICommonActionExtensionSite site) {
		val Action doubleClickAction = new Action("Open") {
			override run() {
				val ISelection selection = site.getStructuredViewer()
						.getSelection();
				val Object obj = (selection as IStructuredSelection)
						.getFirstElement();
				if (obj instanceof IXEventBNavigatorObject) {
					val resource = obj.resource
					val IEditorDescriptor desc = IDE.getDefaultEditor(resource);
					try {
						
						val activePage = XEventBUIPlugin.^default
								.workbench.activeWorkbenchWindow.activePage
	
						val IEditorPart editor = activePage.openEditor(
							new FileEditorInput(resource), desc.getId());
						if (editor === null) {
							// External editor
							return;
						}
					}
					catch (PartInitException e) {
						val String errorMsg = "Error opening Editor";
						MessageDialog.openError(null, null, errorMsg);
					}
				}
			}
		};
		return doubleClickAction;
	}
	
	/**
	 * Provides a delete action for IXEventBNavigatorObject
	 *  
	 * @param site
	 *          The information for the action provider 
	 * @return A delete action
	 */
	def Action getDeleteAction(ICommonActionExtensionSite site) {
		val Action doubleClickAction = new Action("Delete") {
			override run() {
				val ISelection selection = site.getStructuredViewer()
						.getSelection();
				val Object obj = (selection as IStructuredSelection)
						.getFirstElement();
				if (obj instanceof IXEventBNavigatorObject) {
					val resource = obj.resource		
					resource.delete(true,null)  //doesn't delete the outside Event-B files  
					// TODO delete event-b files as well           
				}
			}
		};
		return doubleClickAction;
	}
		
}
