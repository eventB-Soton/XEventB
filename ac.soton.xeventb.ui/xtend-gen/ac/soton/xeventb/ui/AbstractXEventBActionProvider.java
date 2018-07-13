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
import ac.soton.xeventb.ui.XEventBUIPlugin;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.navigator.CommonActionProvider;
import org.eclipse.ui.navigator.ICommonActionConstants;
import org.eclipse.ui.navigator.ICommonActionExtensionSite;
import org.eclipse.ui.navigator.ICommonMenuConstants;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * Abstract implementation for action provider for XEvent-B element.
 * 
 * @author htson, dd4g12
 * @version 1.0
 * @since 1.0
 */
@SuppressWarnings("all")
public class AbstractXEventBActionProvider extends CommonActionProvider {
  /**
   * Adds the following to the input action bars.
   * <ul>
   * <li>OPEN action
   * </ul>
   * 
   * @param actionBars
   *          The input action bars
   */
  @Override
  public void fillActionBars(final IActionBars actionBars) {
    super.fillActionBars(actionBars);
    final ICommonActionExtensionSite site = this.getActionSite();
    actionBars.setGlobalActionHandler(ICommonActionConstants.OPEN, this.getOpenAction(site));
    actionBars.setGlobalActionHandler(ICommonMenuConstants.GROUP_EDIT, this.getDeleteAction(site));
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
  @Override
  public void fillContextMenu(final IMenuManager menu) {
    super.fillContextMenu(menu);
    final ICommonActionExtensionSite site = this.getActionSite();
    Separator _separator = new Separator(ICommonMenuConstants.GROUP_NEW);
    menu.add(_separator);
    menu.appendToGroup(ICommonMenuConstants.GROUP_OPEN, this.getOpenAction(site));
    menu.appendToGroup(ICommonMenuConstants.GROUP_EDIT, this.getDeleteAction(site));
  }
  
  /**
   * Provides an open action for IXEventBNavigatorObject
   * 
   * @param site
   *          The information for the action provider
   * @return An open action
   */
  public Action getOpenAction(final ICommonActionExtensionSite site) {
    final Action doubleClickAction = new Action("Open") {
      @Override
      public void run() {
        final ISelection selection = site.getStructuredViewer().getSelection();
        final Object obj = ((IStructuredSelection) selection).getFirstElement();
        if ((obj instanceof IXEventBNavigatorObject)) {
          final IFile resource = ((IXEventBNavigatorObject)obj).getResource();
          final IEditorDescriptor desc = IDE.getDefaultEditor(resource);
          try {
            final IWorkbenchPage activePage = XEventBUIPlugin.getDefault().getWorkbench().getActiveWorkbenchWindow().getActivePage();
            FileEditorInput _fileEditorInput = new FileEditorInput(resource);
            final IEditorPart editor = activePage.openEditor(_fileEditorInput, desc.getId());
            if ((editor == null)) {
              return;
            }
          } catch (final Throwable _t) {
            if (_t instanceof PartInitException) {
              final PartInitException e = (PartInitException)_t;
              final String errorMsg = "Error opening Editor";
              MessageDialog.openError(null, null, errorMsg);
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
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
  public Action getDeleteAction(final ICommonActionExtensionSite site) {
    final Action doubleClickAction = new Action("Delete") {
      @Override
      public void run() {
        try {
          final ISelection selection = site.getStructuredViewer().getSelection();
          final Object obj = ((IStructuredSelection) selection).getFirstElement();
          if ((obj instanceof IXEventBNavigatorObject)) {
            final IFile resource = ((IXEventBNavigatorObject)obj).getResource();
            resource.delete(true, null);
          }
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      }
    };
    return doubleClickAction;
  }
}
