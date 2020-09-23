package org.acme.acme_project.services;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import org.aceme.acme_project.services.magazzinoPrincipale.generated.* ;;

public class VerificaImportoTotaleImpl implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {

		MagazzinoPrincipaleServiceService magazzinoPrincipServiceService = new MagazzinoPrincipaleServiceService();
		MagazzinoPrincipaleService magazzinoPricipaleService = magazzinoPrincipServiceService.getMagazzinoPrincipaleServiceServicePort();
		
		VerificaImportoSaldo verificaImportoSaldoRequest = new VerificaImportoSaldo();
		verificaImportoSaldoRequest.setTotalePreventivo(Double.parseDouble(execution.getVariable("finalePreventivo").toString()));
		verificaImportoSaldoRequest.setImportoBonificoSaldo(Double.parseDouble(execution.getVariable("totaleSaldo").toString()));
		verificaImportoSaldoRequest.setImportoBonificoAcconto(Double.parseDouble(execution.getVariable("totaleAcconto").toString()));
		VerificaImportoSaldoResponse verificaImportoSaldoResponse = magazzinoPricipaleService.verificaImportoSaldo(verificaImportoSaldoRequest);
	
		boolean isOkTot = verificaImportoSaldoResponse.isImporto();
		
		execution.setVariable("isOkTot", isOkTot );

	}

}
