/*
 * generated by Xtext 2.15.0
 */
package ac.soton.xeventb.xcontext.ui.tests;

import ac.soton.xeventb.xcontext.ui.internal.XcontextActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;

public class XContextUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return XcontextActivator.getInstance().getInjector("ac.soton.xeventb.xcontext.XContext");
	}

}
