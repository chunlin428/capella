/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.test.business.queries.ju;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.eclipse.sirius.business.api.session.Session;
import org.polarsys.capella.core.business.queries.IBusinessQuery;
import org.polarsys.capella.test.framework.api.BasicTestCaseWithModelPreLoading;
import org.polarsys.capella.test.framework.helpers.log.FormatedLogger;
import org.polarsys.capella.test.framework.helpers.log.FormatedSysoutLogger;
import org.polarsys.capella.test.framework.helpers.log.SilentLogger;

/**
 * Generic implementation of test cases for Business Query Test.
 * 
 * @author Erwan Brottier
 */
public abstract class BQTestCase extends BasicTestCaseWithModelPreLoading {
	
	protected FormatedLogger logger = new FormatedSysoutLogger();

	@Override
	protected List<String> getProjectNamesToLoad() {
		return Arrays.asList(new String[] { getProjectForTest() });
	}

	public abstract String getProjectForTest();
	public abstract String getBQFullQualifiedName();

	public File getTestSuiteFile() {
		return BQTestHelpers.getTestSuiteFile(getPluginFolder(), getBQFullQualifiedName(), getProjectForTest());
	}
	
	@Override
	protected String getPluginId() {
		return TestBusinessQueriesPlugin.PLUGIN_ID;
	}

	@Override
	public void test() throws Exception {
		// Get and check parameters
		String queryIdentifier = getBQFullQualifiedName();
		IBusinessQuery businessQuery = BQTestHelpers.instanciateBQ(queryIdentifier);
		if (businessQuery == null)
			assertTrue("Impossible to instanciate business query " + queryIdentifier, false); //$NON-NLS-1$
		File testSuiteFile = getTestSuiteFile();
		if (testSuiteFile == null || !testSuiteFile.exists())
			assertTrue("test suite file does not exist (" + testSuiteFile + ")", false); //$NON-NLS-1$ //$NON-NLS-2$
		Session sessionForTest = getSessionForLoadedCapellaModel(getProjectForTest());
		
		// Begin test
		logger.addTextLn(BQTestConstants.PROMPT_STRING+" Test validation for query " + queryIdentifier); //$NON-NLS-1$
		BQTestCaseValidator validator = new BQTestCaseValidator();
		boolean result = validator.process(new SilentLogger(), queryIdentifier, businessQuery, testSuiteFile, sessionForTest);		

		// Assertion
		String message = validator.getResultDescription();
		logger.incIndent();
		logger.addTextLn(message);
		logger.decIndent();
		assertTrue(message.toString(), result);
	}
}
