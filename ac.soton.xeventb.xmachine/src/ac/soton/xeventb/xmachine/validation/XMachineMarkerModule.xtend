/*******************************************************************************
 *  Copyright (c) 2016,2020 University of Southampton.
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

package ac.soton.xeventb.xmachine.validation

import java.util.regex.Pattern
import org.eclipse.core.resources.IMarker
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Path
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.diagnostics.Severity
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.validation.CheckMode
import org.eventb.core.sc.SCCore
import org.eventb.core.sc.SCProcessorModule
import org.eventb.core.sc.state.ISCStateRepository
import org.eventb.core.tool.IModuleType
import org.eventb.emf.persistence.EMFRodinDB
import org.rodinp.core.IInternalElement
import org.rodinp.core.IRodinElement
import org.rodinp.core.IRodinFile

/**
 * <p>
 * Rodin Static Checker Module for lifting Rodin markers to XMachine.
 * </p>
 *
 * @author htson - Initial implementation
 * @version 0.1
 * @since 2.0
 */
class XMachineMarkerModule extends SCProcessorModule {

	// Module type: This must be consistent with the extension
	val IModuleType<XMachineMarkerModule> MODULE_TYPE = SCCore
		.getModuleType("ac.soton.xeventb.xmachine.XMachineMarkerModule"); //$NON-NLS-1$


	/**
	 * The main process method, which get the issues by running expensive
	 * validation rules, and created the markers based on the result.
	 */
	override void process(IRodinElement element, IInternalElement target,
		ISCStateRepository repository, IProgressMonitor monitor
	) throws CoreException {
		val machineFile = element as IRodinFile;
		val emfRodinDB = new EMFRodinDB()
		val resource = emfRodinDB.loadResource(machineFile.getRoot())
		var uriString = resource.URI.toString
		uriString = uriString.substring(0, uriString.lastIndexOf('bum'))
		uriString = uriString + "bumx"
		val uri = URI.createURI(uriString)
		
		// Get the XMachine resource.
		val xresource = emfRodinDB.loadResource(uri) as XtextResource
		// Do nothing if there is no resource, e.g., when there is no XContext file
		if (xresource === null)
			return
		// Get the resource validator for the XMachine.
		val resourceServiceProvider = xresource.resourceServiceProvider
		val resourceValidator = resourceServiceProvider.resourceValidator
		// Get the issues by running the resrouce validator.
		val issues = resourceValidator.validate(xresource, CheckMode.EXPENSIVE_ONLY, null)

		// Get the File corresponding to the XMachine
		val iFile = ResourcesPlugin.workspace.root.getFile(new Path(uri.toPlatformString(true)))
		
		// First remove all the old markers
		val markers = iFile.findMarkers(null, true, IResource.DEPTH_INFINITE);
		for (marker : markers)
			marker.delete
		
		// Create the markers based on the issues.
		for (issue : issues) {
			val m = iFile.createMarker(IMarker.PROBLEM)
			m.setAttribute(IMarker.LINE_NUMBER, issue.lineNumber)
			m.setAttribute(IMarker.SOURCE_ID, issue.uriToProblem.toString)		
			var message = issue.message
			// Extract the start and end positions from the message
			val pattern = Pattern.compile("(.*?)\\s*\\(from\\s*(\\d*?)\\s*to\\s*(\\d*?)\\s*\\)")
			val matcher = pattern.matcher(message)
			var char_start = issue.offset
			var char_end = issue.offset + issue.length
			if (matcher.find) {
				message = matcher.group(1)
				val start = Integer.parseInt(matcher.group(2))
				val end = Integer.parseInt(matcher.group(3))
				char_end = char_start + end
				char_start = char_start + start				
			}
			m.setAttribute(IMarker.CHAR_START, char_start)
			m.setAttribute(IMarker.CHAR_END, char_end)
			m.setAttribute(IMarker.MESSAGE, message)
			val severity = issue.severity
			switch (severity) {
				case Severity.ERROR: 
					m.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR)
				case Severity.WARNING: 
					m.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING)
				case Severity.INFO: 
					m.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_INFO)
				case Severity.IGNORE: {}
			}
		}
    	return
	}

	/**
	 * Return the module type.
	 */
	override IModuleType<?> getModuleType() {
		return MODULE_TYPE;
	}

}
