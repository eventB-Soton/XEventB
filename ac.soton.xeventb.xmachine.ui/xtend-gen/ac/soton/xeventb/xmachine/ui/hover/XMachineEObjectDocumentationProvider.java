/**
 * Copyright (c) 2020 University of Southampton.
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
package ac.soton.xeventb.xmachine.ui.hover;

import ac.soton.xeventb.xmachine.ui.XMachineUiModule;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.util.CancelIndicator;
import org.eventb.emf.core.machine.Action;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Guard;
import org.eventb.emf.core.machine.Parameter;
import org.eventb.emf.core.machine.Witness;

/**
 * <p>
 * Implementation providing hover information.
 * </p>
 * 
 * @author htson
 * @version 0.1
 * @see XMachineUiModule
 * @see XMachineHoverProvider
 * @since 2.0
 */
@SuppressWarnings("all")
public class XMachineEObjectDocumentationProvider implements IEObjectDocumentationProvider {
  private final String TAB = "&nbsp&nbsp&nbsp&nbsp";
  
  private final CancelIndicator cancelIndicator = new CancelIndicator() {
    @Override
    public boolean isCanceled() {
      return new NullProgressMonitor().isCanceled();
    }
  };
  
  /**
   * Method to get the documentation for an input {@link EObject}.
   */
  @Override
  public String getDocumentation(final EObject obj) {
    if ((obj instanceof Event)) {
      EcoreUtil2.resolveLazyCrossReferences(((Event)obj).eResource(), this.cancelIndicator);
      final List<Parameter> inheritedPars = this.getInheritedParameters(((Event)obj));
      final List<Guard> inheritedGrds = this.getInheritedGuards(((Event)obj));
      final List<Action> inheritedActs = this.getInheritedActions(((Event)obj));
      return this.prettyprint(((Event)obj), inheritedPars, inheritedGrds, inheritedActs);
    }
    return "";
  }
  
  /**
   * Pretty print event as HTML with inherited elements.
   */
  private String prettyprint(final Event evt, final List<Parameter> inheritedPars, final List<Guard> inheritedGrds, final List<Action> inheritedActs) {
    StringBuffer result = new StringBuffer();
    result.append("<b>any</b><br>");
    for (final Parameter par : inheritedPars) {
      {
        String _name = par.getName();
        String _plus = ((this.TAB + "<i>") + _name);
        result.append(_plus);
        if (((par.getComment() == null) || ("" == par.getComment()))) {
          result.append(" // inherited element</i><br>");
        } else {
          String _comment = par.getComment();
          String _plus_1 = (" // " + _comment);
          String _plus_2 = (_plus_1 + "</i><br>");
          result.append(_plus_2);
        }
      }
    }
    EList<Parameter> _parameters = evt.getParameters();
    for (final Parameter par_1 : _parameters) {
      {
        String _name = par_1.getName();
        String _plus = (this.TAB + _name);
        result.append(_plus);
        if (((par_1.getComment() == null) || ("" == par_1.getComment()))) {
          result.append("<br>");
        } else {
          String _comment = par_1.getComment();
          String _plus_1 = (" // " + _comment);
          String _plus_2 = (_plus_1 + "<br>");
          result.append(_plus_2);
        }
      }
    }
    result.append("<b>where</b><br>");
    for (final Guard grd : inheritedGrds) {
      {
        String _name = grd.getName();
        String _plus = ((this.TAB + "<i>@") + _name);
        String _plus_1 = (_plus + ": ");
        String _predicate = grd.getPredicate();
        String _plus_2 = (_plus_1 + _predicate);
        result.append(_plus_2);
        if (((grd.getComment() == null) || ("" == grd.getComment()))) {
          result.append(" // inherited element</i><br>");
        } else {
          String _comment = grd.getComment();
          String _plus_3 = (" // " + _comment);
          String _plus_4 = (_plus_3 + "</i><br>");
          result.append(_plus_4);
        }
      }
    }
    EList<Guard> _guards = evt.getGuards();
    for (final Guard grd_1 : _guards) {
      {
        String _name = grd_1.getName();
        String _plus = ((this.TAB + "@") + _name);
        String _plus_1 = (_plus + ": ");
        String _predicate = grd_1.getPredicate();
        String _plus_2 = (_plus_1 + _predicate);
        result.append(_plus_2);
        if (((grd_1.getComment() == null) || ("" == grd_1.getComment()))) {
          result.append("<br>");
        } else {
          String _comment = grd_1.getComment();
          String _plus_3 = (" // " + _comment);
          String _plus_4 = (_plus_3 + "<br>");
          result.append(_plus_4);
        }
      }
    }
    result.append("<b>then</b><br>");
    for (final Action act : inheritedActs) {
      {
        String _name = act.getName();
        String _plus = ((this.TAB + "<i>@") + _name);
        String _plus_1 = (_plus + ": ");
        String _action = act.getAction();
        String _plus_2 = (_plus_1 + _action);
        result.append(_plus_2);
        if (((act.getComment() == null) || ("" == act.getComment()))) {
          result.append(" // inherited element</i><br>");
        } else {
          String _comment = act.getComment();
          String _plus_3 = (" // " + _comment);
          String _plus_4 = (_plus_3 + "</i><br>");
          result.append(_plus_4);
        }
      }
    }
    EList<Action> _actions = evt.getActions();
    for (final Action act_1 : _actions) {
      {
        String _name = act_1.getName();
        String _plus = ((this.TAB + "@") + _name);
        String _plus_1 = (_plus + ": ");
        String _action = act_1.getAction();
        String _plus_2 = (_plus_1 + _action);
        result.append(_plus_2);
        if (((act_1.getComment() == null) || ("" == act_1.getComment()))) {
          result.append("<br>");
        } else {
          String _comment = act_1.getComment();
          String _plus_3 = (" // " + _comment);
          String _plus_4 = (_plus_3 + "<br>");
          result.append(_plus_4);
        }
      }
    }
    final EList<Witness> witnesses = evt.getWitnesses();
    boolean _isEmpty = witnesses.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      result.append("<b>with</b><br>");
      EList<Witness> _witnesses = evt.getWitnesses();
      for (final Witness wit : _witnesses) {
        {
          String _name = wit.getName();
          String _plus = ((this.TAB + "@") + _name);
          String _plus_1 = (_plus + ": ");
          String _predicate = wit.getPredicate();
          String _plus_2 = (_plus_1 + _predicate);
          result.append(_plus_2);
          if (((wit.getComment() == null) || ("" == wit.getComment()))) {
            result.append("<br>");
          } else {
            String _comment = wit.getComment();
            String _plus_3 = (" // " + _comment);
            String _plus_4 = (_plus_3 + "<br>");
            result.append(_plus_4);
          }
        }
      }
    }
    result.append("<b>end</b>");
    return result.toString();
  }
  
  /**
   * Utility method to get the inherited parameters.
   */
  private List<Parameter> getInheritedParameters(final Event evt) {
    boolean _isExtended = evt.isExtended();
    if (_isExtended) {
      return this.getAllParameters(evt.getRefines().get(0));
    }
    return new ArrayList<Parameter>();
  }
  
  /**
   * Utility method to get the inherited guards.
   */
  private List<Guard> getInheritedGuards(final Event evt) {
    boolean _isExtended = evt.isExtended();
    if (_isExtended) {
      return this.getAllGuards(evt.getRefines().get(0));
    }
    return new ArrayList<Guard>();
  }
  
  /**
   * Utility method to get the inherited actions.
   */
  private List<Action> getInheritedActions(final Event evt) {
    boolean _isExtended = evt.isExtended();
    if (_isExtended) {
      return this.getAllActions(evt.getRefines().get(0));
    }
    return new ArrayList<Action>();
  }
  
  /**
   * Utility method to get the all parameters including inherited parameters.
   */
  private List<Parameter> getAllParameters(final Event evt) {
    List<Parameter> result = null;
    boolean _isExtended = evt.isExtended();
    if (_isExtended) {
      result = this.getAllParameters(evt.getRefines().get(0));
    } else {
      ArrayList<Parameter> _arrayList = new ArrayList<Parameter>();
      result = _arrayList;
    }
    result.addAll(evt.getParameters());
    return result;
  }
  
  /**
   * Utility method to get the all guards including inherited guards.
   */
  private List<Guard> getAllGuards(final Event evt) {
    List<Guard> result = null;
    boolean _isExtended = evt.isExtended();
    if (_isExtended) {
      result = this.getAllGuards(evt.getRefines().get(0));
    } else {
      ArrayList<Guard> _arrayList = new ArrayList<Guard>();
      result = _arrayList;
    }
    result.addAll(evt.getGuards());
    return result;
  }
  
  /**
   * Utility method to get the all actions including inherited actions.
   */
  private List<Action> getAllActions(final Event evt) {
    List<Action> result = null;
    boolean _isExtended = evt.isExtended();
    if (_isExtended) {
      result = this.getAllActions(evt.getRefines().get(0));
    } else {
      ArrayList<Action> _arrayList = new ArrayList<Action>();
      result = _arrayList;
    }
    result.addAll(evt.getActions());
    return result;
  }
}
