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

import java.util.*;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.containers.StateBasedContainerManager;
/**
 * <p>
 * An implementation for StateBasedContainerManager, including a definition of visible containers
 * to include other projects in the workspace
 * </p>
 *
 * @author Dana
 * @version 0.1
 * @since 0.0.7
 */
public class EventBContainerManager  extends StateBasedContainerManager{
	@Override
    protected List<IContainer> getVisibleContainers(List<String> handles, IResourceDescriptions resourceDescriptions) {
        List<IContainer> result = super.getVisibleContainers(handles, resourceDescriptions);
     
        for (IResourceDescription rd : resourceDescriptions.getAllResourceDescriptions()) {
        	
            IContainer container = super.getContainer(rd, resourceDescriptions);
            
            if (!container.isEmpty()) 
            	result.add(container);
        }

        return result;
    }
}
