package org.acme.acme_project;

import org.aceme.acme_project.services.corriere.generated.* ;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ConsegnaAccessorioRivendita implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		CorriereServiceService corriereServiceService = new CorriereServiceService();
		CorriereService corriereService = corriereServiceService.getCorriereServiceServicePort();
		
		SpedizionePacco spedizionePaccoRequest = new SpedizionePacco();
		spedizionePaccoRequest.setStatusPacco("In consegna al cliente");
		
		corriereService.spedizionePacco(spedizionePaccoRequest);
		
		execution.getProcessEngineServices().getRuntimeService()
		.createMessageCorrelation("PaccoAccessorioRec")
		.correlate();

	}

}
