/**
 * Copyright (c) 2016,2017 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     University of Southampton - initial API and implementation
 */
package ac.soton.xeventb.xmachine.scoping;

import ac.soton.eventb.emf.inclusion.EventSynchronisation;
import ac.soton.eventb.emf.inclusion.InclusionPackage;
import ac.soton.eventb.emf.inclusion.MachineInclusion;
import ac.soton.eventb.emf.record.Record;
import ac.soton.eventb.emf.record.RecordPackage;
import ac.soton.xeventb.common.EventBContainerManager;
import ac.soton.xeventb.common.EventBQualifiedNameProvider;
import ch.ethz.eventb.utils.EventBUtils;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eventb.core.IContextRoot;
import org.eventb.core.IEventBProject;
import org.eventb.core.IMachineRoot;
import org.eventb.core.basis.ContextRoot;
import org.eventb.core.basis.MachineRoot;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.EventBObject;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;
import org.eventb.emf.persistence.EMFRodinDB;
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
  @Inject
  private ResourceDescriptionsProvider rdp;
  
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
        EMFRodinDB emfRodinDB = new EMFRodinDB();
        String prjName = emfRodinDB.getProjectName(((Machine) context));
        IEventBProject eBPrj = EventBUtils.getEventBProject(prjName);
        IRodinProject rdPrj = eBPrj.getRodinProject();
        IContextRoot[] ctxRoots = rdPrj.<IContextRoot>getRootElementsOfType(ContextRoot.ELEMENT_TYPE);
        ArrayList<EventBElement> ctxs = new ArrayList<EventBElement>();
        for (final IContextRoot ctxRoot : ctxRoots) {
          {
            EventBElement ctx = emfRodinDB.loadEventBComponent(ctxRoot);
            ctxs.add(ctx);
          }
        }
        return Scopes.scopeFor(ctxs);
      }
      if (((context instanceof Machine) && Objects.equal(reference, MachinePackage.Literals.MACHINE__REFINES))) {
        EMFRodinDB emfRodinDB_1 = new EMFRodinDB();
        String prjName_1 = emfRodinDB_1.getProjectName(((Machine) context));
        IEventBProject eBPrj_1 = EventBUtils.getEventBProject(prjName_1);
        IRodinProject rdPrj_1 = eBPrj_1.getRodinProject();
        IMachineRoot[] mchRoots = rdPrj_1.<IMachineRoot>getRootElementsOfType(MachineRoot.ELEMENT_TYPE);
        ArrayList<EventBElement> mchs = new ArrayList<EventBElement>();
        for (final IMachineRoot mchRoot : mchRoots) {
          {
            EventBElement mch_1 = emfRodinDB_1.loadEventBComponent(mchRoot);
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
      if (((context instanceof Record) && Objects.equal(reference, RecordPackage.Literals.RECORD__SUBSETS))) {
        EObject _rootContainer_2 = EcoreUtil2.getRootContainer(context, true);
        final Machine mch_2 = ((Machine) _rootContainer_2);
        final ArrayList<Object> components = this.getComponentsInScope(mch_2);
        final List<Record> records = EcoreUtil2.<Record>getAllContentsOfType(mch_2, Record.class);
        records.remove(context);
        for (final Object c : components) {
          records.addAll(EcoreUtil2.<Record>getAllContentsOfType(((EObject) c), Record.class));
        }
        return Scopes.scopeFor(records);
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
  
  private ArrayList<Object> getComponentsInScope(final EventBObject eventBObject) {
    ArrayList<Object> list = new ArrayList<Object>();
    if ((eventBObject instanceof Machine)) {
      Machine m = ((Machine) eventBObject);
      list.add(m);
      EList<Context> _sees = m.getSees();
      for (final Context c : _sees) {
        CollectionExtensions.<Object>addAll(list, this.getComponentsInScope(c));
      }
    } else {
      if ((eventBObject instanceof Context)) {
        Context c_1 = ((Context) eventBObject);
        list.add(c_1);
        EList<Context> _extends = c_1.getExtends();
        for (final Context x : _extends) {
          CollectionExtensions.<Object>addAll(list, this.getComponentsInScope(x));
        }
      }
    }
    return list;
  }
}
