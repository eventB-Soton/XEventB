/**
 * Copyright (c) 2018, 2020 University of Southampton.
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
package ac.soton.xeventb.common;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eventb.emf.core.machine.Machine;

/**
 * <p>
 * An implementation for qualified Name Provider, including a definition of a qualified name of a machine
 * as projectName.machineName
 * </p>
 * @author Dana
 * @version 0.1
 * @since 0.0.7
 */
@SuppressWarnings("all")
public class EventBQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
  QualifiedName qualifiedName(final Machine mch) {
    String projName = this.getProjectName(mch);
    String mchName = mch.getName();
    return QualifiedName.create(projName, mchName);
  }
  
  private String getProjectName(final Machine mch) {
    URI eventBelementUri = mch.eResource().getURI();
    URI projectUri = eventBelementUri.trimFragment().trimSegments(1);
    return projectUri.lastSegment();
  }
}
