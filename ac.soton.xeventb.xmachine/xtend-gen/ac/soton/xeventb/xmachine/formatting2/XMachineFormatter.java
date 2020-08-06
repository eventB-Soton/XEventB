/**
 * Copyright (c) 2016,2020 University of Southampton.
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
package ac.soton.xeventb.xmachine.formatting2;

import ac.soton.eventb.emf.record.Field;
import ac.soton.eventb.emf.record.Record;
import ac.soton.xeventb.xmachine.services.XMachineGrammarAccess;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.formatting2.regionaccess.IEObjectRegion;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eventb.emf.core.AbstractExtension;
import org.eventb.emf.core.machine.Action;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Guard;
import org.eventb.emf.core.machine.Invariant;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.Parameter;
import org.eventb.emf.core.machine.Variable;
import org.eventb.emf.core.machine.Variant;
import org.eventb.emf.core.machine.Witness;

/**
 * <p>
 * XMachineFormatter contains custom formatting details
 * </p>
 * 
 * @author dd4g12
 * @since 1.0
 */
@SuppressWarnings("all")
public class XMachineFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private XMachineGrammarAccess _xMachineGrammarAccess;
  
  protected void _format(final Machine machine, @Extension final IFormattableDocument document) {
    IEObjectRegion _regionForEObject = this.textRegionExtensions.regionForEObject(machine);
    boolean _tripleEquals = (_regionForEObject == null);
    if (_tripleEquals) {
      return;
    }
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(machine).keyword("includes"), _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(machine).keyword("refines"), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(machine).keyword("sees"), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(machine).keyword("variables"), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(machine).keyword("invariants"), _function_4);
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(machine).keyword("variants"), _function_5);
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(machine).keyword("events"), _function_6), _function_7);
    final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(machine).keyword("records"), _function_8);
    final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(this.textRegionExtensions.allRegionsFor(machine).ruleCallTo(this._xMachineGrammarAccess.getML_COMMENTRule()), _function_9);
    EList<AbstractExtension> _extensions = machine.getExtensions();
    for (final AbstractExtension abstractExtension : _extensions) {
      {
        final Procedure1<IHiddenRegionFormatter> _function_10 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.<AbstractExtension>prepend(document.<AbstractExtension>format(abstractExtension), _function_10);
        if ((abstractExtension instanceof Record)) {
          final Record record = ((Record) abstractExtension);
          boolean _isEmpty = record.getFields().isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            EList<Field> _fields = record.getFields();
            for (final Field field : _fields) {
              final Procedure1<IHiddenRegionFormatter> _function_11 = (IHiddenRegionFormatter it) -> {
                it.newLine();
              };
              document.<Field>prepend(document.<Field>format(field), _function_11);
            }
            final Field first = IterableExtensions.<Field>head(record.getFields());
            final Field last = IterableExtensions.<Field>last(record.getFields());
            final Procedure1<IHiddenRegionFormatter> _function_12 = (IHiddenRegionFormatter it) -> {
              it.indent();
            };
            document.set(this.textRegionExtensions.regionForEObject(first).getPreviousHiddenRegion(), this.textRegionExtensions.regionForEObject(last).getNextHiddenRegion(), _function_12);
          }
        }
        final Procedure1<IHiddenRegionFormatter> _function_13 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.append(this.textRegionExtensions.allRegionsFor(abstractExtension).ruleCallTo(this._xMachineGrammarAccess.getML_COMMENTRule()), _function_13);
      }
    }
    EList<Variable> _variables = machine.getVariables();
    for (final Variable variable : _variables) {
      {
        final Procedure1<IHiddenRegionFormatter> _function_10 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.<Variable>prepend(document.<Variable>format(variable), _function_10);
        final Procedure1<IHiddenRegionFormatter> _function_11 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.append(this.textRegionExtensions.allRegionsFor(variable).ruleCallTo(this._xMachineGrammarAccess.getML_COMMENTRule()), _function_11);
      }
    }
    EList<Invariant> _invariants = machine.getInvariants();
    for (final Invariant invariant : _invariants) {
      {
        final Procedure1<IHiddenRegionFormatter> _function_10 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.<Invariant>prepend(document.<Invariant>format(invariant), _function_10);
        final Procedure1<IHiddenRegionFormatter> _function_11 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.append(this.textRegionExtensions.allRegionsFor(invariant).ruleCallTo(this._xMachineGrammarAccess.getML_COMMENTRule()), _function_11);
      }
    }
    EList<Variant> _variants = machine.getVariants();
    for (final Variant variant : _variants) {
      {
        final Procedure1<IHiddenRegionFormatter> _function_10 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.<Variant>prepend(document.<Variant>format(variant), _function_10);
        final Procedure1<IHiddenRegionFormatter> _function_11 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.append(this.textRegionExtensions.allRegionsFor(variant).ruleCallTo(this._xMachineGrammarAccess.getML_COMMENTRule()), _function_11);
      }
    }
    EList<Event> _events = machine.getEvents();
    for (final Event event : _events) {
      final Procedure1<IHiddenRegionFormatter> _function_10 = (IHiddenRegionFormatter it) -> {
        it.setNewLines(2);
      };
      document.<Event>append(document.<Event>format(event), _function_10);
    }
    boolean _isEmpty = machine.getVariables().isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      final Variable firstVar = IterableExtensions.<Variable>head(machine.getVariables());
      final Variable lastVar = IterableExtensions.<Variable>last(machine.getVariables());
      final Procedure1<IHiddenRegionFormatter> _function_11 = (IHiddenRegionFormatter it) -> {
        it.indent();
      };
      document.set(this.textRegionExtensions.regionForEObject(firstVar).getPreviousHiddenRegion(), this.textRegionExtensions.regionForEObject(lastVar).getNextHiddenRegion(), _function_11);
    }
    boolean _isEmpty_1 = machine.getInvariants().isEmpty();
    boolean _not_1 = (!_isEmpty_1);
    if (_not_1) {
      final Invariant firstInv = IterableExtensions.<Invariant>head(machine.getInvariants());
      final Invariant lastInv = IterableExtensions.<Invariant>last(machine.getInvariants());
      final Procedure1<IHiddenRegionFormatter> _function_12 = (IHiddenRegionFormatter it) -> {
        it.indent();
      };
      document.set(this.textRegionExtensions.regionForEObject(firstInv).getPreviousHiddenRegion(), this.textRegionExtensions.regionForEObject(lastInv).getNextHiddenRegion(), _function_12);
    }
    boolean _isEmpty_2 = machine.getVariants().isEmpty();
    boolean _not_2 = (!_isEmpty_2);
    if (_not_2) {
      final Variant firstVariant = IterableExtensions.<Variant>head(machine.getVariants());
      final Variant lastVariant = IterableExtensions.<Variant>last(machine.getVariants());
      final Procedure1<IHiddenRegionFormatter> _function_13 = (IHiddenRegionFormatter it) -> {
        it.indent();
      };
      document.set(this.textRegionExtensions.regionForEObject(firstVariant).getPreviousHiddenRegion(), this.textRegionExtensions.regionForEObject(lastVariant).getNextHiddenRegion(), _function_13);
    }
    boolean _isEmpty_3 = machine.getEvents().isEmpty();
    boolean _not_3 = (!_isEmpty_3);
    if (_not_3) {
      final Event firstEvent = IterableExtensions.<Event>head(machine.getEvents());
      final Event lastEvent = IterableExtensions.<Event>last(machine.getEvents());
      final Procedure1<IHiddenRegionFormatter> _function_14 = (IHiddenRegionFormatter it) -> {
        it.indent();
      };
      document.set(this.textRegionExtensions.regionForEObject(firstEvent).getPreviousHiddenRegion(), this.textRegionExtensions.regionForEObject(lastEvent).getNextHiddenRegion(), _function_14);
    }
    boolean _isEmpty_4 = machine.getExtensions().isEmpty();
    boolean _not_4 = (!_isEmpty_4);
    if (_not_4) {
      final Iterable<Record> records = Iterables.<Record>filter(machine.getExtensions(), Record.class);
      boolean _isEmpty_5 = IterableExtensions.isEmpty(records);
      boolean _not_5 = (!_isEmpty_5);
      if (_not_5) {
        final Record first = IterableExtensions.<Record>head(records);
        final Record last = IterableExtensions.<Record>last(records);
        final Procedure1<IHiddenRegionFormatter> _function_15 = (IHiddenRegionFormatter it) -> {
          it.indent();
        };
        document.set(this.textRegionExtensions.regionForEObject(first).getPreviousHiddenRegion(), this.textRegionExtensions.regionForEObject(last).getNextHiddenRegion(), _function_15);
      }
    }
  }
  
  protected void _format(final Event event, @Extension final IFormattableDocument document) {
    IEObjectRegion _regionForEObject = this.textRegionExtensions.regionForEObject(event);
    boolean _tripleEquals = (_regionForEObject == null);
    if (_tripleEquals) {
      return;
    }
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(event).keyword("synchronises"), _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(event).keyword("refines"), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(event).keyword("any"), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(event).keyword("when"), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(event).keyword("where"), _function_4);
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(event).keyword("with"), _function_5);
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(event).keyword("begin"), _function_6);
    final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(event).keyword("then"), _function_7);
    final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(event).keyword("end"), _function_8);
    EList<AbstractExtension> _extensions = event.getExtensions();
    for (final AbstractExtension abstractExtension : _extensions) {
      {
        final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.<AbstractExtension>prepend(document.<AbstractExtension>format(abstractExtension), _function_9);
        AbstractExtension _last = IterableExtensions.<AbstractExtension>last(event.getExtensions());
        boolean _equals = Objects.equal(abstractExtension, _last);
        if (_equals) {
          final Procedure1<IHiddenRegionFormatter> _function_10 = (IHiddenRegionFormatter it) -> {
            it.newLine();
          };
          document.<AbstractExtension>append(document.<AbstractExtension>format(abstractExtension), _function_10);
        }
        final Procedure1<IHiddenRegionFormatter> _function_11 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.append(this.textRegionExtensions.allRegionsFor(abstractExtension).ruleCallTo(this._xMachineGrammarAccess.getML_COMMENTRule()), _function_11);
      }
    }
    EList<Parameter> _parameters = event.getParameters();
    for (final Parameter parameter : _parameters) {
      {
        final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.<Parameter>prepend(document.<Parameter>format(parameter), _function_9);
        final Procedure1<IHiddenRegionFormatter> _function_10 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.append(this.textRegionExtensions.allRegionsFor(parameter).ruleCallTo(this._xMachineGrammarAccess.getML_COMMENTRule()), _function_10);
      }
    }
    EList<Guard> _guards = event.getGuards();
    for (final Guard guard : _guards) {
      {
        final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.<Guard>prepend(document.<Guard>format(guard), _function_9);
        final Procedure1<IHiddenRegionFormatter> _function_10 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.append(this.textRegionExtensions.allRegionsFor(guard).ruleCallTo(this._xMachineGrammarAccess.getML_COMMENTRule()), _function_10);
      }
    }
    EList<Witness> _witnesses = event.getWitnesses();
    for (final Witness witness : _witnesses) {
      {
        final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.<Witness>prepend(document.<Witness>format(witness), _function_9);
        final Procedure1<IHiddenRegionFormatter> _function_10 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.append(this.textRegionExtensions.allRegionsFor(witness).ruleCallTo(this._xMachineGrammarAccess.getML_COMMENTRule()), _function_10);
      }
    }
    EList<Action> _actions = event.getActions();
    for (final Action action : _actions) {
      {
        final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.<Action>prepend(document.<Action>format(action), _function_9);
        final Procedure1<IHiddenRegionFormatter> _function_10 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.append(this.textRegionExtensions.allRegionsFor(action).ruleCallTo(this._xMachineGrammarAccess.getML_COMMENTRule()), _function_10);
      }
    }
    boolean _isEmpty = event.getParameters().isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      final Parameter firstPar = IterableExtensions.<Parameter>head(event.getParameters());
      final Parameter lastPar = IterableExtensions.<Parameter>last(event.getParameters());
      final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
        it.indent();
      };
      document.set(this.textRegionExtensions.regionForEObject(firstPar).getPreviousHiddenRegion(), this.textRegionExtensions.regionForEObject(lastPar).getNextHiddenRegion(), _function_9);
    }
    boolean _isEmpty_1 = event.getGuards().isEmpty();
    boolean _not_1 = (!_isEmpty_1);
    if (_not_1) {
      final Guard firstGrd = IterableExtensions.<Guard>head(event.getGuards());
      final Guard lastGrd = IterableExtensions.<Guard>last(event.getGuards());
      final Procedure1<IHiddenRegionFormatter> _function_10 = (IHiddenRegionFormatter it) -> {
        it.indent();
      };
      document.set(this.textRegionExtensions.regionForEObject(firstGrd).getPreviousHiddenRegion(), this.textRegionExtensions.regionForEObject(lastGrd).getNextHiddenRegion(), _function_10);
    }
    boolean _isEmpty_2 = event.getWitnesses().isEmpty();
    boolean _not_2 = (!_isEmpty_2);
    if (_not_2) {
      final Witness firstWit = IterableExtensions.<Witness>head(event.getWitnesses());
      final Witness lastWit = IterableExtensions.<Witness>last(event.getWitnesses());
      final Procedure1<IHiddenRegionFormatter> _function_11 = (IHiddenRegionFormatter it) -> {
        it.indent();
      };
      document.set(this.textRegionExtensions.regionForEObject(firstWit).getPreviousHiddenRegion(), this.textRegionExtensions.regionForEObject(lastWit).getNextHiddenRegion(), _function_11);
    }
    boolean _isEmpty_3 = event.getActions().isEmpty();
    boolean _not_3 = (!_isEmpty_3);
    if (_not_3) {
      final Action firstAct = IterableExtensions.<Action>head(event.getActions());
      final Procedure1<IHiddenRegionFormatter> _function_12 = (IHiddenRegionFormatter it) -> {
        it.newLine();
      };
      final Action lastAct = document.<Action>append(IterableExtensions.<Action>last(event.getActions()), _function_12);
      final Procedure1<IHiddenRegionFormatter> _function_13 = (IHiddenRegionFormatter it) -> {
        it.indent();
      };
      document.set(this.textRegionExtensions.regionForEObject(firstAct).getPreviousHiddenRegion(), this.textRegionExtensions.regionForEObject(lastAct).getNextHiddenRegion(), _function_13);
    }
    final Procedure1<IHiddenRegionFormatter> _function_14 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(this.textRegionExtensions.allRegionsFor(event).ruleCallTo(this._xMachineGrammarAccess.getML_COMMENTRule()), _function_14);
  }
  
  public void format(final Object machine, final IFormattableDocument document) {
    if (machine instanceof Machine) {
      _format((Machine)machine, document);
      return;
    } else if (machine instanceof Event) {
      _format((Event)machine, document);
      return;
    } else if (machine instanceof XtextResource) {
      _format((XtextResource)machine, document);
      return;
    } else if (machine instanceof EObject) {
      _format((EObject)machine, document);
      return;
    } else if (machine == null) {
      _format((Void)null, document);
      return;
    } else if (machine != null) {
      _format(machine, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(machine, document).toString());
    }
  }
}
