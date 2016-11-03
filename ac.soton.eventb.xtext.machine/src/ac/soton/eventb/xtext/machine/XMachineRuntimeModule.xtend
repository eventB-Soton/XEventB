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
package ac.soton.eventb.xtext.machine

import ac.soton.eventb.xtext.common.EventBValueConverter
import ac.soton.eventb.xtext.common.XMachineTransientValueService
import ac.soton.eventb.xtext.machine.scoping.XMachineScopeProvider
import com.google.inject.Binder
import org.eclipse.xtext.conversion.IValueConverterService
import org.eclipse.xtext.parsetree.reconstr.ITransientValueService
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.serializer.tokens.SerializerScopeProviderBinding

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
class XMachineRuntimeModule extends AbstractXMachineRuntimeModule {

	/**
	 * Bind the value converter service for Event-B values, e.g., converting comments,
	 * labels, etc.
	 * 
	 * @see EventBValueConverter
	 */
	override Class<? extends IValueConverterService> bindIValueConverterService() {
		return typeof(EventBValueConverter)
	}

	/**
	 * Bind the transient value service for XMachine, use for serialisation of
	 * EMF Event-B to XText.
	 * 
	 * @see XMachineTransientValueService
	 */
	override Class<? extends ITransientValueService> bindITransientValueService() {
		return typeof(XMachineTransientValueService)
	}

	/**
	 * Bind the scope provider, use for references for context seeing, machine
	 * refinement, event refinement, etc.
	 * 
	 * @see XMachineScopeProvider
	 */
	override Class<? extends IScopeProvider> bindIScopeProvider() {
		return typeof(XMachineScopeProvider)
	}	

	/**
	 * Configure the serializer scope provider, use for serialisaton of
	 * references, e.g., context seeing, machine refinement, event refinement,
	 * etc. of EMF Event-B to XText.
	 * 
	 * @see XMachineScopeProvider
	 */
	override configureSerializerIScopeProvider(Binder binder) {
		binder.bind(typeof(IScopeProvider)).annotatedWith(typeof(SerializerScopeProviderBinding)).to(
			typeof(XMachineScopeProvider))
	}
	
}
