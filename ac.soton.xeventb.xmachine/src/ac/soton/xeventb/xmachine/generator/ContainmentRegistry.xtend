/*******************************************************************************
 *  Copyright (c) 2020 University of Southampton.
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

package ac.soton.xeventb.xmachine.generator

import ac.soton.eventb.emf.diagrams.DiagramOwner
import ac.soton.xeventb.xmachine.IContainmentGenerator
import ac.soton.xeventb.xmachine.utils.Identifiers
import java.util.ArrayList
import java.util.Collection
import java.util.HashMap
import java.util.Map
import org.eclipse.core.runtime.Platform

/**
 * <p>
 * This singleton class managed the registry for containment extensions.
 * </p>
 *
 * @author htson - Initial API
 * @version 0.1
 * @see IContainmentGenerator
 * @see XMachineGenerator
 * @since 2.2
 */
class ContainmentRegistry {
	
	static ContainmentRegistry registry // Private singleton instance
	
	/**
	 * Map of generators associating a class with collection of generators.
	 * This is to allow multiple generators for the same class.
	 * Note that multiple generators might be also available by inheritance. 
	 */  
	Map<Class<?>, Collection<IContainmentGenerator>> generators
	
	/*
	 * Singleton class should have private constructor.
	 */
	private new() {
		generators = null
	}
	
	/**
	 * Return the default instance of this containment registry (create one if necessary).
	 */
	def static ContainmentRegistry getDefault() {
		if (registry === null)
			registry = new ContainmentRegistry()
		return registry
	}
	
	/*
	 * Utility method to load the extension registry. The generators is loaded into the map.
	 */
	private def loadRegistry() {
		// Initialise the map of generators.
		generators = new HashMap
		
		val extensionRegistry = Platform.getExtensionRegistry()
		val elements = extensionRegistry.getConfigurationElementsFor(Identifiers.EXTPT_CONTAINMENT_EXTPTID)
        for (element : elements) {
			// val id = element.getAttribute(Identifiers.EXTPT_CONTAINMENT_COMPONENT_ID);
			val classAttr = element.getAttribute(Identifiers.EXTPT_CONTAINMENT_COMPONENT_CLASS);
			val generator = element.createExecutableExtension(Identifiers.EXTPT_CONTAINMENT_COMPONENT_GENERATOR)
			if (generator instanceof IContainmentGenerator) {
				val clazz = Class.forName(classAttr)
				addGenerator(clazz, generator)
			}
		}
	}
	
	/*
	 * Utility method to add a generator for a class to the map of generators.
	 * 
	 * @param clazz
	 * 		The input class to be associated with the containment generator
	 * @param generator
	 * 		The input containment generator 
	 */
	private def addGenerator(Class<?> clazz, IContainmentGenerator generator) {
		if (generators.containsKey(clazz)) {
			generators.get(clazz).add(generator)
		} else {
			val newList = new ArrayList<IContainmentGenerator>()
			newList.add(generator)
			generators.put(clazz, newList)
		}
	}
	
	/**
	 * Method to get a collection of generators related to an input diagram owner.
	 * This is done by looking at the map of generators (load the registry if
	 * necessary). 
	 * 
	 * @param owner
	 * 		The input diagram owner
	 * @return
	 * 		The collection of generators corresponding to the input diagram owner
	 */
	def Collection<IContainmentGenerator> getGenerators(DiagramOwner owner) {
		if (generators === null)
			loadRegistry
		val result = new ArrayList<IContainmentGenerator>() 
		val classes = generators.keySet
		for (clazz : classes) {
			if (clazz.isInstance(owner)) {
				result.addAll(generators.get(clazz))
			}
		}
		return result
	}
	
}