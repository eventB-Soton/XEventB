/*******************************************************************************
 *  Copyright (c) 2016,2020 University of Southampton.
 * 
 *  This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 * 
 *  SPDX-License-Identifier: EPL-2.0
 * 
 *  Contributors:
 *    University of Southampton - initial API and implementation 
 *******************************************************************************/
 
 //updated by Dana
package ac.soton.xeventb.xmachine.ui

//import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

import ac.soton.xeventb.xmachine.ui.hover.XMachineHoverProvider
import com.google.inject.Binder
import com.google.inject.name.Names
import org.eclipse.ui.plugin.AbstractUIPlugin
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider
import org.eclipse.xtext.ui.editor.contentassist.XtextContentAssistProcessor
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider
import ac.soton.xeventb.xmachine.ui.hover.XMachineEObjectDocumentationProvider

/**
 * <p>
 * Use this class to register components to be used within the Eclipse IDE.
 * </p>
 * 
 * @author htson - Initial implementation
 * @author Dana
 * @version 0.2
 * @see XMachineEObjectDocumentationProvider
 * @see XMachineHoverProvider
 * @since 0.1
 */
//@FinalFieldsConstructor
class XMachineUiModule extends AbstractXMachineUiModule {
	
	new(AbstractUIPlugin plugin) {
		super(plugin)
	}
	
	override configure(Binder binder) {
		super.configure(binder);
		binder.bind(typeof(String)).annotatedWith(
			Names.named((XtextContentAssistProcessor.COMPLETION_AUTO_ACTIVATION_CHARS))).toInstance("!#%&*-:|~/\\NIP");
		// @TODO We should be able to query the Rodin Keyboard for these letters
	}

	/**
	 * Inject {@link XMachineEObjectDocumentationProvider}.
	 */	
	def Class<? extends IEObjectDocumentationProvider> bindIEObjectDocumentationProvider() {
        XMachineEObjectDocumentationProvider
    }
 
	/**
	 * Inject {@link XMachineHoverProvider}.
	 */	
    def Class<? extends IEObjectHoverProvider> bindIEObjectHoverProvider() {
        XMachineHoverProvider
    }
	
}
