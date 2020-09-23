package org.acme.acme_project.services;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ApplicaScontoImpl implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {

		execution.setVariable("applicaSconto", true );

	}

}
