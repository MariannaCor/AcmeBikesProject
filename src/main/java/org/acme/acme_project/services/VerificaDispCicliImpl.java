package org.acme.acme_project.services;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.spin.json.SpinJsonNode;


import static org.camunda.spin.DataFormats.json;
import static org.camunda.spin.Spin.S;

import org.aceme.acme_project.services.magazzinoPrincipale.generated.* ;

public class VerificaDispCicliImpl implements JavaDelegate {

	
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		boolean componentePresente ;
		String componente = execution.getVariable("componente").toString();
		SpinJsonNode json = S(componente, json());
		
		if(json.hasProp("codice")){
			MagazzinoPrincipaleServiceService magazzinoPrincipServiceService = new MagazzinoPrincipaleServiceService();
			MagazzinoPrincipaleService magazzinoPricipaleService = magazzinoPrincipServiceService.getMagazzinoPrincipaleServiceServicePort();
			
			VerificaComponentiCicli verificaComponentiCicliRequest = new VerificaComponentiCicli();
			verificaComponentiCicliRequest.setCodiceComponente(json.prop("codice").stringValue());
			VerificaComponentiCicliResponse verificaComponentiCicliResponse = magazzinoPricipaleService.verificaComponentiCicli(verificaComponentiCicliRequest);
			
			componentePresente = verificaComponentiCicliResponse.isVerificaComponente();
			
		} else {
			//se è null non viene aggiunto alla lista dei componenti mancanti (non esiste)
			componentePresente = true;
		}
				
		execution.setVariable("componentePresente", componentePresente );

	}

}
