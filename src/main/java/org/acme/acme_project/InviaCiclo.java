package org.acme.acme_project;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class InviaCiclo implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		execution.setVariable("statusPaccoCorriere", 1);
		
		execution.getProcessEngineServices().getRuntimeService()
		.createMessageCorrelation("ConsegnaCicloRec")
		.correlate();

	}

}
