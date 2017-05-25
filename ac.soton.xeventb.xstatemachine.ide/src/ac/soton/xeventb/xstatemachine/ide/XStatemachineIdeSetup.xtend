/*
 * generated by Xtext 2.11.0
 */
package ac.soton.xeventb.xstatemachine.ide

import ac.soton.xeventb.xstatemachine.XStatemachineRuntimeModule
import ac.soton.xeventb.xstatemachine.XStatemachineStandaloneSetup
import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class XStatemachineIdeSetup extends XStatemachineStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new XStatemachineRuntimeModule, new XStatemachineIdeModule))
	}
	
}
