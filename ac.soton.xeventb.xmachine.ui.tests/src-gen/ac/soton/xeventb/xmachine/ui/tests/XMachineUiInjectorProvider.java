/*
 * generated by Xtext 2.24.0
 */
package ac.soton.xeventb.xmachine.ui.tests;

import ac.soton.xeventb.xmachine.ui.internal.XmachineActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;

public class XMachineUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return XmachineActivator.getInstance().getInjector("ac.soton.xeventb.xmachine.XMachine");
	}

}
