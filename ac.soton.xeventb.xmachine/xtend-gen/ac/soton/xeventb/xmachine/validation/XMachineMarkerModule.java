/**
 * Copyright (c) 2016,2020 University of Southampton.
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
package ac.soton.xeventb.xmachine.validation;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.eventb.core.sc.SCCore;
import org.eventb.core.sc.SCProcessorModule;
import org.eventb.core.sc.state.ISCStateRepository;
import org.eventb.core.tool.IModuleType;
import org.eventb.emf.persistence.EMFRodinDB;
import org.rodinp.core.IInternalElement;
import org.rodinp.core.IRodinElement;
import org.rodinp.core.IRodinFile;

/**
 * <p>
 * Rodin Static Checker Module for lifting Rodin markers to XMachine.
 * </p>
 * 
 * @author htson - Initial implementation
 * @version 0.1
 * @since 2.0
 */
@SuppressWarnings("all")
public class XMachineMarkerModule extends SCProcessorModule {
  private final IModuleType<XMachineMarkerModule> MODULE_TYPE = SCCore.<XMachineMarkerModule>getModuleType("ac.soton.xeventb.xmachine.XMachineMarkerModule");
  
  /**
   * The main process method, which get the issues by running expensive
   * validation rules, and created the markers based on the result.
   */
  @Override
  public void process(final IRodinElement element, final IInternalElement target, final ISCStateRepository repository, final IProgressMonitor monitor) throws CoreException {
    final IRodinFile machineFile = ((IRodinFile) element);
    final EMFRodinDB emfRodinDB = new EMFRodinDB();
    final Resource resource = emfRodinDB.loadResource(machineFile.getRoot());
    String uriString = resource.getURI().toString();
    uriString = uriString.substring(0, uriString.lastIndexOf("bum"));
    uriString = (uriString + "bumx");
    final URI uri = URI.createURI(uriString);
    Resource _loadResource = emfRodinDB.loadResource(uri);
    final XtextResource xresource = ((XtextResource) _loadResource);
    if ((xresource == null)) {
      return;
    }
    final IResourceServiceProvider resourceServiceProvider = xresource.getResourceServiceProvider();
    final IResourceValidator resourceValidator = resourceServiceProvider.getResourceValidator();
    final List<Issue> issues = resourceValidator.validate(xresource, CheckMode.EXPENSIVE_ONLY, null);
    IWorkspaceRoot _root = ResourcesPlugin.getWorkspace().getRoot();
    String _platformString = uri.toPlatformString(true);
    Path _path = new Path(_platformString);
    final IFile iFile = _root.getFile(_path);
    final IMarker[] markers = iFile.findMarkers(null, true, IResource.DEPTH_INFINITE);
    for (final IMarker marker : markers) {
      marker.delete();
    }
    for (final Issue issue : issues) {
      {
        final IMarker m = iFile.createMarker(IMarker.PROBLEM);
        m.setAttribute(IMarker.LINE_NUMBER, issue.getLineNumber());
        m.setAttribute(IMarker.SOURCE_ID, issue.getUriToProblem().toString());
        String message = issue.getMessage();
        final Pattern pattern = Pattern.compile("(.*?)\\s*\\(from\\s*(\\d*?)\\s*to\\s*(\\d*?)\\s*\\)");
        final Matcher matcher = pattern.matcher(message);
        Integer char_start = issue.getOffset();
        Integer _offset = issue.getOffset();
        Integer _length = issue.getLength();
        int char_end = ((_offset).intValue() + (_length).intValue());
        boolean _find = matcher.find();
        if (_find) {
          message = matcher.group(1);
          final int start = Integer.parseInt(matcher.group(2));
          final int end = Integer.parseInt(matcher.group(3));
          char_end = ((char_start).intValue() + end);
          char_start = Integer.valueOf(((char_start).intValue() + start));
        }
        m.setAttribute(IMarker.CHAR_START, char_start);
        m.setAttribute(IMarker.CHAR_END, char_end);
        m.setAttribute(IMarker.MESSAGE, message);
        final Severity severity = issue.getSeverity();
        if (severity != null) {
          switch (severity) {
            case ERROR:
              m.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
              break;
            case WARNING:
              m.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
              break;
            case INFO:
              m.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_INFO);
              break;
            case IGNORE:
              break;
            default:
              break;
          }
        }
      }
    }
    return;
  }
  
  /**
   * Return the module type.
   */
  @Override
  public IModuleType<?> getModuleType() {
    return this.MODULE_TYPE;
  }
}
