/*******************************************************************************
 * Copyright (c) 2013 RCP Vision (http://www.rcp-vision.com) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Lorenzo Bettini - initial API and implementation
 *******************************************************************************/
package it.rcpvision.emf.architecture.example.app.rap;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.rap.rwt.service.ServerPushSession;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.WorkbenchAdvisor;

/**
 * This class controls all aspects of the application's execution
 * and is contributed through the plugin.xml.
 */
public class Application implements IApplication {

	private ServerPushSession serverPushSession;
	
	private static final Logger LOGGER = LogManager.getLogger(Application.class);

	public Object start(IApplicationContext context) throws Exception {
		LOGGER.info("Starting new Countervision Application");
		Display display = PlatformUI.createDisplay();
		WorkbenchAdvisor advisor = new ApplicationWorkbenchAdvisor();
		//Abilito il refresh automatico
		serverPushSession = new ServerPushSession();
		serverPushSession.start();
		
				
		return PlatformUI.createAndRunWorkbench(display, advisor);		
	}
	
	public void stop() {
		serverPushSession.stop();
		LOGGER.info("Stopping Countervision Application");
	}

}
