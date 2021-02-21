/**
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
 */
package ac.soton.xeventb.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.texteditor.AbstractDecoratedTextEditor;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * An implementation of a handler for inserting Event-B Symbol into an editor.
 * This can be used for CamilleX editors.
 * 
 * @author htson
 * @version 0.1
 * @since 1.1.0
 */
@SuppressWarnings("all")
public class InsertSymbolHandler extends AbstractHandler {
  @Override
  public Object execute(final ExecutionEvent event) throws ExecutionException {
    try {
      final String insertText = event.getParameter("org.eventb.ui.edit.insert.text");
      if ((insertText == null)) {
        return "Unable to retrieve the text to insert";
      }
      final IEditorPart editor = HandlerUtil.getActiveEditor(event);
      if ((editor instanceof AbstractDecoratedTextEditor)) {
        final IDocumentProvider dp = ((AbstractDecoratedTextEditor)editor).getDocumentProvider();
        final IDocument doc = dp.getDocument(((AbstractDecoratedTextEditor)editor).getEditorInput());
        final ISelectionProvider selectionProvider = ((AbstractDecoratedTextEditor)editor).getSite().getSelectionProvider();
        final ISelection textSelection = selectionProvider.getSelection();
        if ((textSelection instanceof ITextSelection)) {
          final int offset = ((ITextSelection)textSelection).getOffset();
          final int length = ((ITextSelection)textSelection).getLength();
          doc.replace(offset, length, insertText);
          int _length = insertText.length();
          int _plus = (offset + _length);
          final TextSelection selection = new TextSelection(_plus, 0);
          selectionProvider.setSelection(selection);
          return null;
        } else {
          return "Current selection is not text selection";
        }
      } else {
        return "Active editor is not a text editor";
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
