/**
 * Copyright (c) 2018 University of Southampton.
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
package ac.soton.xeventb.xcontext.formatting2;

import ac.soton.eventb.emf.record.Field;
import ac.soton.eventb.emf.record.Record;
import ac.soton.xeventb.xcontext.services.XContextGrammarAccess;
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
import org.eventb.emf.core.context.Axiom;
import org.eventb.emf.core.context.CarrierSet;
import org.eventb.emf.core.context.Constant;
import org.eventb.emf.core.context.Context;

/**
 * <p>
 * XContextFormatter contains custom formatting details
 * </p>
 * 
 * @author dd4g12
 * @since 1.0
 */
@SuppressWarnings("all")
public class XContextFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private XContextGrammarAccess _xContextGrammarAccess;

  protected void _format(final Context context, @Extension final IFormattableDocument document) {
    IEObjectRegion _regionForEObject = this.textRegionExtensions.regionForEObject(context);
    boolean _tripleEquals = (_regionForEObject == null);
    if (_tripleEquals) {
      return;
    }
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(context).keyword("extends"), _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(context).keyword("sets"), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(context).keyword("constants"), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(context).keyword("axioms"), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(context).keyword("records"), _function_4);
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(context).keyword("end"), _function_5);
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(this.textRegionExtensions.allRegionsFor(context).ruleCallTo(this._xContextGrammarAccess.getML_COMMENTRule()), _function_6);
    EList<CarrierSet> _sets = context.getSets();
    for (final CarrierSet carrierSet : _sets) {
      {
        final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.<CarrierSet>prepend(document.<CarrierSet>format(carrierSet), _function_7);
        final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.append(this.textRegionExtensions.allRegionsFor(carrierSet).ruleCallTo(this._xContextGrammarAccess.getML_COMMENTRule()), _function_8);
      }
    }
    EList<Constant> _constants = context.getConstants();
    for (final Constant constant : _constants) {
      {
        final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.<Constant>prepend(document.<Constant>format(constant), _function_7);
        final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.append(this.textRegionExtensions.allRegionsFor(constant).ruleCallTo(this._xContextGrammarAccess.getML_COMMENTRule()), _function_8);
      }
    }
    EList<Axiom> _axioms = context.getAxioms();
    for (final Axiom axiom : _axioms) {
      {
        final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.<Axiom>prepend(document.<Axiom>format(axiom), _function_7);
        final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.append(this.textRegionExtensions.allRegionsFor(axiom).ruleCallTo(this._xContextGrammarAccess.getML_COMMENTRule()), _function_8);
      }
    }
    EList<AbstractExtension> _extensions = context.getExtensions();
    for (final AbstractExtension abstractExtension : _extensions) {
      {
        final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.<AbstractExtension>prepend(document.<AbstractExtension>format(abstractExtension), _function_7);
        if ((abstractExtension instanceof Record)) {
          final Record record = ((Record) abstractExtension);
          boolean _isEmpty = record.getFields().isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            EList<Field> _fields = record.getFields();
            for (final Field field : _fields) {
              final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
                it.newLine();
              };
              document.<Field>prepend(document.<Field>format(field), _function_8);
            }
            final Field first = IterableExtensions.<Field>head(record.getFields());
            final Field last = IterableExtensions.<Field>last(record.getFields());
            final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
              it.indent();
            };
            document.set(this.textRegionExtensions.regionForEObject(first).getPreviousHiddenRegion(), this.textRegionExtensions.regionForEObject(last).getNextHiddenRegion(), _function_9);
          }
        }
        final Procedure1<IHiddenRegionFormatter> _function_10 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.append(this.textRegionExtensions.allRegionsFor(abstractExtension).ruleCallTo(this._xContextGrammarAccess.getML_COMMENTRule()), _function_10);
      }
    }
    boolean _isEmpty = context.getSets().isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      final CarrierSet firstSet = IterableExtensions.<CarrierSet>head(context.getSets());
      final CarrierSet lastSet = IterableExtensions.<CarrierSet>last(context.getSets());
      final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
        it.indent();
      };
      document.set(this.textRegionExtensions.regionForEObject(firstSet).getPreviousHiddenRegion(), this.textRegionExtensions.regionForEObject(lastSet).getNextHiddenRegion(), _function_7);
    }
    boolean _isEmpty_1 = context.getAxioms().isEmpty();
    boolean _not_1 = (!_isEmpty_1);
    if (_not_1) {
      final Axiom firstAxiom = IterableExtensions.<Axiom>head(context.getAxioms());
      final Axiom lastAxiom = IterableExtensions.<Axiom>last(context.getAxioms());
      final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
        it.indent();
      };
      document.set(this.textRegionExtensions.regionForEObject(firstAxiom).getPreviousHiddenRegion(), this.textRegionExtensions.regionForEObject(lastAxiom).getNextHiddenRegion(), _function_8);
    }
    boolean _isEmpty_2 = context.getConstants().isEmpty();
    boolean _not_2 = (!_isEmpty_2);
    if (_not_2) {
      final Constant firstCnst = IterableExtensions.<Constant>head(context.getConstants());
      final Constant lastCnst = IterableExtensions.<Constant>last(context.getConstants());
      final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
        it.indent();
      };
      document.set(this.textRegionExtensions.regionForEObject(firstCnst).getPreviousHiddenRegion(), this.textRegionExtensions.regionForEObject(lastCnst).getNextHiddenRegion(), _function_9);
    }
    boolean _isEmpty_3 = context.getExtensions().isEmpty();
    boolean _not_3 = (!_isEmpty_3);
    if (_not_3) {
      final AbstractExtension first = IterableExtensions.<AbstractExtension>head(context.getExtensions());
      final AbstractExtension last = IterableExtensions.<AbstractExtension>last(context.getExtensions());
      final Procedure1<IHiddenRegionFormatter> _function_10 = (IHiddenRegionFormatter it) -> {
        it.indent();
      };
      document.set(this.textRegionExtensions.regionForEObject(first).getPreviousHiddenRegion(), this.textRegionExtensions.regionForEObject(last).getNextHiddenRegion(), _function_10);
    }
  }

  public void format(final Object context, final IFormattableDocument document) {
    if (context instanceof Context) {
      _format((Context)context, document);
      return;
    } else if (context instanceof XtextResource) {
      _format((XtextResource)context, document);
      return;
    } else if (context instanceof EObject) {
      _format((EObject)context, document);
      return;
    } else if (context == null) {
      _format((Void)null, document);
      return;
    } else if (context != null) {
      _format(context, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(context, document).toString());
    }
  }
}
