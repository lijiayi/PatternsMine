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

public class MyClient {

	public static void main(String args[]){
		AbstractCreationFactory factory = null;
		
		String type = "Stats";
		
		switch (type) {
			case "Celltrace" : factory = CelltraceCreationFactory.getInstance();
								break;
			case "Stats" : factory = StatsCreationFactory.getInstance();
								break;
			default:
				System.out.println("Wrong type");
				break;
		}
		
		FileCollectionTask fcTask = factory.createFileCollectionTask();
		NodeDeactivationTask ndTask = factory.createNodeDeactivationTask();
		NodeActivationTask naTask = factory.createNodeActivationTask();
		
		System.out.println(fcTask.toString());
		System.out.println(naTask.toString());
		System.out.println(ndTask.toString());
	}
	
}
