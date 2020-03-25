/*******************************************************************************
 * Copyright (c) 2018 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     University of Southampton - initial API and implementation
 *******************************************************************************/

package ac.soton.xeventb.common;

import org.eclipse.xtext.common.services.Ecore2XtextTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;
import org.rodinp.keyboard.core.RodinKeyboardCore;

/**
 * <p>
 * An implementation for value converter, including converting comments and
 * labels.
 * </p>
 *
 * @author htson, dd4g12
 * @version 0.3.1
 * @since 0.0.1
 */
public class EventBValueConverter extends Ecore2XtextTerminalConverters {

	/**
	 * Returns the value converter for single-line comments.
	 * 
	 * @return the value converter for single-line comments.
	 */
	@ValueConverter(rule = "SL_COMMENT")
	public IValueConverter<String> SL_COMMENT() {
		return new IValueConverter<String>() {

			/**
			 * Convert XComment to string.
			 * 
			 * @param string the XComment string
			 * @param node   the node in the semantics tree.
			 * @return the comment by stripping the leading "//" or "// ".
			 * @see IValueConverter#toValue(String, INode)
			 * @precondition the input string must be not <code>null</code> and
			 *               have "//" as its prefix.
			 */
			@Override
			public String toValue(String string, INode node)
					throws ValueConverterException {
				assert string != null;
				assert string.startsWith("//");

				if (string.startsWith("// "))
					return string.substring(3, string.lastIndexOf('\n'));
				if (string.startsWith("//"))
					return string.substring(2, string.lastIndexOf('\n'));
				return string.trim();
			}

			/**
			 * Convert string to XComment.
			 * 
			 * @param value the comment
			 * @return the XComment by prefixing "// " to the input value.
			 * @see IValueConverter#toString(Object)
			 */
			@Override
			public String toString(String value)
					throws ValueConverterException {
				return "// " + value;
			}
		};
	}

	/**
	 * Returns the value converter for multi-line comments.
	 * 
	 * @return the value converter for multi-line comments.
	 */
	@ValueConverter(rule = "ML_COMMENT")
	public IValueConverter<String> ML_COMMENT() {
		return new IValueConverter<String>() {

			/**
			 * Convert XComment to string.
			 * 
			 * @param string the XComment string
			 * @param node   the node in the semantics tree.
			 * @return the comment by stripping the leading the multi-line
			 *         syntax.
			 * @see IValueConverter#toValue(String, INode)
			 * @precondition the input string must be not <code>null</code>.
			 */
			@Override
			public String toValue(String string, INode node)
					throws ValueConverterException {
				String[] splits = string.split("\n");
				if (splits.length == 1) {
					if (string.startsWith("/* ")) {
						string = string.substring(3);
					} else if (string.startsWith("/*")) {
						string = string.substring(2);
					}
					if (string.endsWith(" */")) {
						string = string.substring(0, string.length() - 3);
					} else if (string.endsWith("*/")) {
						string = string.substring(0, string.length() - 2);
					}
					return string;
				}
				StringBuffer sb = new StringBuffer();
				boolean first = true;
				for (int i = 1; i < splits.length - 1; ++i) {
					String str = splits[i];
					int index = str.indexOf("*");
					if (index != -1) {
						str = str.substring(index + 1);
						if (str.startsWith(" ")) {
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
				return sb.toString();
			}

			/**
			 * Convert string to XComment.
			 * 
			 * @param value the comment
			 * @return the XComment by prefixing and suffixing the input value.
			 * @see IValueConverter#toString(Object)
			 */
			@Override
			public String toString(String value)
					throws ValueConverterException {
				if (value == null)
					return "";
				String[] splits = value.split("\n");
				if (splits.length == 1)
					return "/* " + value + " */";
				StringBuilder sb = new StringBuilder();
				sb.append("/* " + value + " */");
				return sb.toString();
			}
		};
	}

	/**
	 * Returns the value converter for XLabel.
	 * 
	 * @return the value converter for XLabel.
	 */
	@ValueConverter(rule = "XLABEL")
	public IValueConverter<String> XLABEL() {
		return new IValueConverter<String>() {

			/**
			 * Convert XLabel to string.
			 * 
			 * @param string the XLabel string
			 * @param node   the node in the semantics tree.
			 * @return the comment by stripping the leading "@" and the ending
			 *         ":".
			 * @see IValueConverter#toValue(String, INode)
			 * @precondition the input string must be not <code>null</code>.
			 *               have "@" as its prefix and ended with a ":".
			 */
			@Override
			public String toValue(String string, INode node)
					throws ValueConverterException {
				assert string.startsWith("@");
				assert string.endsWith(":");
				return string.substring(1, string.length() - 1);
			}

			/**
			 * Convert string to XLabel.
			 * 
			 * @param value the label
			 * @return the XComment by prefixing "@" and suffixing ":" to the
			 *         input value.
			 * @see IValueConverter#toString(Object)
			 */
			@Override
			public String toString(String value)
					throws ValueConverterException {
				return "@" + value + ":";
			}

		};
	}

	/**
	 * Returns the value converter for XFormula.
	 * 
	 * @return the value converter for XFormula.
	 * @since 0.1
	 */
	@ValueConverter(rule = "XFormula")
	public IValueConverter<String> XFormula() {
		return new IValueConverter<String>() {

			/**
			 * Convert string to XLabel.
			 * 
			 * @param string the formula string
			 * @return the translated formula value by calling the Rodin
			 *         keyboard
			 * @see IValueConverter#toString(Object)
			 */

			@Override
			public String toValue(String string, INode node)
					throws ValueConverterException {
				if (string == null)
					return null;
				return RodinKeyboardCore.translate(string);
			}

			@Override
			public String toString(String value)
					throws ValueConverterException {
				return value;
			}

		};
	}

}
