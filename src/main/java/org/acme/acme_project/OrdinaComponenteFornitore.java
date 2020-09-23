package org.acme.acme_project;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import org.aceme.acme_project.services.fornitore.generated.* ;

public class OrdinaComponenteFornitore implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {

		FornitoreServiceService fornitoreServiceService = new FornitoreServiceService();
		FornitoreService fornitoreService = fornitoreServiceService.getFornitoreServiceServicePort();
		
		OrdineComponenteMancante ordineComponenteMancanteRequest = new OrdineComponenteMancante();

		ordineComponenteMancanteRequest.setCodiceComponente(execution.getVariable("codiceComponente").toString());
		fornitoreService.ordineComponenteMancante(ordineComponenteMancanteRequest);
	

		execution.getProcessEngineServices().getRuntimeService()
		.createMessageCorrelation("OrdineComponenteMancanteRec")
		.correlate();
		
	}
}
