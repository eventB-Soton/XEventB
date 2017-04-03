/*******************************************************************************
 * Copyright (c) 2016-2017 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     University of Southampton - initial API and implementation
 *******************************************************************************/
package ac.soton.xeventb;

import ac.soton.xeventb.common.EventBValueConverter;
import ac.soton.xeventb.common.XMachineTransientValueService;
import ac.soton.xeventb.scoping.XMachineScopeProvider;
import com.google.inject.Binder;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.parsetree.reconstr.ITransientValueService;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.serializer.tokens.SerializerScopeProviderBinding;

/**
 * <p>
 * Use this class to register components for XMachine to be used at runtime /
 * without the Equinox extension registry.
 * </p>
 *
 * @author htson
 * @version 0.2
 * @see XContextGrammarAccess
 * @since 0.0.1
 */
public class XMachineRuntimeModule extends ac.soton.xeventb.AbstractXMachineRuntimeModule {
	/**
	 * Bind the value converter service for Event-B values, e.g., converting comments,
	 * labels, etc.
	 * 
	 * @see EventBValueConverter
	 */
	 public Class<? extends IValueConverterService> bindIValueConverterService() {
		return EventBValueConverter.class;
	}
	/**
	 * Bind the transient value service for XMachine, use for serialisation of
	 * EMF Event-B to XText.
	 * 
	 * @see XMachineTransientValueService
	 */
	 public Class<? extends ITransientValueService> bindITransientValueService() {
		return XMachineTransientValueService.class;
	}
	 /**
		 * Bind the scope provider, use for references for context seeing, machine
		 * refinement, event refinement, etc.
		 * 
		 * @see XMachineScopeProvider
		 */
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
		public void configureSerializerIScopeProvider(Binder binder) {
			binder.bind(IScopeProvider.class).annotatedWith(SerializerScopeProviderBinding.class).to(
				XMachineScopeProvider.class);
		}
}
