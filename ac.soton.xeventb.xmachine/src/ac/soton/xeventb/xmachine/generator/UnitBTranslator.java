package ac.soton.xeventb.xmachine.generator;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eventb.emf.core.AbstractExtension;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.persistence.EventBEMFUtils;

public class UnitBTranslator {

	public static void translate(TransactionalEditingDomain domain, Machine machine, AbstractExtension extension) {
		
		// This create an invariant labelled "inv1", predicate "1 = 1".
		EventBEMFUtils.createInvariant(domain, machine, "inv1", "1=1", false);
		
	}

}
