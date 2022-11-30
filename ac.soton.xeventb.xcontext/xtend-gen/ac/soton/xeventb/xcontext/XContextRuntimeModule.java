/**
 * Copyright (c) 2016,2018 University of Southampton.
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
package ac.soton.xeventb.xcontext;

import ac.soton.xeventb.common.EventBValueConverter;
import ac.soton.xeventb.common.XContextTransientValueService;
import ac.soton.xeventb.xcontext.scoping.XContextScopeProvider;
import ac.soton.xeventb.xcontext.services.XContextGrammarAccess;
import com.google.inject.Binder;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.parsetree.reconstr.ITransientValueService;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.serializer.tokens.SerializerScopeProviderBinding;

/**
 * <p>
 * Use this class to register components for XContext to be used at runtime /
 * without the Equinox extension registry.
 * </p>
 * 
 * @author htson
 * @version 0.2
 * @see XContextGrammarAccess
 * @since 0.0.1
 */
@SuppressWarnings("all")
public class XContextRuntimeModule extends AbstractXContextRuntimeModule {
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
   * Bind the transient value service for XContext, use for serialisation of
   * EMF Event-B to XText.
   * 
   * @see XContextTransientValueService
   */
  @Override
  public Class<? extends ITransientValueService> bindITransientValueService() {
    return XContextTransientValueService.class;
  }

  /**
   * Bind the scope provider, use for references for context extensions, etc.
   * 
   * @see XContextScopeProvider
   */
  @Override
  public Class<? extends IScopeProvider> bindIScopeProvider() {
    return XContextScopeProvider.class;
  }

  /**
   * Configure the serializer scope provider, use for serialisaton of
   * references, e.g., context extensions, etc. of EMF Event-B to XText.
   * 
   * @see XContextScopeProvider
   */
  @Override
  public void configureSerializerIScopeProvider(final Binder binder) {
    binder.<IScopeProvider>bind(IScopeProvider.class).annotatedWith(SerializerScopeProviderBinding.class).to(
      XContextScopeProvider.class);
  }
}
