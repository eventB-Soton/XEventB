/**
 * Copyright (c) 2017 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     University of Southampton - initial API and implementation
 */
package ac.soton.xeventb.xmachine.validation;

import ac.soton.eventb.emf.inclusion.EventSynchronisation;
import ac.soton.eventb.emf.inclusion.MachineInclusion;
import ac.soton.xeventb.xmachine.validation.AbstractXMachineValidator;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eventb.emf.core.AbstractExtension;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Machine;

/**
 * <p>
 * XMachine validator, provides custom validation rules for the xtext machine file.
 * </p>
 * 
 * @author dana
 * @version 0.1
 * @since 1.0
 */
@SuppressWarnings("all")
public class XMachineValidator extends AbstractXMachineValidator {
  @Check
  public void checkMachineName(final Machine mch) {
    final Resource res = mch.eResource();
    final String fileName = res.getURI().lastSegment().toString();
    final String mchName = fileName.substring(0, fileName.indexOf("."));
    String _name = mch.getName();
    boolean _notEquals = (!Objects.equal(mchName, _name));
    if (_notEquals) {
      this.error("Machine name should be the same as the file name", null);
    }
  }
  
  /**
   * check the prefix of the event must be one of the prefixes of the included machine
   * that contains the synchronised event
   * 
   * @since 1.0
   */
  @Check
  public void checkEventPrefix(final EventSynchronisation evt) {
    boolean _isEmpty = evt.getPrefix().isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      final String prefix = evt.getPrefix();
      EObject _eContainer = evt.eContainer().eContainer();
      final Machine mchContainer = ((Machine) _eContainer);
      EList<AbstractExtension> _extensions = mchContainer.getExtensions();
      for (final AbstractExtension ext : _extensions) {
        if ((ext instanceof MachineInclusion)) {
          final EList<Event> events = ((MachineInclusion) ext).getAbstractMachine().getEvents();
          boolean _contains = events.contains(evt.getSynchronisedEvent());
          if (_contains) {
            boolean _contains_1 = ((MachineInclusion) ext).getPrefixes().contains(prefix);
            if (_contains_1) {
              return;
            }
          }
        }
      }
      this.error("Event prefix must be one of the included machine prefixes", null);
    }
  }
  
  /**
   * Add Prefixing warning if more than one machine is inlcuded
   * the  reason is to avoid event synchronisation problems if machines have the same event name e.g. INITIALISATION
   * 
   * @since 1.0
   */
  @Check
  public void checkMachinePrefix(final Machine mch) {
    final Iterable<MachineInclusion> mchExtensions = Iterables.<MachineInclusion>filter(mch.getExtensions(), MachineInclusion.class);
    int _size = IterableExtensions.size(mchExtensions);
    boolean _greaterThan = (_size > 1);
    if (_greaterThan) {
      for (final MachineInclusion inc : mchExtensions) {
        boolean _isEmpty = inc.getPrefixes().isEmpty();
        if (_isEmpty) {
          String _name = inc.getAbstractMachine().getName();
          String _plus = ("Prefixing is not defined for " + _name);
          String _plus_1 = (_plus + ". Possible synchronisation ambiguity. ");
          this.warning(_plus_1, null);
        }
      }
    }
  }
  
  /**
   * Check the prefix of the event must be one of the prefixes of the included machine
   * that contains the synchronised event
   * 
   * @since 1.0
   */
  @Check
  public void checkEventPrefixEmpty(final EventSynchronisation evt) {
    boolean _isEmpty = evt.getPrefix().isEmpty();
    if (_isEmpty) {
      EObject _eContainer = evt.eContainer().eContainer();
      final Machine mchContainer = ((Machine) _eContainer);
      final Iterable<MachineInclusion> mchIncExtensions = Iterables.<MachineInclusion>filter(mchContainer.getExtensions(), MachineInclusion.class);
      for (final MachineInclusion ext : mchIncExtensions) {
        boolean _contains = ext.getAbstractMachine().getEvents().contains(evt.getSynchronisedEvent());
        if (_contains) {
          boolean _isEmpty_1 = ext.getPrefixes().isEmpty();
          if (_isEmpty_1) {
            return;
          } else {
            this.warning("Prefixing should be applied to the synchronised event.", null);
          }
        }
      }
    }
  }
}
