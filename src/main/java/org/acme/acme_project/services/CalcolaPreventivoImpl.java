package org.acme.acme_project.services;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import org.aceme.acme_project.services.magazzinoPrincipale.generated.* ;

public class CalcolaPreventivoImpl implements JavaDelegate {

	private int scontoSoglia = 10;
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
				
		MagazzinoPrincipaleServiceService magazzinoPrincipServiceService = new MagazzinoPrincipaleServiceService();
		MagazzinoPrincipaleService magazzinoPricipaleService = magazzinoPrincipServiceService.getMagazzinoPrincipaleServiceServicePort();
		
		CalcolaPreventivo calcolaPreventivoRequest = new CalcolaPreventivo();
		calcolaPreventivoRequest.setLista(execution.getVariable("listaOrdine").toString());
		CalcolaPreventivoResponse calcolaPreventivoResponse = magazzinoPricipaleService.calcolaPreventivo(calcolaPreventivoRequest);
		
		double tot = calcolaPreventivoResponse.getTot();
		
		execution.setVariable("bozzaPreventivo", tot );
		
		if(tot > Double.parseDouble(execution.getVariable("scontoSoglia").toString()))
			execution.setVariable("scontoOk", true );
		else
			execution.setVariable("scontoOk", false );

	}

}
