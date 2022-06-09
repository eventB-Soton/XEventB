/**
 * Copyright (c) 2016,2018 University of Southampton.
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
package ac.soton.xeventb.xmachine;

import ac.soton.xeventb.common.EventBContainerManager;
import ac.soton.xeventb.common.EventBQualifiedNameProvider;
import ac.soton.xeventb.common.EventBValueConverter;
import ac.soton.xeventb.common.XMachineTransientValueService;
import ac.soton.xeventb.xmachine.scoping.XMachineScopeProvider;
import com.google.inject.Binder;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.parsetree.reconstr.ITransientValueService;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.serializer.tokens.SerializerScopeProviderBinding;

/**
 * <p>
 * Use this class to register components for XMachine to be used at runtime /
 * without the Equinox extension registry.
 * </p>
 * 
 * @author htson
 * @author Dana: binding qualified name provider and container manager (0.3)
 * @version 0.3
 * @see XContextGrammarAccess
 * @since 0.0.1
 */
@SuppressWarnings("all")
public class XMachineRuntimeModule extends AbstractXMachineRuntimeModule {
  /**
   * Bind the value converter service for Event-B values, e.g., converting comments,
   * labels, etc.
   * 
   * @see EventBValueConverter
   */
  @Override
  public Class<? extends IValueConverterService> bindIValueConverterService() {
    return EventBValueConverter.class;
  }
  
  /**
   * Bind the transient value service for XMachine, use for serialisation of
   * EMF Event-B to XText.
   * 
   * @see XMachineTransientValueService
   */
  @Override
  public Class<? extends ITransientValueService> bindITransientValueService() {
    return XMachineTransientValueService.class;
  }
  
  /**
   * Bind the scope provider, use for references for context seeing, machine
   * refinement, event refinement, etc.
   * 
   * @see XMachineScopeProvider
   */
  @Override
  public Class<? extends IScopeProvider> bindIScopeProvider() {
    return XMachineScopeProvider.class;
  }
  
  /**
   * Configure the serializer scope provider, use for serialisaton of
   * references, e.g., context seeing, machine refinement, event refinement,
   * etc. of EMF Event-B to XText.
   * 
   * @see XMachineScopeProvider
   */
  @Override
  public void configureSerializerIScopeProvider(final Binder binder) {
    binder.<IScopeProvider>bind(IScopeProvider.class).annotatedWith(SerializerScopeProviderBinding.class).to(
      XMachineScopeProvider.class);
  }
  
  /**
   * Bind the qualified Name provider service for machine qualified name.
   * The qualified name of a machine is projName.machineName
   * 
   * @see EventBQualifiedNameProvider
   */
  @Override
  public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
    return EventBQualifiedNameProvider.class;
  }
  
  /**
   * Bind the container Manager to include other projects in the workspace.
   * 
   * 
   * @see EventBContainerManager
   */
  @Override
  public Class<? extends IContainer.Manager> bindIContainer$Manager() {
    return EventBContainerManager.class;
  }
}
