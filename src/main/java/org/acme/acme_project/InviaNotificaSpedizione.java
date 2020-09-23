package org.acme.acme_project;

import org.aceme.acme_project.services.corriere.generated.* ;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class InviaNotificaSpedizione implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		CorriereServiceService corriereServiceService = new CorriereServiceService();
		CorriereService corriereService = corriereServiceService.getCorriereServiceServicePort();
		
		InviaNotifica inviaNotificaRequest = new InviaNotifica() ;
		
		inviaNotificaRequest.setStatusPacco("inConsegna");
		
		InviaNotificaResponse inviaNotificaResponse = corriereService.inviaNotifica(inviaNotificaRequest);
		
		execution.getProcessEngineServices().getRuntimeService()
		.createMessageCorrelation("notificaSpedizioneRec")
		.setVariable("msg", inviaNotificaResponse.getMsg())
		.correlate();

	}
}
