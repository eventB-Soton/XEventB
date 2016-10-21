/*******************************************************************************
 * Copyright (c) 2016 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     University of Southampton - initial API and implementation
 *******************************************************************************/

package ac.soton.eventb.xtext.common;

import org.eclipse.xtext.common.services.Ecore2XtextTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

/**
 * <p>
 *
 * </p>
 *
 * @author htson
 * @version
 * @see
 * @since
 */
public class EventBValueConverter extends Ecore2XtextTerminalConverters {
	@ValueConverter(rule = "SL_COMMENT")
    public IValueConverter<String> SL_COMMENT() {
		return new IValueConverter<String>() {

			@Override
			public String toValue(String string, INode node)
					throws ValueConverterException {
				if (string.startsWith("// "))
					return string.substring(3, string.lastIndexOf('\n'));
				if (string.startsWith("//"))
					return string.substring(2, string.lastIndexOf('\n'));
				return string.trim();
			}

			@Override
			public String toString(String value) throws ValueConverterException {
				return "// " + value;
			}
			
		};
	}
	
	@ValueConverter(rule = "ML_COMMENT")
    public IValueConverter<String> ML_COMMENT() {
		return new IValueConverter<String>() {

			/*
			 * Final comment
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
						str = str.substring(index+1);
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

			@Override
			public String toString(String value) throws ValueConverterException {
				String[] splits = value.split("\n");
				if (splits.length == 1)
					return "/* " + value + " */";
				StringBuilder sb = new StringBuilder();
				sb.append("/* ");
				
				
				return "/ " + value;
			}		
		};
	}
}
