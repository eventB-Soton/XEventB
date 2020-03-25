/**
 * Copyright (c) 2018 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     University of Southampton - initial API and implementation
 */
package ac.soton.xeventb.ui;

import ac.soton.xeventb.ui.IXEventBSharedImages;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the XEvent-B UI plug-in life cycle.
 * 
 * @author htson
 * @version 1.0
 * @since 0.1
 * @noextend This class is not intended to be extended by clients.
 */
@SuppressWarnings("all")
public final class XEventBUIPlugin extends AbstractUIPlugin {
  public static final String PLUGIN_ID = "ac.soton.xeventb.ui";
  
  private static XEventBUIPlugin plugin;
  
  /**
   * The constructor
   */
  public XEventBUIPlugin() {
  }
  
  /**
   * (non-Javadoc)
   * @see AbstractUIPlugin#start(org.osgi.framework.BundleContext)
   */
  @Override
  public void start(final BundleContext context) throws Exception {
    super.start(context);
    XEventBUIPlugin.plugin = this;
  }
  
  /**
   * (non-Javadoc)
   * @see AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
   */
  @Override
  public void stop(final BundleContext context) throws Exception {
    XEventBUIPlugin.plugin = null;
    super.stop(context);
  }
  
  /**
   * Returns the shared instance
   * @return the shared instance
   */
  public static XEventBUIPlugin getDefault() {
    return XEventBUIPlugin.plugin;
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
  @Override
  protected void initializeImageRegistry(final ImageRegistry registry) {
    this.registerImages(registry);
    super.initializeImageRegistry(registry);
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
  public void registerImages(final ImageRegistry registry) {
    XEventBUIPlugin.registerImage(registry, IXEventBSharedImages.IMG_XMACHINE, 
      IXEventBSharedImages.IMG_XMACHINE_PATH);
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
  public static void registerImage(final ImageRegistry registry, final String key, final String path) {
    final ImageDescriptor desc = XEventBUIPlugin.getImageDescriptor(path);
    registry.put(key, desc);
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
  public static ImageDescriptor getImageDescriptor(final String path) {
    return XEventBUIPlugin.getImageDescriptor(XEventBUIPlugin.PLUGIN_ID, path);
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
  public static ImageDescriptor getImageDescriptor(final String pluginID, final String path) {
    return AbstractUIPlugin.imageDescriptorFromPlugin(pluginID, path);
  }
}
