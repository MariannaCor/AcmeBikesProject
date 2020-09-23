package org.acme.acme_project.services;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import org.aceme.acme_project.services.magazzinoPrincipale.generated.* ;

public class VerificaImportoImpl implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {

		MagazzinoPrincipaleServiceService magazzinoPrincipServiceService = new MagazzinoPrincipaleServiceService();
		MagazzinoPrincipaleService magazzinoPricipaleService = magazzinoPrincipServiceService.getMagazzinoPrincipaleServiceServicePort();
		
		VerificaImportoAcconto verificaImportoRequest = new VerificaImportoAcconto();
		verificaImportoRequest.setTotalePreventivo(Double.parseDouble(execution.getVariable("finalePreventivo").toString()));
		verificaImportoRequest.setImportoBonificoAcconto(Double.parseDouble(execution.getVariable("totaleAcconto").toString()));
		VerificaImportoAccontoResponse verificaImportoResponse = magazzinoPricipaleService.verificaImportoAcconto(verificaImportoRequest);
	
		boolean isOk = verificaImportoResponse.isImporto();
		
		execution.setVariable("isOk", isOk );

	}

}
