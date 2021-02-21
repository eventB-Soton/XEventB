/*******************************************************************************
 * Copyright (c) 2021 University of Southampton.
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
package ac.soton.xeventb.ui.handlers

import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.jface.text.ITextSelection
import org.eclipse.ui.handlers.HandlerUtil
import org.eclipse.ui.texteditor.AbstractDecoratedTextEditor
import org.eclipse.jface.text.TextSelection

/** 
 * An implementation of a handler for inserting Event-B Symbol into an editor.
 * This can be used for CamilleX editors. 
 * 
 * @author htson
 * @version 0.1
 * @since 1.1.0
 */
class InsertSymbolHandler extends AbstractHandler {

    override Object execute(ExecutionEvent event) throws ExecutionException {
        // Get the inserted text from the event.
        val String insertText = event.getParameter("org.eventb.ui.edit.insert.text")
        if (insertText === null) {
            return "Unable to retrieve the text to insert"
        }

        // Get the active editor        
        val editor = HandlerUtil.getActiveEditor(event)
        if (editor instanceof AbstractDecoratedTextEditor) {
            val dp = editor.getDocumentProvider()
            val doc = dp.getDocument(editor.getEditorInput())
            // Get the current text selection
            val selectionProvider = editor.getSite().getSelectionProvider()
            val textSelection = selectionProvider.getSelection()
            if (textSelection instanceof ITextSelection) {
                // Replace the current text selection with the inserted text
                val offset = textSelection.offset
                val length = textSelection.length
                doc.replace(offset, length, insertText)
                
                // Set the current selection to after the inserted text
                val selection = new TextSelection(offset + insertText.length, 0)
                selectionProvider.selection = selection
                return null
            } else {
                return "Current selection is not text selection"            
            }
        } else {
            return "Active editor is not a text editor"
        }
    }

}
