/*******************************************************************************
 * Copyright (c) 2006, 2008 Abstratt Technologies
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rafael Chaves (Abstratt Technologies) - initial API and implementation
 *******************************************************************************/ 
package com.abstratt.mdd.frontend.core;

import org.eclipse.uml2.uml.util.UMLValidator;


public class InvalidConnector extends Problem {

	public enum Reason {
		// UML2 derived reasons
	    Roles("Roles must be owned by connector parent or by the classifiers of the parts of the connector parent", UMLValidator.CONNECTOR__ROLES),
	    BetweenInterfacesPorts("Port interfaces are not compatible", UMLValidator.CONNECTOR__BETWEEN_INTERFACES_PORTS),
	    Types("Connectable elements must conform to the types of the association ends of the association that types the connector", UMLValidator.CONNECTOR__TYPES),
	    // not implemented in UML2 yet
	    Compatible("The connectable elements attached to the ends of a connector must be compatible", UMLValidator.CONNECTOR__COMPATIBLE)
	    
	    // custom rules
	    
	    ;
	    private String reasonMessage;
		private Integer code;
	    Reason(String reasonMessage, Integer code) {
	    	this.reasonMessage = reasonMessage;
	    	this.code = code;
	    }
	    public String getReasonMessage() {
			return reasonMessage;
		}
		public static Reason get(int reasonCode) {
			for (Reason reason : values())
				if (reason.code != null && reason.code == reasonCode)
					return reason;
			return null;
		}
	}
	private Reason reason;
	private String reasonMessage;
	
	public InvalidConnector(int reasonCode) {
		super(Severity.ERROR);
		this.reason = Reason.get(reasonCode);
		this.reasonMessage = reason == null ? ("Unexpected reason: " + reasonCode) : reason.getReasonMessage();
	}
	public String getMessage() {
		return reasonMessage;
	}
	public Reason getReason() {
		return reason;
	}
}
