/**
 * Copyright (c) 2016 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     University of Southampton - initial API and implementation
 */
package ac.soton.xeventb.internal.camillex.ui;

import ch.ethz.eventb.utils.EventBUtils;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eventb.core.IContextRoot;
import org.eventb.core.IEventBProject;
import org.eventb.core.IMachineRoot;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.persistence.EMFRodinDB;
import org.rodinp.core.IInternalElement;
import org.rodinp.core.IRodinFile;
import org.rodinp.core.RodinDBException;

/**
 * An implementation of a handler for XText Convert (from Event-B model).
 * 
 * @author htson
 * @version 0.1
 * @since 0.0.2
 */
@SuppressWarnings("all")
public class Convert2CamilleXHandler extends AbstractHandler implements IHandler {
  /**
   * (non-Javadoc)
   * 
   * @see IHandler#execute(ExecutionEvent)
   */
  @Override
  public Object execute(final ExecutionEvent event) throws ExecutionException {
    Object obj = this.getCurrentSelectedObject(event);
    if ((obj == null)) {
      return null;
    }
    if ((obj instanceof IProject)) {
      IProject prj = ((IProject) obj);
      IEventBProject eBPrj = EventBUtils.getEventBProject(prj.getName());
      if ((eBPrj != null)) {
        try {
          IRodinFile[] rodinFiles = eBPrj.getRodinProject().getRodinFiles();
          for (final IRodinFile rodinFile : rodinFiles) {
            {
              IInternalElement root = rodinFile.getRoot();
              if ((root instanceof IMachineRoot)) {
                this.convert(((IMachineRoot) root));
              } else {
                if ((root instanceof IContextRoot)) {
                  this.convert(((IContextRoot) root));
                }
              }
            }
          }
        } catch (final Throwable _t) {
          if (_t instanceof RodinDBException) {
            final RodinDBException e = (RodinDBException)_t;
            e.printStackTrace();
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      }
    } else {
      if ((obj instanceof IMachineRoot)) {
        this.convert(((IMachineRoot) obj));
      } else {
        if ((obj instanceof IContextRoot)) {
          this.convert(((IContextRoot) obj));
        }
      }
    }
    return null;
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
  private Object getCurrentSelectedObject(final ExecutionEvent event) throws ExecutionException {
    ISelection selection = HandlerUtil.getCurrentSelectionChecked(event);
    if ((selection instanceof IStructuredSelection)) {
      IStructuredSelection ssel = ((IStructuredSelection) selection);
      int _size = ssel.size();
      boolean _tripleEquals = (_size == 1);
      if (_tripleEquals) {
        return ssel.getFirstElement();
      }
    }
    return null;
  }
  
  /**
   * Converting a machine root to XMachine.
   * 
   * @param root
   *          the input machine root.
   */
  private void convert(final IMachineRoot root) {
    EMFRodinDB emfRodinDB = new EMFRodinDB();
    EventBElement mch = emfRodinDB.loadEventBComponent(root);
    String uriString = EcoreUtil.getURI(mch).toString();
    uriString = uriString.substring(0, uriString.lastIndexOf("bum"));
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(uriString);
    _builder.append("buf");
    uriString = _builder.toString();
    URI uri = URI.createURI(uriString);
    emfRodinDB.saveResource(uri, mch);
  }
  
  /**
   * Converting a context root to XContext.
   * 
   * @param root
   *          the input context root.
   */
  private void convert(final IContextRoot root) {
    EMFRodinDB emfRodinDB = new EMFRodinDB();
    EventBElement ctx = emfRodinDB.loadEventBComponent(root);
    String uriString = EcoreUtil.getURI(ctx).toString();
    uriString = uriString.substring(0, uriString.lastIndexOf("buc"));
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(uriString);
    _builder.append("buf");
    uriString = _builder.toString();
    URI uri = URI.createURI(uriString);
    emfRodinDB.saveResource(uri, ctx);
  }
}
