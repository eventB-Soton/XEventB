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
 * An implementation for value converter, including converting comments and
 * labels.
 * </p>
 * @author htson
 * @version 0.9
 * @since 0.0.1
 */
@SuppressWarnings("all")
public class EventBValueConverter extends Ecore2XtextTerminalConverters {
  /**
   * Returns the value converter for single-line comments.
   * @return the value converter for single-line comments.
   */
  @ValueConverter(rule = "SL_COMMENT")
  public IValueConverter<String> SL_COMMENT() {
    return new IValueConverter<String>() {
      /**
       * Convert XComment to string.
       * @param stringthe XComment string
       * @param nodethe node in the semantics tree.
       * @return the comment by stripping the leading "//" or "// ".
       * @see IValueConverter#toValue(String, INode)
       * @precondition the input string must be not <code>null</code> and
       * have "//" as its prefix.
       */
      @Override
      public String toValue(final String string, final INode node) throws ValueConverterException {
        if ((!(string != null))) {
          throw new AssertionError();
        }
        boolean _startsWith = string.startsWith("//");
        boolean _not = (!_startsWith);
        if (_not) {
          throw new AssertionError();
        }
        boolean _startsWith_1 = string.startsWith("// ");
        if (_startsWith_1) {
          return string.substring(3, 
            string.lastIndexOf(Character.valueOf('\n').charValue()));
        }
        boolean _startsWith_2 = string.startsWith("//");
        if (_startsWith_2) {
          return string.substring(2, 
            string.lastIndexOf(Character.valueOf('\n').charValue()));
        }
        return string.trim();
      }
      
      /**
       * Convert string to XComment.
       * @param valuethe comment
       * @return the XComment by prefixing "// " to the input value.
       * @see IValueConverter#toString(Object)
       */
      @Override
      public String toString(final String value) throws ValueConverterException {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("// ");
        _builder.append(value);
        return _builder.toString();
      }
    };
  }
  
  /**
   * Returns the value converter for multi-line comments.
   * @return the value converter for multi-line comments.
   */
  @ValueConverter(rule = "ML_COMMENT")
  public IValueConverter<String> ML_COMMENT() {
    return new IValueConverter<String>() {
      /**
       * Convert XComment to string.
       * @param stringthe XComment string
       * @param nodethe node in the semantics tree.
       * @return the comment by stripping the leading the multi-line syntax.
       * @see IValueConverter#toValue(String, INode)
       * @precondition the input string must be not <code>null</code>.
       */
      @Override
      public String toValue(final String string_finalParam_, final INode node) throws ValueConverterException {
        String string = string_finalParam_;
        String[] splits = string.split("\n");
        int _length = splits.length;
        boolean _tripleEquals = (_length == 1);
        if (_tripleEquals) {
          boolean _startsWith = string.startsWith("/* ");
          if (_startsWith) {
            string = string.substring(3);
          } else {
            boolean _startsWith_1 = string.startsWith("/*");
            if (_startsWith_1) {
              string = string.substring(2);
            }
          }
          boolean _endsWith = string.endsWith(" */");
          if (_endsWith) {
            int _length_1 = string.length();
            int _minus = (_length_1 - 3);
            string = string.substring(0, _minus);
          } else {
            boolean _endsWith_1 = string.endsWith("*/");
            if (_endsWith_1) {
              int _length_2 = string.length();
              int _minus_1 = (_length_2 - 2);
              string = string.substring(0, _minus_1);
            }
          }
          return string;
        }
        StringBuffer sb = new StringBuffer();
        boolean first = true;
        {
          int i = 1;
          int _length_3 = splits.length;
          int _minus_2 = (_length_3 - 1);
          boolean _lessThan = (i < _minus_2);
          boolean _while = _lessThan;
          while (_while) {
            {
              String _xblockexpression = null;
              {
                final int _rdIndx_splits = i;
                _xblockexpression = splits[_rdIndx_splits];
              }
              String str = _xblockexpression;
              int index = str.indexOf("*");
              if ((index != (-1))) {
                str = str.substring((index + 1));
                boolean _startsWith_2 = str.startsWith(" ");
                if (_startsWith_2) {
                  str = str.substring(1);
                }
              } else {
                str = str.trim();
              }
              if (first) {
                first = false;
              } else {
                sb.append("\n");
              }
              sb.append(str);
            }
            i = (i + 1);
            int _length_4 = splits.length;
            int _minus_3 = (_length_4 - 1);
            boolean _lessThan_1 = (i < _minus_3);
            _while = _lessThan_1;
          }
        }
        return sb.toString();
      }
      
      /**
       * Convert string to XComment.
       * @param valuethe comment
       * @return the XComment by prefixing and suffixing the input value.
       * @see IValueConverter#toString(Object)
       */
      @Override
      public String toString(final String value) throws ValueConverterException {
        if ((value == null)) {
          return "";
        }
        String[] splits = value.split("\n");
        int _length = splits.length;
        boolean _tripleEquals = (_length == 1);
        if (_tripleEquals) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("/* ");
          _builder.append(value);
          _builder.append(" */");
          return _builder.toString();
        }
        StringBuilder sb = new StringBuilder();
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("/* ");
        _builder_1.append(value);
        _builder_1.append(" */");
        sb.append(_builder_1);
        return sb.toString();
      }
    };
  }
  
  /**
   * Returns the value converter for XLabel.
   * @return the value converter for XLabel.
   */
  @ValueConverter(rule = "XLABEL")
  public IValueConverter<String> XLABEL() {
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
