/*
 * generated by Xtext 2.22.0
 */
package ac.soton.xeventb.xmachine.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class XMachineAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("ac/soton/xeventb/xmachine/parser/antlr/internal/InternalXMachine.tokens");
	}
}
