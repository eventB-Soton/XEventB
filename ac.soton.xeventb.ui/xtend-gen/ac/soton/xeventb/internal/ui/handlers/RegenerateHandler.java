/**
 * Copyright (c) 2021 University of Southampton.
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
package ac.soton.xeventb.internal.ui.handlers;

import ac.soton.eventb.emf.inclusion.MachineInclusion;
import ac.soton.xeventb.xcontext.generator.XContextGenerator;
import ac.soton.xeventb.xmachine.generator.XMachineGenerator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eventb.emf.core.AbstractExtension;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.persistence.EMFRodinDB;

/**
 * An implementation of a handler for batch generation from CamilleX Resources.
 * 
 * @author htson
 * @version 0.1
 * @since 1.1.0
 */
@SuppressWarnings("all")
public class RegenerateHandler extends AbstractHandler implements IHandler {
  /**
   * An implementation for the handler to run the generator all all CamilleX
   * resources within the selected project. The CamilleX resources are sorted
   * so that it allows the generation of all resources.
   * 
   * @see IHandler#execute(ExecutionEvent)
   */
  @Override
  public Object execute(final ExecutionEvent event) throws ExecutionException {
    try {
      Object obj = this.getCurrentSelectedObject(event);
      if ((obj instanceof IProject)) {
        final XtextResourceSet resourceSet = new XtextResourceSet();
        final XContextGenerator xContextGenerator = new XContextGenerator();
        final XMachineGenerator xMachineGenerator = new XMachineGenerator();
        final IResourceServiceProvider.Registry reg = IResourceServiceProvider.Registry.INSTANCE;
        final IResource[] files = ((IProject)obj).members();
        ArrayList<Resource> camilleXFile = new ArrayList<Resource>();
        for (final IResource file : files) {
          if ((file instanceof IFile)) {
            if ((((IFile)file).getName().endsWith(".bucx") || ((IFile)file).getName().endsWith(".bumx"))) {
              final URI uri = URI.createPlatformResourceURI(((IFile)file).getFullPath().toString(), true);
              final Resource resource = resourceSet.getResource(uri, true);
              camilleXFile.add(resource);
            }
          }
        }
        camilleXFile.sort(new Comparator<Resource>() {
          /**
           * An implementation of Comparator#compare(Resource, Resource)
           * by consider the content of the resource and call the
           * appropriate utility methods.
           */
          @Override
          public int compare(final Resource o1, final Resource o2) {
            final EObject content1 = o1.getContents().get(0);
            final EObject content2 = o2.getContents().get(0);
            if ((content1 instanceof Context)) {
              if ((content2 instanceof Context)) {
                return RegenerateHandler.this.compare(((Context)content1), ((Context)content2));
              }
              if ((content2 instanceof Machine)) {
                return RegenerateHandler.this.compare(((Machine)content2), ((Context)content1));
              }
              return 0;
            }
            if ((content1 instanceof Machine)) {
              if ((content2 instanceof Context)) {
                return RegenerateHandler.this.compare(((Machine)content1), ((Context)content2));
              }
              if ((content2 instanceof Machine)) {
                return RegenerateHandler.this.compare(((Machine)content1), ((Machine)content2));
              }
              return 0;
            }
            return 0;
          }
        });
        final EMFRodinDB emfRodinDB = new EMFRodinDB(resourceSet);
        final TransactionalEditingDomain editingDomain = emfRodinDB.getEditingDomain();
        for (final Resource resource_1 : camilleXFile) {
          {
            final IResourceServiceProvider resourceServiceProvider = reg.getResourceServiceProvider(resource_1.getURI());
            final IResourceValidator resourceValidator = resourceServiceProvider.getResourceValidator();
            final RecordingCommand command = new RecordingCommand(editingDomain, "Generate") {
              @Override
              public void doExecute() {
                final List<Issue> issues = resourceValidator.validate(resource_1, CheckMode.NORMAL_ONLY, 
                  CancelIndicator.NullImpl);
                int _size = issues.size();
                boolean _equals = (_size == 0);
                if (_equals) {
                  final EObject content = resource_1.getContents().get(0);
                  if ((content instanceof Context)) {
                    xContextGenerator.doGenerate(resource_1, null, null);
                  } else {
                    if ((content instanceof Machine)) {
                      xMachineGenerator.doGenerate(resource_1, null, null);
                    }
                  }
                }
              }
            };
            boolean _canExecute = command.canExecute();
            if (_canExecute) {
              editingDomain.getCommandStack().execute(command);
            }
          }
        }
      }
      return null;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Utility method to compare two input contexts. The result is a negative
   * integer, zero or a positive integer as the first context is "less than"
   * "equal to" or "greater than" the second machine.  The comparison is
   * defined according to the dependency between the contexts.
   * - If c1 extends c2 then c1 > c2 and vice versa.
   * - Otherwise, c1 == c2
   * 
   * @param c1 The first input context.
   * @param c2 The second input context.
   */
  private int compare(final Context c1, final Context c2) {
    final EList<String> c1Extends = c1.getExtendsNames();
    final EList<String> c2Extends = c2.getExtendsNames();
    boolean _contains = c1Extends.contains(c2.getName());
    if (_contains) {
      return 1;
    }
    boolean _contains_1 = c2Extends.contains(c1.getName());
    if (_contains_1) {
      return (-1);
    }
    return 0;
  }
  
  /**
   * Utility method to compare a machine and a context. The result is a
   * negative integer, zero or a positive integer as the machine is "less than"
   * "equal to" or "greater than" the context.  At the moment a machine is
   * always greater than a context.
   * 
   * @param m The input machine.
   * @param c The input context.
   */
  private int compare(final Machine m, final Context c) {
    return 1;
  }
  
  /**
   * Utility method to compare two input machines. The result is a negative
   * integer, zero or a positive integer as the first machine is "less than"
   * "equal to" or "greater than" the second machine.  The comparison is
   * defined according to the dependency between the machines.
   * - If m1 refines m2 then m1 > m2 and vice versa.
   * - If m1 includes m2 then m1 > m2 and vice versa.
   * - Otherwise, m1 == m2
   * 
   * @param m1 The first input machine.
   * @param m2 The second input machine.
   * @see RegenerateHandler#refines(Machine, Machine)
   * @see RegenerateHandler#includes(Machine, Machine)
   */
  public int compare(final Machine m1, final Machine m2) {
    boolean _refines = this.refines(m1, m2);
    if (_refines) {
      return 1;
    }
    boolean _refines_1 = this.refines(m2, m1);
    if (_refines_1) {
      return (-1);
    }
    boolean _includes = this.includes(m1, m2);
    if (_includes) {
      return 1;
    }
    boolean _includes_1 = this.includes(m2, m1);
    if (_includes_1) {
      return (-1);
    }
    return 0;
  }
  
  /**
   * Utility method to check if an input machine m1 refines another input
   * machine m2. Return <code>true</code> if m1 refines m2 and
   * <code>false</code> otherwise.
   * 
   * @param m1 The first input machine.
   * @param m2 The second input machine.
   */
  public boolean refines(final Machine m1, final Machine m2) {
    final EList<String> m1Refines = m1.getRefinesNames();
    return m1Refines.contains(m2.getName());
  }
  
  /**
   * Utility method to check if an input machine m1 includes another input
   * machine m2. Return <code>true</code> if m1 includes m2 and
   * <code>false</code> otherwise.
   * 
   * @param m1 The first input machine.
   * @param m2 The second input machine.
   */
  public boolean includes(final Machine m1, final Machine m2) {
    final EList<AbstractExtension> exts = m1.getExtensions();
    boolean _isEmpty = exts.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      for (final AbstractExtension ext : exts) {
        if ((ext instanceof MachineInclusion)) {
          String _name = ((MachineInclusion)ext).getAbstractMachine().getName();
          String _name_1 = m2.getName();
          boolean _tripleEquals = (_name == _name_1);
          if (_tripleEquals) {
            return true;
          }
        }
      }
    }
    return false;
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
}
