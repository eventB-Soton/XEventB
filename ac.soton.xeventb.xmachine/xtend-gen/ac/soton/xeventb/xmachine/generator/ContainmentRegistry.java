/**
 * Copyright (c) 2020 University of Southampton.
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
package ac.soton.xeventb.xmachine.generator;

import ac.soton.eventb.emf.diagrams.DiagramOwner;
import ac.soton.xeventb.xmachine.IContainmentGenerator;
import ac.soton.xeventb.xmachine.utils.Identifiers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * <p>
 * This singleton class managed the registry for containment extensions.
 * </p>
 * 
 * @author htson - Initial API
 * @version 0.1
 * @see IContainmentGenerator
 * @see XMachineGenerator
 * @since 2.0
 */
@SuppressWarnings("all")
public class ContainmentRegistry {
  private static ContainmentRegistry registry;
  
  /**
   * Map of generators associating a class with collection of generators.
   * This is to allow multiple generators for the same class.
   * Note that multiple generators might be also available by inheritance.
   */
  private Map<Class<?>, Collection<IContainmentGenerator>> generators;
  
  /**
   * Singleton class should have private constructor.
   */
  private ContainmentRegistry() {
    this.generators = null;
  }
  
  /**
   * Return the default instance of this containment registry (create one if necessary).
   */
  public static ContainmentRegistry getDefault() {
    if ((ContainmentRegistry.registry == null)) {
      ContainmentRegistry _containmentRegistry = new ContainmentRegistry();
      ContainmentRegistry.registry = _containmentRegistry;
    }
    return ContainmentRegistry.registry;
  }
  
  /**
   * Utility method to load the extension registry. The generators is loaded into the map.
   */
  private void loadRegistry() {
    try {
      HashMap<Class<?>, Collection<IContainmentGenerator>> _hashMap = new HashMap<Class<?>, Collection<IContainmentGenerator>>();
      this.generators = _hashMap;
      final IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();
      final IConfigurationElement[] elements = extensionRegistry.getConfigurationElementsFor(Identifiers.EXTPT_CONTAINMENT_EXTPTID);
      for (final IConfigurationElement element : elements) {
        {
          final String classAttr = element.getAttribute(Identifiers.EXTPT_CONTAINMENT_COMPONENT_CLASS);
          final Object generator = element.createExecutableExtension(Identifiers.EXTPT_CONTAINMENT_COMPONENT_GENERATOR);
          if ((generator instanceof IContainmentGenerator)) {
            final Class<?> clazz = Class.forName(classAttr);
            this.addGenerator(clazz, ((IContainmentGenerator)generator));
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Utility method to add a generator for a class to the map of generators.
   * 
   * @param clazz
   * 		The input class to be associated with the containment generator
   * @param generator
   * 		The input containment generator
   */
  private Object addGenerator(final Class<?> clazz, final IContainmentGenerator generator) {
    Object _xifexpression = null;
    boolean _containsKey = this.generators.containsKey(clazz);
    if (_containsKey) {
      _xifexpression = Boolean.valueOf(this.generators.get(clazz).add(generator));
    } else {
      Collection<IContainmentGenerator> _xblockexpression = null;
      {
        final ArrayList<IContainmentGenerator> newList = new ArrayList<IContainmentGenerator>();
        newList.add(generator);
        _xblockexpression = this.generators.put(clazz, newList);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
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
  public Collection<IContainmentGenerator> getGenerators(final DiagramOwner owner) {
    if ((this.generators == null)) {
      this.loadRegistry();
    }
    final ArrayList<IContainmentGenerator> result = new ArrayList<IContainmentGenerator>();
    final Set<Class<?>> classes = this.generators.keySet();
    for (final Class<?> clazz : classes) {
      boolean _isInstance = clazz.isInstance(owner);
      if (_isInstance) {
        result.addAll(this.generators.get(clazz));
      }
    }
    return result;
  }
}
