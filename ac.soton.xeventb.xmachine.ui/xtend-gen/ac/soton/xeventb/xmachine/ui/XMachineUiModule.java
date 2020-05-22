/**
 * Copyright (c) 2016,2020 University of Southampton.
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
 */
package ac.soton.xeventb.xmachine.ui;

import ac.soton.xeventb.xmachine.ui.AbstractXMachineUiModule;
import ac.soton.xeventb.xmachine.ui.hover.XMachineEObjectDocumentationProvider;
import ac.soton.xeventb.xmachine.ui.hover.XMachineHoverProvider;
import com.google.inject.Binder;
import com.google.inject.name.Names;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.ui.editor.contentassist.XtextContentAssistProcessor;
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider;

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
@SuppressWarnings("all")
public class XMachineUiModule extends AbstractXMachineUiModule {
  public XMachineUiModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  @Override
  public void configure(final Binder binder) {
    super.configure(binder);
    binder.<String>bind(String.class).annotatedWith(
      Names.named(XtextContentAssistProcessor.COMPLETION_AUTO_ACTIVATION_CHARS)).toInstance("!#%&*-:|~/\\NIP");
  }
  
  /**
   * Inject {@link XMachineEObjectDocumentationProvider}.
   */
  public Class<? extends IEObjectDocumentationProvider> bindIEObjectDocumentationProvider() {
    return XMachineEObjectDocumentationProvider.class;
  }
  
  /**
   * Inject {@link XMachineHoverProvider}.
   */
  public Class<? extends IEObjectHoverProvider> bindIEObjectHoverProvider() {
    return XMachineHoverProvider.class;
  }
}
