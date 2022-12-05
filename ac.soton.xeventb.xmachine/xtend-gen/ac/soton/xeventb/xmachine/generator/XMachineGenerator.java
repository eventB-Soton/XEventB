/**
 * Copyright (c) 2016,2020 University of Southampton.
 * 
 *  This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 * 
 *  SPDX-License-Identifier: EPL-2.0
 * 
 *  Contributors:
 *    University of Southampton - initial API and implementation
 */
package ac.soton.xeventb.xmachine.generator;

import ac.soton.emf.translator.TranslatorFactory;
import ac.soton.eventb.emf.containment.Containment;
import ac.soton.eventb.emf.core.extension.coreextension.TypedVariable;
import ac.soton.eventb.emf.diagrams.DiagramOwner;
import ac.soton.xeventb.common.Utils;
import ac.soton.xeventb.xmachine.IContainmentGenerator;
import com.google.common.base.Objects;
import java.util.Collection;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eventb.emf.core.AbstractExtension;
import org.eventb.emf.core.Annotation;
import org.eventb.emf.core.CoreFactory;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.machine.Action;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Invariant;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachineFactory;
import org.eventb.emf.core.machine.Variable;
import org.eventb.emf.persistence.EMFRodinDB;
import org.eventb.emf.persistence.PersistencePlugin;
import org.eventb.emf.persistence.SaveResourcesCommand;
import org.rodinp.core.RodinCore;

/**
 * <p>
 * Generating Rodin Machine from the XMachine.
 * </p>
 * 
 * @author htson - Initial implementation
 * @author Dana (0.0.6) - Implementation for machine inclusion (0.0.6)
 * @author asiehsalehi (2.0) - Implementation for record extension (2.0)
 * @author htson (2.0) - Introduce generator for containment via extension points (2.0)
 * @author htson (2.0) - Serialised the configuration ac.soton.xeventb.xmachine.base (2.0)
 * @author htson (2.1) - Serialisation for typed variables
 * @version 2.0
 * @since 2.1
 */
@SuppressWarnings("all")
public class XMachineGenerator extends AbstractGenerator {
  private final String CONFIGURATION = "configuration";

  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    try {
      EObject _get = resource.getContents().get(0);
      final Machine mch = ((Machine) _get);
      String uriString = resource.getURI().toString();
      uriString = uriString.substring(0, uriString.lastIndexOf("bumx"));
      uriString = (uriString + "bum");
      final URI uri = URI.createURI(uriString);
      ResourceSet _resourceSet = resource.getResourceSet();
      final EMFRodinDB emfRodinDB = new EMFRodinDB(_resourceSet);
      final TransactionalEditingDomain editingDomain = emfRodinDB.getEditingDomain();
      final Resource rodinResource = emfRodinDB.getResource(uri);
      final RecordingCommand command = new RecordingCommand(editingDomain, "Set Contents") {
        @Override
        public void doExecute() {
          rodinResource.getContents().clear();
          rodinResource.getContents().add(0, mch);
          final Annotation rodinInternals = CoreFactory.eINSTANCE.createAnnotation();
          rodinInternals.setSource(PersistencePlugin.SOURCE_RODIN_INTERNAL_ANNOTATION);
          final EMap<String, String> rodinInternalDetails = rodinInternals.getDetails();
          rodinInternalDetails.put(XMachineGenerator.this.CONFIGURATION, 
            "org.eventb.core.fwd;ac.soton.xeventb.xmachine.base");
          mch.getAnnotations().add(rodinInternals);
          XMachineGenerator.this.translateTypedVariables(mch);
          XMachineGenerator.this.translateFormulae(mch);
          rodinResource.setModified(true);
        }
      };
      boolean _canExecute = command.canExecute();
      if (_canExecute) {
        editingDomain.getCommandStack().execute(command);
      }
      boolean _isEmpty = mch.getExtensions().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        TranslatorFactory _factory = TranslatorFactory.getFactory();
        final TranslatorFactory factory = ((TranslatorFactory) _factory);
        String commandId = "ac.soton.eventb.emf.inclusion.commands.include";
        boolean _canTranslate = factory.canTranslate(commandId, mch.eClass());
        if (_canTranslate) {
          final NullProgressMonitor monitor = new NullProgressMonitor();
          factory.translate(editingDomain, mch, commandId, monitor);
        }
        String recordCommandId = "ac.soton.eventb.emf.record.generator.translateAllRecords";
        boolean _canTranslate_1 = factory.canTranslate(recordCommandId, mch.eClass());
        if (_canTranslate_1) {
          final NullProgressMonitor monitor_1 = new NullProgressMonitor();
          factory.translate(editingDomain, mch, recordCommandId, monitor_1);
        }
      }
      final SaveResourcesCommand saveCommand = new SaveResourcesCommand(editingDomain);
      final IWorkspaceRunnable wsRunnable = new IWorkspaceRunnable() {
        @Override
        public void run(final IProgressMonitor monitor) {
          try {
            try {
              saveCommand.execute(monitor, null);
            } catch (final Throwable _t) {
              if (_t instanceof ExecutionException) {
                final ExecutionException e = (ExecutionException)_t;
                final Status status = new Status(IStatus.ERROR, "ac.soton.xeventb.xmachine", "Nothing", e);
                throw new CoreException(status);
              } else {
                throw Exceptions.sneakyThrow(_t);
              }
            }
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        }
      };
      final NullProgressMonitor monitor_2 = new NullProgressMonitor();
      boolean _canExecute_1 = saveCommand.canExecute();
      if (_canExecute_1) {
        final Resource[] emptyResource = {};
        RodinCore.run(wsRunnable, 
          this.getSchedulingRule(editingDomain.getResourceSet().getResources().<Resource>toArray(emptyResource)), monitor_2);
      }
      monitor_2.done();
      final ContainmentRegistry registry = ContainmentRegistry.getDefault();
      EList<AbstractExtension> _extensions = mch.getExtensions();
      for (final AbstractExtension ex : _extensions) {
        if ((ex instanceof Containment)) {
          final Containment ctmt = ((Containment) ex);
          final DiagramOwner owner = ctmt.getExtension();
          final Collection<IContainmentGenerator> generators = registry.getGenerators(owner);
          for (final IContainmentGenerator generator : generators) {
            generator.generate(mch, owner, editingDomain);
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  /**
   * Utility method to translate typed variables of a machine to variables,
   * typing invariants and initialisation action.
   * 
   * @param ctx The input machine
   */
  private void translateTypedVariables(final Machine mch) {
    Object _eGet = mch.eGet(
      CorePackage.Literals.EVENT_BELEMENT__ORDERED_CHILDREN);
    EList<EventBElement> orderedChildren = ((EList<EventBElement>) _eGet);
    int i = 0;
    while ((i < orderedChildren.size())) {
      {
        final EventBElement child = orderedChildren.get(i);
        if ((child instanceof TypedVariable)) {
          final String name = ((TypedVariable)child).getName();
          final String type = ((TypedVariable)child).getType();
          final String value = ((TypedVariable)child).getValue();
          Variable vrb = MachineFactory.eINSTANCE.createVariable();
          vrb.setName(name);
          orderedChildren.add(i, vrb);
          i++;
          if ((type != null)) {
            Invariant inv = MachineFactory.eINSTANCE.createInvariant();
            inv.setName((name + "-typeof"));
            inv.setPredicate(((name + " ∈ ") + type));
            inv.setTheorem(false);
            orderedChildren.add(i, inv);
            i++;
          }
          if ((value != null)) {
            Event initialisation = null;
            EList<Event> _events = mch.getEvents();
            for (final Event event : _events) {
              String _name = event.getName();
              boolean _equals = Objects.equal(_name, "INITIALISATION");
              if (_equals) {
                initialisation = event;
              }
            }
            if ((initialisation == null)) {
              initialisation = MachineFactory.eINSTANCE.createEvent();
              initialisation.setName("INITIALISATION");
              orderedChildren.add(i, initialisation);
              i++;
            }
            Action act = MachineFactory.eINSTANCE.createAction();
            act.setName((name + "-init"));
            act.setAction(((name + " := ") + value));
            initialisation.getOrderedChildren().add(act);
          }
        }
        i++;
      }
    }
  }

  private ISchedulingRule getSchedulingRule(final Resource[] resources) {
    int _length = resources.length;
    boolean _equals = (_length == 0);
    if (_equals) {
      return null;
    } else {
      int _length_1 = resources.length;
      boolean _equals_1 = (_length_1 == 1);
      if (_equals_1) {
        return WorkspaceSynchronizer.getFile(resources[0]);
      } else {
        final IProject project = this.getProject(resources[0]);
        for (final Resource resource : resources) {
          IProject _project = this.getProject(resource);
          boolean _notEquals = (!Objects.equal(project, _project));
          if (_notEquals) {
            return ResourcesPlugin.getWorkspace().getRoot();
          }
        }
        return project;
      }
    }
  }

  private IProject getProject(final Resource resource) {
    final IFile file = WorkspaceSynchronizer.getFile(resource);
    IProject _elvis = null;
    IProject _project = null;
    if (file!=null) {
      _project=file.getProject();
    }
    if (_project != null) {
      _elvis = _project;
    } else {
      _elvis = null;
    }
    return _elvis;
  }

  /**
   * Utility method to translate formulae in the input machine to Event-B
   * mathematics.
   * 
   * @param mch
   * 		The input machine
   * @author htson
   * @since 2.0
   */
  private void translateFormulae(final Machine mch) {
    final EList<EObject> predElements = mch.getAllContained(
      CorePackage.Literals.EVENT_BPREDICATE, false);
    Utils.translatePredicates(predElements);
    final EList<EObject> exprElements = mch.getAllContained(
      CorePackage.Literals.EVENT_BEXPRESSION, false);
    Utils.translateExpressions(exprElements);
    final EList<EObject> asgnElements = mch.getAllContained(
      CorePackage.Literals.EVENT_BACTION, false);
    Utils.translateAssignments(asgnElements);
  }
}
