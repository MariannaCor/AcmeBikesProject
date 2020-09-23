package org.acme.acme_project.services;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import org.aceme.acme_project.services.magazzinoPrincipale.generated.* ;

public class ScomponiOrdineImpl implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
				
		MagazzinoPrincipaleServiceService magazzinoPrincipServiceService = new MagazzinoPrincipaleServiceService();
		MagazzinoPrincipaleService magazzinoPricipaleService = magazzinoPrincipServiceService.getMagazzinoPrincipaleServiceServicePort();
		
		ScomponiOrdine scomponiOrdineRequest = new ScomponiOrdine();
		scomponiOrdineRequest.setListaOrdine(execution.getVariable("listaOrdine").toString());
		ScomponiOrdineResponse scomponiOrdineResponse = magazzinoPricipaleService.scomponiOrdine(scomponiOrdineRequest);
		
		
		execution.setVariable("accessoriCheck", scomponiOrdineResponse.isAccessoriOk());

	}

}
