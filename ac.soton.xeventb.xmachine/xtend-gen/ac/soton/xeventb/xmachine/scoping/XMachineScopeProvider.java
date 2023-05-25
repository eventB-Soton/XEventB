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
package ac.soton.xeventb.xmachine.scoping;

import ac.soton.eventb.emf.containment.Containment;
import ac.soton.eventb.emf.containment.ContainmentPackage;
import ac.soton.eventb.emf.diagrams.DiagramOwner;
import ac.soton.eventb.emf.inclusion.EventSynchronisation;
import ac.soton.eventb.emf.inclusion.InclusionPackage;
import ac.soton.eventb.emf.inclusion.MachineInclusion;
import ac.soton.xeventb.common.EventBContainerManager;
import ac.soton.xeventb.common.EventBQualifiedNameProvider;
import ch.ethz.eventb.utils.EventBUtils;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eventb.core.IContextRoot;
import org.eventb.core.IEventBProject;
import org.eventb.core.IMachineRoot;
import org.eventb.core.basis.ContextRoot;
import org.eventb.core.basis.MachineRoot;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;
import org.eventb.emf.persistence.EMFRodinDB;
import org.rodinp.core.IInternalElement;
import org.rodinp.core.IRodinProject;

/**
 * <p>
 * XMachine scope provider, in particular the scope for machine refinement,
 * event refinement and event synchronisation.
 * </p>
 * 
 * @author htson
 * @author Dana - updated to include event synchronisation
 * @author asiehsalehi - updated to include record
 * @version 0.3
 * @see EMFRodinDB
 * @since 0.0.1
 */
@SuppressWarnings("all")
public class XMachineScopeProvider extends AbstractDeclarativeScopeProvider {
  /**
   * Getting the scope for the a reference feature of an input object.
   * 
   * @param context
   *          the current object.
   * @param reference
   *          the reference feature.
   */
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    try {
      final Resource resource = context.eResource();
      final ResourceSet resourceSet = resource.getResourceSet();
      if (((context instanceof Event) && Objects.equal(reference, MachinePackage.Literals.EVENT__REFINES))) {
        EObject _rootContainer = EcoreUtil2.getRootContainer(context, true);
        final Machine mch = ((Machine) _rootContainer);
        final EList<Machine> refines = mch.getRefines();
        int _length = ((Object[])Conversions.unwrapArray(refines, Object.class)).length;
        boolean _notEquals = (_length != 0);
        if (_notEquals) {
          final Machine refinedMch = refines.get(0);
          final List<Event> refinedEvts = EcoreUtil2.<Event>getAllContentsOfType(refinedMch, Event.class);
          return Scopes.scopeFor(refinedEvts);
        }
        return super.getScope(context, reference);
      }
      if (((context instanceof Machine) && Objects.equal(reference, MachinePackage.Literals.MACHINE__SEES))) {
        String prjName = this.getProjectName(((Machine) context));
        IEventBProject eBPrj = EventBUtils.getEventBProject(prjName);
        IRodinProject rdPrj = eBPrj.getRodinProject();
        IContextRoot[] ctxRoots = rdPrj.<IContextRoot>getRootElementsOfType(ContextRoot.ELEMENT_TYPE);
        ArrayList<EventBElement> ctxs = new ArrayList<EventBElement>();
        for (final IContextRoot ctxRoot : ctxRoots) {
          {
            EventBElement ctx = this.loadEventBComponent(ctxRoot, resourceSet);
            ctxs.add(ctx);
          }
        }
        return Scopes.scopeFor(ctxs);
      }
      if (((context instanceof Machine) && Objects.equal(reference, MachinePackage.Literals.MACHINE__REFINES))) {
        String prjName_1 = this.getProjectName(((Machine) context));
        IEventBProject eBPrj_1 = EventBUtils.getEventBProject(prjName_1);
        IRodinProject rdPrj_1 = eBPrj_1.getRodinProject();
        IMachineRoot[] mchRoots = rdPrj_1.<IMachineRoot>getRootElementsOfType(MachineRoot.ELEMENT_TYPE);
        ArrayList<EventBElement> mchs = new ArrayList<EventBElement>();
        for (final IMachineRoot mchRoot : mchRoots) {
          {
            EventBElement mch_1 = this.loadEventBComponent(mchRoot, resourceSet);
            mchs.add(mch_1);
          }
        }
        return Scopes.scopeFor(mchs);
      }
      if (((context instanceof EventSynchronisation) && Objects.equal(reference, InclusionPackage.Literals.EVENT_SYNCHRONISATION__SYNCHRONISED_EVENT))) {
        EObject _rootContainer_1 = EcoreUtil2.getRootContainer(context, true);
        final Machine mch_1 = ((Machine) _rootContainer_1);
        final Iterable<MachineInclusion> mchExt = Iterables.<MachineInclusion>filter(mch_1.getExtensions(), MachineInclusion.class);
        ArrayList<Event> mchEvts = new ArrayList<Event>();
        for (final MachineInclusion mchInclusion : mchExt) {
          {
            Machine abstractMch = mchInclusion.getAbstractMachine();
            EventSynchronisation evtSync = ((EventSynchronisation) context);
            boolean _isEmpty = evtSync.getPrefix().isEmpty();
            boolean _not = (!_isEmpty);
            if (_not) {
              boolean _contains = mchInclusion.getPrefixes().contains(evtSync.getPrefix());
              if (_contains) {
                mchEvts.addAll(abstractMch.getEvents());
              }
            } else {
              mchEvts.addAll(abstractMch.getEvents());
            }
          }
        }
        return Scopes.scopeFor(mchEvts);
      }
      if (((context instanceof MachineInclusion) && 
        Objects.equal(reference, InclusionPackage.Literals.MACHINE_INCLUSION__ABSTRACT_MACHINE))) {
        return this.scopeForMachineInclusion(context, reference);
      }
      if (((context instanceof Containment) && 
        Objects.equal(reference, ContainmentPackage.Literals.CONTAINMENT__EXTENSION))) {
        EObject _eContainer = context.eContainer();
        final Machine machine = ((Machine) _eContainer);
        final URI uri = EcoreUtil.getURI(machine);
        final String projectName = uri.segment(1);
        final IWorkspace workspace = ResourcesPlugin.getWorkspace();
        final IWorkspaceRoot root = workspace.getRoot();
        final IProject project = root.getProject(projectName);
        ArrayList<DiagramOwner> diagramOwners = new ArrayList<DiagramOwner>();
        final IResource[] members = project.members();
        for (final IResource file : members) {
          if ((file instanceof IFile)) {
            final String fileExtension = ((IFile)file).getFileExtension();
            boolean _equals = Objects.equal(fileExtension, "umlb");
            if (_equals) {
              final URI umlbURI = URI.createPlatformResourceURI(((IFile)file).getFullPath().toString(), true);
              final Resource umlbResource = this.loadResource(umlbURI, resourceSet);
              EObject _get = umlbResource.getContents().get(0);
              final DiagramOwner diagramOwner = ((DiagramOwner) _get);
              diagramOwners.add(diagramOwner);
            }
          }
        }
        return Scopes.scopeFor(diagramOwners);
      }
      return super.getScope(context, reference);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  /**
   * The scope for machine inclusion is the set of all (Rodin) machines
   * within the current project (reference using simple names) and the set
   * of all (XMachine) machines in the workspace (reference using qualified
   * name).
   * 
   * @author htson
   * @see EventBQualifiedNameProvider
   * @see EventBContainerManager
   * @since 0.0.8
   */
  private IScope scopeForMachineInclusion(final EObject context, final EReference reference) {
    try {
      final IScope superScope = super.getScope(context, reference);
      EMFRodinDB emfRodinDB = new EMFRodinDB();
      EObject _eContainer = context.eContainer();
      String prjName = emfRodinDB.getProjectName(((Machine) _eContainer));
      IEventBProject eBPrj = EventBUtils.getEventBProject(prjName);
      IRodinProject rdPrj = eBPrj.getRodinProject();
      IMachineRoot[] mchRoots = rdPrj.<IMachineRoot>getRootElementsOfType(MachineRoot.ELEMENT_TYPE);
      ArrayList<EventBElement> mchs = new ArrayList<EventBElement>();
      for (final IMachineRoot mchRoot : mchRoots) {
        {
          EventBElement mch = emfRodinDB.loadEventBComponent(mchRoot);
          mchs.add(mch);
        }
      }
      return Scopes.scopeFor(mchs, superScope);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  /**
   * THESE METHODS WERE COPIED FROM EMFRodinDB
   */
  private Resource loadResource(final URI fileURI, final ResourceSet resourceSet) {
    Resource resource = resourceSet.getResource(fileURI, false);
    if ((resource == null)) {
      resource = resourceSet.createResource(fileURI);
    }
    boolean _isLoaded = resource.isLoaded();
    boolean _not = (!_isLoaded);
    if (_not) {
      final boolean deliver = resource.eDeliver();
      resource.eSetDeliver(false);
      try {
        resource.load(Collections.<Object, Object>emptyMap());
      } catch (final Throwable _t) {
        if (_t instanceof IOException) {
          return null;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      } finally {
        resource.eSetDeliver(deliver);
      }
    }
    return resource;
  }

  /**
   * this returns the project name by checking the uri of the given element
   * The element must be loaded or an npe will occur
   * 
   * @param element
   * @return
   */
  private String getProjectName(final EventBElement element) {
    final URI uri = EcoreUtil.getURI(element);
    return uri.segment(1);
  }

  /**
   * loads an Event-B component (URI) into EMF
   * 
   * @param root
   * @return
   */
  private EventBElement loadEventBComponent(final URI fileURI, final ResourceSet resourceSet) {
    final Resource resource = this.loadResource(fileURI, resourceSet);
    if ((resource == null)) {
      return null;
    }
    if (((resource.isLoaded() && (!resource.getContents().isEmpty())) && (resource.getContents().get(0) instanceof EventBElement))) {
      EObject _get = resource.getContents().get(0);
      return ((EventBElement) _get);
    } else {
      return null;
    }
  }

  /**
   * loads an Event-B component (root) into EMF
   * 
   * @param root
   * @return
   */
  private EventBElement loadEventBComponent(final IInternalElement element, final ResourceSet resourceSet) {
    final IInternalElement root = element.getRoot();
    if (((root == null) || (!root.exists()))) {
      return null;
    }
    final URI fileURI = URI.createPlatformResourceURI(root.getResource().getFullPath().toString(), true);
    return this.loadEventBComponent(fileURI, resourceSet);
  }
}
