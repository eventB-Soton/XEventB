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

package ac.soton.xeventb.xmachine.utils

import org.eclipse.osgi.util.NLS
import ac.soton.xeventb.xmachine.generator.ContainmentRegistry

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
class Identifiers extends NLS {
	static val String BUNDLE_NAME = "ac.soton.xeventb.xmachine.utils.identifiers" //$NON-NLS-1$

	public static String EXTPT_CONTAINMENT_EXTPTID; // Containment extension point ID
	public static String EXTPT_CONTAINMENT_COMPONENT_ID; // Contained component ID
	public static String EXTPT_CONTAINMENT_COMPONENT_CLASS; // Contained component class
	public static String EXTPT_CONTAINMENT_COMPONENT_GENERATOR; // Contained component generator
	
	// This static initialisation is the workaround in XTend for static initialise of messages
	static val int STATIC_INITIALISATION = {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, typeof(Identifiers));
		return 0
	}

	private new() { // This should never be called
		// Dummy print statement to remove the warning about unused STATIC_INITIALISATION
		System.out.println(STATIC_INITIALISATION)
	}
}