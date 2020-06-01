/**
 * Copyright (c) 2016,2018 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     University of Southampton - initial API and implementation
 */
package ac.soton.xeventb.xcontext.generator;

import ac.soton.emf.translator.TranslatorFactory;
import ac.soton.xeventb.common.Utils;
import com.google.common.base.Objects;
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
import org.eventb.emf.core.Annotation;
import org.eventb.emf.core.CoreFactory;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.persistence.EMFRodinDB;
import org.eventb.emf.persistence.PersistencePlugin;
import org.eventb.emf.persistence.SaveResourcesCommand;
import org.rodinp.core.RodinCore;

/**
 * <p>
 * Generating Rodin Context from the XContext.
 * </p>
 * 
 * @author htson
 * @version 1.0
 * @since 0.1
 */
@SuppressWarnings("all")
public class XContextGenerator extends AbstractGenerator {
  private static final String CONFIGURATION = "configuration";
  
  /**
   * @htson Automatically compile to Rodin files
   */
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    try {
      EObject _get = resource.getContents().get(0);
      final Context ctx = ((Context) _get);
      String uriString = resource.getURI().toString();
      uriString = uriString.substring(0, uriString.lastIndexOf("bucx"));
      uriString = (uriString + "buc");
      URI uri = URI.createURI(uriString);
      ResourceSet _resourceSet = resource.getResourceSet();
      final EMFRodinDB emfRodinDB = new EMFRodinDB(_resourceSet);
      final TransactionalEditingDomain editingDomain = emfRodinDB.getEditingDomain();
      final Resource rodinResource = emfRodinDB.loadResource(uri);
      final RecordingCommand command = new RecordingCommand(editingDomain, "Set Contents") {
        @Override
        public void doExecute() {
          rodinResource.getContents().clear();
          rodinResource.getContents().add(0, ctx);
          final Annotation rodinInternals = CoreFactory.eINSTANCE.createAnnotation();
          rodinInternals.setSource(PersistencePlugin.SOURCE_RODIN_INTERNAL_ANNOTATION);
          final EMap<String, String> rodinInternalDetails = rodinInternals.getDetails();
          rodinInternalDetails.put(XContextGenerator.CONFIGURATION, 
            "org.eventb.core.fwd;ac.soton.xeventb.xcontext.base");
          ctx.getAnnotations().add(rodinInternals);
          rodinResource.setModified(true);
        }
      };
      boolean _canExecute = command.canExecute();
      if (_canExecute) {
        editingDomain.getCommandStack().execute(command);
      }
      this.translateFormulae(ctx);
      TranslatorFactory _factory = TranslatorFactory.getFactory();
      final TranslatorFactory factory = ((TranslatorFactory) _factory);
      String recordCommandId = "ac.soton.eventb.records.commands.record";
      boolean _canTranslate = factory.canTranslate(recordCommandId, ctx.eClass());
      if (_canTranslate) {
        final NullProgressMonitor monitor = new NullProgressMonitor();
        factory.translate(editingDomain, ctx, recordCommandId, monitor);
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
      final NullProgressMonitor monitor_1 = new NullProgressMonitor();
      boolean _canExecute_1 = saveCommand.canExecute();
      if (_canExecute_1) {
        final Resource[] emptyResource = {};
        RodinCore.run(wsRunnable, 
          this.getSchedulingRule(editingDomain.getResourceSet().getResources().<Resource>toArray(emptyResource)), monitor_1);
      }
      monitor_1.done();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
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
   * Utility method to translate formulae in the input context to Event-B
   * mathematics.
   * 
   * @param ctx
   * 		The input context
   * @author htson
   * @since 2.0
   */
  private void translateFormulae(final Context ctx) {
    final EList<EObject> predElements = ctx.getAllContained(
      CorePackage.Literals.EVENT_BPREDICATE, false);
    Utils.translatePredicates(predElements);
  }
}
