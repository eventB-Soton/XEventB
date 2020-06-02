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
import com.google.common.base.Objects;
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
  
  private final String SPACE = "&nbsp";
  
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
  
  private String keyword(final String keyword) {
    return (("<span style=\"color:blue\"><b>" + keyword) + "</b></span>");
  }
  
  private String inheritedFormula(final String formula) {
    return (("<span style=\"color:grey\"><i>" + formula) + "</i></span>");
  }
  
  private String formula(final String formula) {
    return (("<span style=\"color:black\">" + formula) + "</span>");
  }
  
  private String inheritedLabel(final String label) {
    return (("<span style=\"color:grey\"><i>@" + label) + ":</i></span>");
  }
  
  private String label(final String label) {
    return (("<span style=\"color:black\">@" + label) + ":</span>");
  }
  
  private String inheritedComment(final String comment) {
    return ((((("<span style=\"color:grey\"><i>" + this.SPACE) + "//") + this.SPACE) + comment) + "</i></span>");
  }
  
  private String comment(final String comment) {
    return ((((("<span style=\"color:black\">" + this.SPACE) + "//") + this.SPACE) + comment) + "</span>");
  }
  
  /**
   * Pretty print event as HTML with inherited elements.
   */
  private String prettyprint(final Event evt, final List<Parameter> inheritedPars, final List<Guard> inheritedGrds, final List<Action> inheritedActs) {
    StringBuffer result = new StringBuffer();
    result.append(this.keyword("any"));
    result.append("<br>");
    for (final Parameter par : inheritedPars) {
      {
        result.append(this.TAB);
        result.append(this.inheritedFormula(par.getName()));
        if (((par.getComment() == null) || ("" == par.getComment()))) {
          result.append(this.inheritedComment("inherited element"));
        } else {
          result.append(this.inheritedComment(par.getComment()));
        }
        result.append("<br>");
      }
    }
    EList<Parameter> _parameters = evt.getParameters();
    for (final Parameter par_1 : _parameters) {
      {
        result.append(this.TAB);
        result.append(this.formula(par_1.getName()));
        if (((par_1.getComment() != null) && (!Objects.equal("", par_1.getComment())))) {
          result.append(this.comment(par_1.getComment()));
        }
        result.append("<br>");
      }
    }
    result.append(this.keyword("where"));
    result.append("<br>");
    for (final Guard grd : inheritedGrds) {
      {
        result.append(this.TAB);
        result.append(this.inheritedLabel(grd.getName()));
        result.append(this.SPACE);
        result.append(this.inheritedFormula(grd.getPredicate()));
        if (((grd.getComment() == null) || ("" == grd.getComment()))) {
          result.append(this.inheritedComment("inherited element"));
        } else {
          result.append(this.inheritedComment(grd.getComment()));
        }
        result.append("<br>");
      }
    }
    EList<Guard> _guards = evt.getGuards();
    for (final Guard grd_1 : _guards) {
      {
        result.append(this.TAB);
        result.append(this.label(grd_1.getName()));
        result.append(this.SPACE);
        result.append(this.formula(grd_1.getPredicate()));
        if (((grd_1.getComment() != null) && (!Objects.equal("", grd_1.getComment())))) {
          result.append(this.comment(grd_1.getComment()));
        }
        result.append("<br>");
      }
    }
    result.append(this.keyword("then"));
    result.append("<br>");
    for (final Action act : inheritedActs) {
      {
        result.append(this.TAB);
        result.append(this.inheritedLabel(act.getName()));
        result.append(this.SPACE);
        result.append(this.inheritedFormula(act.getAction()));
        if (((act.getComment() == null) || ("" == act.getComment()))) {
          result.append(this.inheritedComment("inherited element"));
        } else {
          result.append(this.inheritedComment(act.getComment()));
        }
        result.append("<br>");
      }
    }
    EList<Action> _actions = evt.getActions();
    for (final Action act_1 : _actions) {
      {
        result.append(this.TAB);
        result.append(this.label(act_1.getName()));
        result.append(this.SPACE);
        result.append(this.formula(act_1.getAction()));
        if (((act_1.getComment() != null) && (!Objects.equal("", act_1.getComment())))) {
          result.append(this.comment(act_1.getComment()));
        }
        result.append("<br>");
      }
    }
    final EList<Witness> witnesses = evt.getWitnesses();
    boolean _isEmpty = witnesses.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      result.append(this.keyword("with"));
      result.append("<br>");
      EList<Witness> _witnesses = evt.getWitnesses();
      for (final Witness wit : _witnesses) {
        {
          result.append(this.TAB);
          result.append(this.label(wit.getName()));
          result.append(this.SPACE);
          result.append(this.formula(wit.getPredicate()));
          if (((wit.getComment() != null) && (!Objects.equal("", wit.getComment())))) {
            result.append(this.comment(wit.getComment()));
          }
          result.append("<br>");
        }
      }
    }
    result.append(this.keyword("end"));
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
