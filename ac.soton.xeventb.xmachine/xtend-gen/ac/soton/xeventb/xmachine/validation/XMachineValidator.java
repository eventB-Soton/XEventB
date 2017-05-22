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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.validation.Check;
import org.eventb.emf.core.AbstractExtension;
import org.eventb.emf.core.machine.Machine;

/**
 * <p>
 * XMachine validator, provides custom validation rules for the xtext machine file.
 * </p>
 * 
 * @author dana
 * @version
 * @see
 * @since
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
          boolean _contains = ((MachineInclusion) ext).getAbstractMachine().getEvents().contains(evt.getSynchronisedEvent());
          if (_contains) {
            boolean _contains_1 = ((MachineInclusion) ext).getPrefixes().contains(prefix);
            if (_contains_1) {
              return;
            }
          }
        }
      }
    }
    this.error("Event prefix must be one of the included machine prefixes", null);
  }
}
