/*******************************************************************************
 *  Copyright (c) 2018, 2020 University of Southampton.
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

package ac.soton.xeventb.common

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.eventb.emf.core.machine.Machine
import org.eclipse.emf.common.util.URI

/** 
 * <p>
 * An implementation for qualified Name Provider, including a definition of a qualified name of a machine
 * as projectName.machineName
 * </p>
 * @author Dana
 * @version 0.1
 * @since 0.0.7
 */
class EventBQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	def package QualifiedName qualifiedName(Machine mch) {
		var String projName = getProjectName(mch)
		var String mchName = mch.getName()
		return QualifiedName.create(projName, mchName)
	}

	def private String getProjectName(Machine mch) {
		var URI eventBelementUri = mch.eResource().getURI()
		var URI projectUri = eventBelementUri.trimFragment().trimSegments(1)
		return projectUri.lastSegment()
	} // implements IQualifiedNameConverter {
	// @Override
	// public QualifiedName toQualifiedName(String qualifiedNameAsString) {
	// if (qualifiedNameAsString == null)
	// throw new IllegalArgumentException("Qualified name cannot be null");
	// if (qualifiedNameAsString.equals(""))
	// throw new IllegalArgumentException("Qualified name cannot be empty");
	// if (Strings.isEmpty(getDelimiter()))
	// return QualifiedName.create(qualifiedNameAsString);
	// List<String> segs = getDelimiter().length() == 1 ? Strings.split(qualifiedNameAsString, getDelimiter().charAt(0)) : (List<String>) Strings.split(qualifiedNameAsString, getDelimiter());
	// return QualifiedName.create(segs);
	// }
	//
	// @Override
	// public String toString(QualifiedName qualifiedName) {
	//
	// if (qualifiedName == null)
	// throw new IllegalArgumentException("Qualified name cannot be null");
	//
	// if (qualifiedName.getSegmentCount() == 1)
	// return qualifiedName.toString();
	// else
	// return qualifiedName.toString(getDelimiter());
	// }
	// public String getDelimiter() {
	// return ".";
	// }
}
