/*
 * generated by Xtext 2.11.0
 */
package ac.soton.xeventb.xstatemachine.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class XStatemachineAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("ac/soton/xeventb/xstatemachine/parser/antlr/internal/InternalXStatemachine.tokens");
	}
}