/*******************************************************************************
 * Copyright (c) 2018 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     University of Southampton - initial API and implementation
 *******************************************************************************/
package ac.soton.xeventb.common;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eventb.emf.core.machine.Machine;
import org.eclipse.emf.common.util.URI;

/**
 * <p>
 * An implementation for qualified Name Provider, including a definition of a qualified name of a machine
 * as projectName.machineName
 * </p>
 *
 * @author Dana
 * @version 0.1
 * @since 0.0.7
 */

public class EventBQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	
	QualifiedName qualifiedName(Machine mch){
		String projName= getProjectName(mch);
		String mchName = mch.getName();
		return QualifiedName.create(projName, mchName);
	}

private String getProjectName(Machine mch)  {
		
		URI eventBelementUri = mch.eResource().getURI();
		URI projectUri = eventBelementUri.trimFragment().trimSegments(1);
		return projectUri.lastSegment();

	}
//implements IQualifiedNameConverter {

//	@Override
//	public QualifiedName toQualifiedName(String qualifiedNameAsString) {
//		if (qualifiedNameAsString == null)
//			throw new IllegalArgumentException("Qualified name cannot be null");
//		if (qualifiedNameAsString.equals(""))
//			throw new IllegalArgumentException("Qualified name cannot be empty");
//		if (Strings.isEmpty(getDelimiter()))
//			return QualifiedName.create(qualifiedNameAsString);
//		List<String> segs = getDelimiter().length() == 1 ? Strings.split(qualifiedNameAsString, getDelimiter().charAt(0)) : (List<String>) Strings.split(qualifiedNameAsString, getDelimiter());
//	    return QualifiedName.create(segs);
//	}
//
//	@Override
//	public String toString(QualifiedName qualifiedName) {
//		
//		if (qualifiedName == null)
//			throw new IllegalArgumentException("Qualified name cannot be null");
//		
//		if (qualifiedName.getSegmentCount() == 1)
//			return qualifiedName.toString();
//		else
//			return qualifiedName.toString(getDelimiter());
//	}
//	public String getDelimiter() {
//		return ".";
//	}
}
