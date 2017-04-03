/*******************************************************************************
 * Copyright (c) 2017 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     University of Southampton - initial API and implementation
 *******************************************************************************/
package ac.soton.xeventb.xmachine;

import ac.soton.xeventb.xmachine.XMachineStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class XMachineStandaloneSetup extends XMachineStandaloneSetupGenerated{

	public static void doSetup() {
		new XMachineStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

