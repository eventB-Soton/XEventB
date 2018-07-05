/***********************************************************************
 * Copyright (c) 2018 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     University of Southampton - initial API and implementation
 **********************************************************************/
package ac.soton.xeventb.ui

import org.eclipse.jface.resource.ImageDescriptor
import org.eclipse.jface.resource.ImageRegistry
import org.eclipse.ui.plugin.AbstractUIPlugin
import org.osgi.framework.BundleContext

/**
 * The activator class controls the XEvent-B UI plug-in life cycle.
 * 
 * @author htson
 * @version 1.0
 * @since 1.0 
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 */
class XEventBUIPlugin extends AbstractUIPlugin {
	// The plug-in ID
	public static final String PLUGIN_ID = "ac.soton.xeventb.ui" // $NON-NLS-1$
	// The shared instance
	static XEventBUIPlugin plugin

	/** 
	 * The constructor
	 */
	new() {
	}

	/*
	 * (non-Javadoc)
	 * @see AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	override void start(BundleContext context) throws Exception {
		super.start(context)
		plugin = this
		
	}

	/*
	 * (non-Javadoc)
	 * @see AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	override void stop(BundleContext context) throws Exception {
		plugin = null
		super.stop(context)
	}

	/** 
	 * Returns the shared instance
	 * @return the shared instance
	 */
	def static XEventBUIPlugin getDefault() {
		return plugin
	}
	
	/**
	 * Register common images used by XEvent-B. The keys and paths for
	 * the images are from {@link IXEventBSharedImages}. To use the image,
	 * use the following snippet.
	 * 
	 * <ul>
	 * <li> Java:
	 * <pre>
	 * XEventBUIPlugin.getDefault().
	 *         getImageRegistry().get(IXEventBSharedImages.IMG_XMACHINE)
	 * </pre>
	 * <li> Xtend:
	 * <pre>
	 * XEventBUIPlugin.default.
	 *         imageRegistry.get(IXEventBSharedImages.IMG_XMACHINE)
	 * </pr>
	 * </li>
	 * </ul>
	 * 
	 * @param registry
	 *            The image registry
	 * @since 1.0
	 */
	override protected void initializeImageRegistry(ImageRegistry registry) {
		registerImages(registry)
		super.initializeImageRegistry(registry)
	}
		
	/**
	 * Register images with the image registry. Additional images should
	 * be added here
	 * <p>
	 * 
	 * @param registry
	 *            The image registry
	 * @since 1.0
	 */
	def registerImages(ImageRegistry registry) {
		registerImage(registry, IXEventBSharedImages.IMG_XMACHINE,
			IXEventBSharedImages.IMG_XMACHINE_PATH
		);
	}
	
	/**
	 * Register an image with the image registry
	 * 
	 * @param registry
	 *            the image registry
	 * @param key
	 *            the key to retrieve the image later
	 * @param path
	 *            the path to the location of the image file within this
	 * 	          XEvent-B UI plugin
	 */
	def static registerImage(ImageRegistry registry, String key,
			String path) {
		val ImageDescriptor desc = getImageDescriptor(path)
		registry.put(key, desc)
	}
	
	/**
	 * Returns an image descriptor for the image file within the 
	 * XEvent-B UI plugin at the given plug-in relative path.
	 * <p>
	 * 
	 * @param path
	 *            relative path of the image within this XEvent-B UI
	 *            Plugin
	 * @return the image descriptor, or <code>null</code> if the image
	 *            could not be found
	 */
	def static ImageDescriptor getImageDescriptor(String path) {
		return getImageDescriptor(XEventBUIPlugin.PLUGIN_ID, path)
	}
	
	/**
	 * Returns an image descriptor for the image file at the given
	 *  plug-in ID and the relative path within the plugin
	 * <p>
	 * 
	 * @param path
	 *            relative path of the image
	 * @return the image descriptor, or <code>null</code> if the image
	 *            could not be found
	 */
	def static ImageDescriptor getImageDescriptor(String pluginID,
			String path) {
		return AbstractUIPlugin.imageDescriptorFromPlugin(pluginID, path)
	}
	
}
