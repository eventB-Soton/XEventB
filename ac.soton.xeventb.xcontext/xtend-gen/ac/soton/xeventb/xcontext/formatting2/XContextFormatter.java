/**
 * Copyright (c) 2018 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     University of Southampton - initial API and implementation
 */
package ac.soton.xeventb.xcontext.formatting2;

import ac.soton.xeventb.xcontext.services.XContextGrammarAccess;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
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
 */
@SuppressWarnings("all")
public class XContextFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private XContextGrammarAccess _xContextGrammarAccess;
  
  protected void _format(final Context context, @Extension final IFormattableDocument document) {
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
    document.append(this.textRegionExtensions.allRegionsFor(context).ruleCallTo(this._xContextGrammarAccess.getML_COMMENTRule()), _function_4);
    EList<CarrierSet> _sets = context.getSets();
    for (final CarrierSet carrierSet : _sets) {
      {
        final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.<CarrierSet>prepend(document.<CarrierSet>format(carrierSet), _function_5);
        final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.append(this.textRegionExtensions.allRegionsFor(carrierSet).ruleCallTo(this._xContextGrammarAccess.getML_COMMENTRule()), _function_6);
      }
    }
    EList<Constant> _constants = context.getConstants();
    for (final Constant constant : _constants) {
      {
        final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.<Constant>prepend(document.<Constant>format(constant), _function_5);
        final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.append(this.textRegionExtensions.allRegionsFor(constant).ruleCallTo(this._xContextGrammarAccess.getML_COMMENTRule()), _function_6);
      }
    }
    EList<Axiom> _axioms = context.getAxioms();
    for (final Axiom axiom : _axioms) {
      {
        final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.<Axiom>prepend(document.<Axiom>format(axiom), _function_5);
        final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.append(this.textRegionExtensions.allRegionsFor(axiom).ruleCallTo(this._xContextGrammarAccess.getML_COMMENTRule()), _function_6);
      }
    }
    boolean _isEmpty = context.getSets().isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      final CarrierSet firstSet = IterableExtensions.<CarrierSet>head(context.getSets());
      final CarrierSet lastSet = IterableExtensions.<CarrierSet>last(context.getSets());
      final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
        it.indent();
      };
      document.set(this.textRegionExtensions.regionForEObject(firstSet).getPreviousHiddenRegion(), this.textRegionExtensions.regionForEObject(lastSet).getNextHiddenRegion(), _function_5);
    }
    boolean _isEmpty_1 = context.getAxioms().isEmpty();
    boolean _not_1 = (!_isEmpty_1);
    if (_not_1) {
      final Axiom firstAxiom = IterableExtensions.<Axiom>head(context.getAxioms());
      final Axiom lastAxiom = IterableExtensions.<Axiom>last(context.getAxioms());
      final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
        it.indent();
      };
      document.set(this.textRegionExtensions.regionForEObject(firstAxiom).getPreviousHiddenRegion(), this.textRegionExtensions.regionForEObject(lastAxiom).getNextHiddenRegion(), _function_6);
    }
    boolean _isEmpty_2 = context.getConstants().isEmpty();
    boolean _not_2 = (!_isEmpty_2);
    if (_not_2) {
      final Constant firstCnst = IterableExtensions.<Constant>head(context.getConstants());
      final Constant lastCnst = IterableExtensions.<Constant>last(context.getConstants());
      final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
        it.indent();
      };
      document.set(this.textRegionExtensions.regionForEObject(firstCnst).getPreviousHiddenRegion(), this.textRegionExtensions.regionForEObject(lastCnst).getNextHiddenRegion(), _function_7);
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
