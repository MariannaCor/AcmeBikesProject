package org.acme.acme_project;

import org.aceme.acme_project.services.corriere.generated.CorriereService;
import org.aceme.acme_project.services.corriere.generated.CorriereServiceService;
import org.aceme.acme_project.services.corriere.generated.SpedizionePacco;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ConsegnaCicloRivendita implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		CorriereServiceService corriereServiceService = new CorriereServiceService();
		CorriereService corriereService = corriereServiceService.getCorriereServiceServicePort();
		
		SpedizionePacco spedizionePaccoRequest = new SpedizionePacco();
		spedizionePaccoRequest.setStatusPacco("In consegna al cliente");
		
		corriereService.spedizionePacco(spedizionePaccoRequest);
		
		execution.getProcessEngineServices().getRuntimeService()
		.createMessageCorrelation("PaccoCicloRec")
		.correlate();


	}

}
