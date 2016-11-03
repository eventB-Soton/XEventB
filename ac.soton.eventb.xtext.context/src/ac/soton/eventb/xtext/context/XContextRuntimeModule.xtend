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

package ac.soton.eventb.xtext.context

import ac.soton.eventb.xtext.common.EventBValueConverter
import ac.soton.eventb.xtext.common.XContextTransientValueService
import ac.soton.eventb.xtext.context.scoping.XContextScopeProvider
import ac.soton.eventb.xtext.context.services.XContextGrammarAccess
import com.google.inject.Binder
import org.eclipse.xtext.conversion.IValueConverterService
import org.eclipse.xtext.parsetree.reconstr.ITransientValueService
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.serializer.tokens.SerializerScopeProviderBinding

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
class XContextRuntimeModule extends AbstractXContextRuntimeModule {

	/**
	 * Bind the value converter service for Event-B values, e.g., converting comments,
	 * labels, etc.
	 * 
	 * @see EventBValueConverter
	 */
	override Class<? extends IValueConverterService> bindIValueConverterService() {
		return typeof(EventBValueConverter);
	}

	/**
	 * Bind the transient value service for XContext, use for serialisation of
	 * EMF Event-B to XText.
	 * 
	 * @see XContextTransientValueService
	 */
	override Class<? extends ITransientValueService> bindITransientValueService() {
		return typeof(XContextTransientValueService)
	}

	/**
	 * Bind the scope provider, use for references for context extensions, etc.
	 * 
	 * @see XContextScopeProvider
	 */
	override Class<? extends IScopeProvider> bindIScopeProvider() {
		return typeof(XContextScopeProvider)
	}	

	/**
	 * Configure the serializer scope provider, use for serialisaton of
	 * references, e.g., context extensions, etc. of EMF Event-B to XText.
	 * 
	 * @see XContextScopeProvider
	 */
	override configureSerializerIScopeProvider(Binder binder) {
		binder.bind(typeof(IScopeProvider)).annotatedWith(typeof(SerializerScopeProviderBinding)).to(
			typeof(XContextScopeProvider))
	}

}
