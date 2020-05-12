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
package ac.soton.xeventb.xmachine.utils;

import ac.soton.xeventb.xmachine.generator.ContainmentRegistry;
import org.eclipse.osgi.util.NLS;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

/**
 * <p>
 * This class contains Identifiers that are defined via NLS messages.
 * </p>
 * 
 * @author htson
 * @version 0.1
 * @see ContainmentRegistry
 * @since 2.0
 */
@SuppressWarnings("all")
public class Identifiers extends NLS {
  private static final String BUNDLE_NAME = "ac.soton.xeventb.xmachine.utils.identifiers";
  
  public static String EXTPT_CONTAINMENT_EXTPTID;
  
  public static String EXTPT_CONTAINMENT_COMPONENT_ID;
  
  public static String EXTPT_CONTAINMENT_COMPONENT_CLASS;
  
  public static String EXTPT_CONTAINMENT_COMPONENT_GENERATOR;
  
  private static final int STATIC_INITIALISATION = new Function0<Integer>() {
    @Override
    public Integer apply() {
      NLS.initializeMessages(Identifiers.BUNDLE_NAME, Identifiers.class);
      return 0;
    }
  }.apply().intValue();
  
  private Identifiers() {
    System.out.println(Identifiers.STATIC_INITIALISATION);
  }
}
