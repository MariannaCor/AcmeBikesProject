package org.acme.acme_project;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class NotificaAcconto implements JavaDelegate {

	@Override
	public void execute(DelegateExecution exec) throws Exception {
		
		exec.getProcessEngineServices().getRuntimeService()
		.createMessageCorrelation("notificaAccontoRec")
		.correlate();

	}

}
