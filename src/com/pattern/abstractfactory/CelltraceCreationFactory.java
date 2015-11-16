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

public class CelltraceCreationFactory implements AbstractCreationFactory {

	/* (non-Javadoc)
	 * @see com.pattern.abstractfactory.AbstractCreationFactory#createFileCollectionTask()
	 */
	@Override
	public FileCollectionTask createFileCollectionTask() {
		FileCollectionTask result = new CelltraceFileCollectionTask("HeiHeiHei Go Collection");
		
		return result;
	}

	/* (non-Javadoc)
	 * @see com.pattern.abstractfactory.AbstractCreationFactory#createNodeActivationTask()
	 */
	@Override
	public NodeActivationTask createNodeActivationTask() {
		NodeActivationTask result = new CelltraceNodeActivationTask("HeiHeiHei Go Activation");
		return result;
	}

	/* (non-Javadoc)
	 * @see com.pattern.abstractfactory.AbstractCreationFactory#createNodeDeactivationTask()
	 */
	@Override
	public NodeDeactivationTask createNodeDeactivationTask() {
		NodeDeactivationTask result = new CelltraceNodeDeactivationTask("Go Deactivation");
		return result;
	}

	/* (non-Javadoc)
	 * @see com.pattern.abstractfactory.AbstractCreationFactory#getInstance()
	 */
	public static AbstractCreationFactory getInstance() {
		return new CelltraceCreationFactory();
	}

}
