/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2012
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.pattern.abstractfactory;

public class NodeActivationTask {

	private String id;
	private String name;

	/**
	 * @param id
	 */
	public NodeActivationTask(String id) {
		super();
		this.id = id;
		this.name = this.getClass().getSimpleName();
	}
	
	public String getId(){
		return this.id;
	}
	
	public String toString(){
		return (this.id + " " + this.name);
	}
	
	
}
