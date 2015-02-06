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
package org.polarsys.capella.test.business.queries.ju.errors;

/**
 * @author Erwan Brottier
 */
public class InvalidIdentifierInTestCaseError implements BQValidationError {

	protected String identifier;
	
	public InvalidIdentifierInTestCaseError(String methodName) {
		this.identifier = methodName;
	}
	
	public String toString() {
		return "identifier "+identifier+" is not valid";  //$NON-NLS-1$//$NON-NLS-2$
	}

}
