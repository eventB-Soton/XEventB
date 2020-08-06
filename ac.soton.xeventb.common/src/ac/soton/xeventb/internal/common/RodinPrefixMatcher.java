/*******************************************************************************
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
 *******************************************************************************/

package ac.soton.xeventb.internal.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.xtext.ui.editor.contentassist.PrefixMatcher;
import org.rodinp.keyboard.core.ISymbol;
import org.rodinp.keyboard.core.ISymbolRegistry;
import org.rodinp.keyboard.core.RodinKeyboardCore;

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
public class RodinPrefixMatcher extends PrefixMatcher {

	private static String[] IGNORES = {"//", "\"", "/*"}; 
			
	private static Map<String, Collection<String>> translations = null;
	
	/**
	 * 
	 */
	private static void loadTranslations() {
		if (translations != null)
			return;
		
		translations = new HashMap<String, Collection<String>>();
		ISymbolRegistry symbolRegistry = RodinKeyboardCore.getSymbolRegistry();
		// Load the mathematical symbols
		int maxSize = symbolRegistry.getMaxMathSymbolSize();
		for (int i = 1; i <= maxSize; ++i) {
			Collection<ISymbol> mathSymbols = symbolRegistry.getMathSymbols(i);
			if (mathSymbols == null)
				continue;
			for (ISymbol mathSymbol : mathSymbols) {
				String combo = mathSymbol.getCombo();
				String translation = mathSymbol.getTranslation();
				
				if (translations.containsKey(translation)) {
					translations.get(translation).add(combo);
				} else {
					Collection<String> collection = new ArrayList<String>();
					collection.add(combo);
					translations.put(translation, collection);
				}
			}
		}

		// Load the text symbols
		maxSize = symbolRegistry.getMaxTextSymbolSize();
		for (int i = 1; i <= maxSize; ++i) {
			Collection<ISymbol> textSymbols = symbolRegistry.getTextSymbols(i);
			if (textSymbols == null)
				continue;
			for (ISymbol textSymbol : textSymbols) {
				String combo = textSymbol.getCombo();
				String translation = textSymbol.getTranslation();
				
				if (translations.containsKey(translation)) {
					translations.get(translation).add(combo);
				} else {
					Collection<String> collection = new ArrayList<String>();
					collection.add(combo);
					translations.put(translation, collection);
				}
			}
		}
}
	
	/* (non-Javadoc)
	 * @see org.eclipse.xtext.ui.editor.contentassist.PrefixMatcher#isCandidateMatchingPrefix(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean isCandidateMatchingPrefix(String name, String prefix) {
		return isValidCandidateMatchingPrefix(name, prefix);
	}

	public static boolean isValidCandidateMatchingPrefix(String name, String prefix) {
		loadTranslations();
		if (translations.containsKey(name)) {
			Collection<String> combos = translations.get(name);
			for (String combo : combos) { 
				if (combo.startsWith(prefix))
					return true;
			}
		}
		return false;		
	}

	public static String getLastPrefix(String prefix) {
		if (!prefix.matches("[\\s\\S]*\\s")) {
			String[] split = prefix.split("\\s");
			String last_prefix = split[split.length - 1];
			
			boolean match = true;
			while (match) {
				match = false;
				for (String ignore : IGNORES) {
					if (last_prefix.startsWith(ignore)) {
						last_prefix = prefix.substring(ignore.length());
						match = true;
						break;
					}
				}
			}
			
			return last_prefix;
		} else {
			return "";
		}
	}

	/**
	 * @param prefix
	 * @return
	 */
	public static String[] getProposals(String prefix) {
		loadTranslations();
		List<String> result = new ArrayList<String>();
		Set<Entry<String, Collection<String>>> entrySet = translations.entrySet();
		for (Entry<String, Collection<String>> entry : entrySet) {
			Collection<String> combos = entry.getValue();
			for (String combo : combos) {
				if (combo.startsWith(prefix))
					result.add(entry.getKey());
			}
		}
		return result.toArray(new String[result.size()]);
	}
}
