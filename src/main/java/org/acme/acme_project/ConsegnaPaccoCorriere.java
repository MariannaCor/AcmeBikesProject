package org.acme.acme_project;


import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.aceme.acme_project.services.magazzinoEsterno.generated.* ;

public class ConsegnaPaccoCorriere implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		MagazzinoEsternoServiceService magazzinoEsternoServiceService = new MagazzinoEsternoServiceService();
		MagazzinoEsternoService magazzinoEsternoService = magazzinoEsternoServiceService.getMagazzinoEsternoServiceServicePort();
		
		ConsegnaAccessorioCorriere consegnaAccessorioCorriereRequest = new ConsegnaAccessorioCorriere();
		consegnaAccessorioCorriereRequest.setStatusPacco("In consegna al corriere");
		
		magazzinoEsternoService.consegnaAccessorioCorriere(consegnaAccessorioCorriereRequest);
		
		execution.setVariable("statusPaccoCorriere", 1);
		
		execution.getProcessEngineServices().getRuntimeService()
		.createMessageCorrelation("consegnaPaccoRec")
		.correlate();

	}

}
