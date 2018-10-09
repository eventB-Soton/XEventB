/**
 * Copyright (c) 2016,2018 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * University of Southampton - initial API and implementation
 */
package ac.soton.xeventb.camillex;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.services.Ecore2XtextTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

/**
 * <p>
 * An implementation of value converter for Event-B attributes and element
 * <ul>
 * <li>Label
 * </ul>
 * </p>
 * @author htson
 * @version 0.9
 * @since 0.0.1
 */
@SuppressWarnings("all")
public class EventBComponentValueConverter extends Ecore2XtextTerminalConverters {
  /**
   * Returns the value converter for XLabel.
   * @return the value converter for XLabel.
   */
  @ValueConverter(rule = "LABEL")
  public IValueConverter<String> LABEL() {
    return new IValueConverter<String>() {
      /**
       * Convert XLabel to string.
       * @param stringthe XLabel string
       * @param nodethe node in the semantics tree.
       * @return the comment by stripping the leading "@" and the ending
       * ":".
       * @see IValueConverter#toValue(String, INode)
       * @precondition the input string must be not <code>null</code>.
       * have "@" as its prefix and ended with a ":".
       */
      @Override
      public String toValue(final String string, final INode node) throws ValueConverterException {
        boolean _startsWith = string.startsWith("@");
        boolean _not = (!_startsWith);
        if (_not) {
          throw new AssertionError();
        }
        boolean _endsWith = string.endsWith(":");
        boolean _not_1 = (!_endsWith);
        if (_not_1) {
          throw new AssertionError();
        }
        int _length = string.length();
        int _minus = (_length - 1);
        return string.substring(1, _minus);
      }
      
      /**
       * Convert string to XLabel.
       * @param valuethe label
       * @return the XComment by prefixing "@" and suffixing ":" to the
       * input value.
       * @see IValueConverter#toString(Object)
       */
      @Override
      public String toString(final String value) throws ValueConverterException {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("@");
        _builder.append(value);
        _builder.append(":");
        return _builder.toString();
      }
    };
  }
}
