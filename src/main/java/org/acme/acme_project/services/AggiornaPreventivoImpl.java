package org.acme.acme_project.services;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import org.aceme.acme_project.services.magazzinoPrincipale.generated.* ;

public class AggiornaPreventivoImpl implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {

		MagazzinoPrincipaleServiceService magazzinoPrincipServiceService = new MagazzinoPrincipaleServiceService();
		MagazzinoPrincipaleService magazzinoPricipaleService = magazzinoPrincipServiceService.getMagazzinoPrincipaleServiceServicePort();
		
		AggiornaPreventivo aggiornaPreventivoRequest = new AggiornaPreventivo();
		aggiornaPreventivoRequest.setParzialePreventivo(Double.parseDouble(execution.getVariable("bozzaPreventivo").toString()));
		
		boolean applicaSconto = (boolean) execution.getVariable("applicaSconto"); 
		
		if(applicaSconto)
			aggiornaPreventivoRequest.setSconto(Integer.parseInt(execution.getVariable("sconto").toString()));

		else 
			aggiornaPreventivoRequest.setSconto(0);
		
		
		aggiornaPreventivoRequest.setApplicaSconto(applicaSconto);
		
		AggiornaPreventivoResponse aggiornaPreventivoResponse = magazzinoPricipaleService.aggiornaPreventivo(aggiornaPreventivoRequest);
	
		double tot = aggiornaPreventivoResponse.getTot();
		
		execution.setVariable("finalePreventivo", tot );

	}

}
