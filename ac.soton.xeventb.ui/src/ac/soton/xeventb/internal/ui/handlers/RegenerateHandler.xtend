/*******************************************************************************
 * Copyright (c) 2021 University of Southampton.
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     University of Southampton - initial API and implementation
 *******************************************************************************/
package ac.soton.xeventb.internal.ui.handlers

import ac.soton.eventb.emf.inclusion.MachineInclusion
import ac.soton.xeventb.xcontext.generator.XContextGenerator
import ac.soton.xeventb.xmachine.generator.XMachineGenerator
import java.util.ArrayList
import java.util.Comparator
import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.core.commands.IHandler
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.transaction.RecordingCommand
import org.eclipse.jface.viewers.ISelection
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.ui.handlers.HandlerUtil
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.validation.CheckMode
import org.eventb.emf.core.context.Context
import org.eventb.emf.core.machine.Machine
import org.eventb.emf.persistence.EMFRodinDB

/** 
 * An implementation of a handler for batch generation from CamilleX Resources.
 * 
 * @author htson
 * @version 0.1
 * @since 1.1.0
 */
class RegenerateHandler extends AbstractHandler implements IHandler {

    /**
     * An implementation for the handler to run the generator all all CamilleX
     * resources within the selected project. The CamilleX resources are sorted
     * so that it allows the generation of all resources. 
     * 
     * @see IHandler#execute(ExecutionEvent)
     */
    override Object execute(ExecutionEvent event) throws ExecutionException {
        var Object obj = getCurrentSelectedObject(event)
        if (obj instanceof IProject) {

            val resourceSet = new XtextResourceSet()
            val xContextGenerator = new XContextGenerator()
            val xMachineGenerator = new XMachineGenerator()
            val reg = IResourceServiceProvider.Registry.INSTANCE;

            // Get all the CamilleX files within the project.
            val files = obj.members
            var camilleXFile = new ArrayList<Resource>();
            for (file : files) {
                if (file instanceof IFile) {
                    if (file.name.endsWith(".bucx") || file.name.endsWith(".bumx")) {
                        val uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
                        val resource = resourceSet.getResource(uri, true)
                        camilleXFile.add(resource)
                    }
                }
            }

            // Sort the CamilleX files accordingly.
            camilleXFile.sort(new Comparator<Resource> {

                /**
                 * An implementation of Comparator#compare(Resource, Resource)
                 * by consider the content of the resource and call the
                 * appropriate utility methods.  
                 */
                override compare(Resource o1, Resource o2) {
                    val content1 = o1.contents.get(0)
                    val content2 = o2.contents.get(0)
                    if (content1 instanceof Context) {
                        if (content2 instanceof Context)
                            return compare(content1, content2)
                        if (content2 instanceof Machine)
                            return compare(content2, content1)
                        return 0
                    }

                    if (content1 instanceof Machine) {
                        if (content2 instanceof Context)
                            return compare(content1, content2)
                        if (content2 instanceof Machine)
                            return compare(content1, content2)
                        return 0
                    }

                    return 0;
                }
            })

            // Iterate through the list of CamilleX resources.
            val emfRodinDB = new EMFRodinDB(resourceSet)
            val editingDomain = emfRodinDB.editingDomain
            for (resource : camilleXFile) {
                // Validate the resource to resolve the references.
                val resourceServiceProvider = reg.getResourceServiceProvider(resource.URI)
                val resourceValidator = resourceServiceProvider.resourceValidator
                // Use recording command for write transaction
                val command = new RecordingCommand(editingDomain, "Generate") {
                    override doExecute() {
                        // CheckMode need to be at least NORMAL_ONLY to resolve the reference
                        val issues = resourceValidator.validate(resource, CheckMode.NORMAL_ONLY,
                            CancelIndicator.NullImpl)
                        // If there are no issues then call the corresponding generator.
                        if (issues.size == 0) {
                            val content = resource.contents.get(0)
                            if (content instanceof Context) {
                                xContextGenerator.doGenerate(resource, null, null)
                            } else if (content instanceof Machine) {
                                xMachineGenerator.doGenerate(resource, null, null)
                            }
                        }
                    }
                }
                if (command.canExecute()) {
                    editingDomain.getCommandStack().execute(command);
                }
            }

        }
        return null
    }

    /**
     * Utility method to compare two input contexts. The result is a negative
     * integer, zero or a positive integer as the first context is "less than"
     * "equal to" or "greater than" the second machine.  The comparison is
     * defined according to the dependency between the contexts.
     * - If c1 extends c2 then c1 > c2 and vice versa.
     * - Otherwise, c1 == c2
     * 
     * @param c1 The first input context.
     * @param c2 The second input context.
     */
    def private int compare(Context c1, Context c2) {
        val c1Extends = c1.extendsNames
        val c2Extends = c2.extendsNames
        if (c1Extends.contains(c2.name))
            return 1
        if (c2Extends.contains(c1.name))
            return -1
        return 0
    }

    /**
     * Utility method to compare a machine and a context. The result is a
     * negative integer, zero or a positive integer as the machine is "less than"
     * "equal to" or "greater than" the context.  At the moment a machine is
     * always greater than a context.
     * 
     * @param m The input machine.
     * @param c The input context.
     */
    def private int compare(Machine m, Context c) {
        return 1
    }

    /**
     * Utility method to compare two input machines. The result is a negative
     * integer, zero or a positive integer as the first machine is "less than"
     * "equal to" or "greater than" the second machine.  The comparison is
     * defined according to the dependency between the machines.
     * - If m1 refines m2 then m1 > m2 and vice versa.
     * - If m1 includes m2 then m1 > m2 and vice versa.
     * - Otherwise, m1 == m2
     * 
     * @param m1 The first input machine.
     * @param m2 The second input machine.
     * @see RegenerateHandler#refines(Machine, Machine)
     * @see RegenerateHandler#includes(Machine, Machine)
     */
    def int compare(Machine m1, Machine m2) {
        if (m1.refines(m2))
            return 1
        if (m2.refines(m1))
            return -1
        if (m1.includes(m2))
            return 1
        if (m2.includes(m1))
            return -1
        return 0
    }

    /**
     * Utility method to check if an input machine m1 refines another input
     * machine m2. Return <code>true</code> if m1 refines m2 and
     * <code>false</code> otherwise.
     * 
     * @param m1 The first input machine.
     * @param m2 The second input machine.
     */
    def boolean refines(Machine m1, Machine m2) {
        val m1Refines = m1.refinesNames
        return m1Refines.contains(m2.name)
    }

    /**
     * Utility method to check if an input machine m1 includes another input
     * machine m2. Return <code>true</code> if m1 includes m2 and
     * <code>false</code> otherwise.
     * 
     * @param m1 The first input machine.
     * @param m2 The second input machine.
     */
    def boolean includes(Machine m1, Machine m2) {
        val exts = m1.extensions
        if (!exts.empty) {
            for (ext : exts) {
                if (ext instanceof MachineInclusion) {
                    if (ext.abstractMachine.name === m2.name) {
                        return true
                    }
                }
            }
        }
        return false
    }

    /** 
     * Get the current only selected object. If more than one objects are
     * selected, return <code>null</code>.
     * 
     * @param event
     *          the execution event
     * @return the only selected object.
     * @throws ExecutionException
     *          if some unexpected error occurs.
     */
    def private Object getCurrentSelectedObject(ExecutionEvent event) throws ExecutionException {
        // Get the current selection
        var ISelection selection = HandlerUtil::getCurrentSelectionChecked(event)
        if (selection instanceof IStructuredSelection) {
            var IStructuredSelection ssel = (selection as IStructuredSelection)
            if (ssel.size() === 1) {
                return ssel.getFirstElement()
            }
        }
        return null
    }

}
