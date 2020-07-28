/*******************************************************************************
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
 *******************************************************************************/
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
import static org.eclipse.ui.navigator.ICommonMenuConstants.GROUP_EDIT
import static org.eclipse.ui.navigator.ICommonMenuConstants.GROUP_NEW
import static org.eclipse.ui.navigator.ICommonMenuConstants.GROUP_OPEN


import org.eclipse.core.resources.ResourcesPlugin

/**
 * Abstract implementation for action provider for XEvent-B element.
 * 
 * @author htson, dd4g12
 * @version 1.0
 * @since 0.1 
 */
abstract class AbstractXEventBActionProvider extends CommonActionProvider {

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

		menu.appendToGroup(GROUP_OPEN, getOpenAction(site));
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
	 * Deletes the xtext as well as the corresponding Event-B files
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
					//resource.delete(true,null)  
					 
				    // find name and path change .bumx to bum 		  
				    var name = resource.name
				    name = name.substring(0,name.length-1)
				    var path = resource.location
				   
				    path = path.removeLastSegments(1)
				    path = path.addTrailingSeparator.append(name)
				 
		           val workspace= ResourcesPlugin.getWorkspace(); 
		           
		           val ifile= workspace.getRoot().getFileForLocation(path);
		          // ifile.delete(true,null)
	   
                  val shell = site.viewSite.getShell();
                  val msg = "Are you sure you want to delete \"" + resource.name + "\" and its corresponding Event-B files?";
                  val String[] options = #["Yes to All", "Yes", "No"]
                  val dialog = new MessageDialog(shell, "Confirm Delete", null, msg , MessageDialog.CONFIRM, options, 0)
                  val result = dialog.open;
                  if(result == 0){
                  	resource.delete(true,null)  //xtext
                  	ifile.delete(true,null)     //Event-B
                  }
                  	
                  else if (result == 1)
                  	resource.delete(true,null)   //only xtext
                 
	    
				}
			}
		};
		return doubleClickAction;
	}
	  
}
