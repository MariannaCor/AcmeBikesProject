package org.acme.acme_project.services;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.spin.json.SpinJsonNode;
import static org.camunda.spin.DataFormats.json;
import static org.camunda.spin.Spin.S;

import org.aceme.acme_project.services.magazzinoPrincipale.generated.* ;

public class VerificaMontaggioImpl implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		String customerJson = execution.getVariable("accessorio").toString();
		SpinJsonNode json = S(customerJson, json());

		MagazzinoPrincipaleServiceService magazzinoPrincipServiceService = new MagazzinoPrincipaleServiceService();
		MagazzinoPrincipaleService magazzinoPricipaleService = magazzinoPrincipServiceService.getMagazzinoPrincipaleServiceServicePort();
		
		VerificaMontaggio verificaMontaggioRequest = new VerificaMontaggio();
		
		boolean montaggioOk; 
		
		if (json.hasProp("montaggio")) {
			
			verificaMontaggioRequest.setMontaggio(json.prop("montaggio").stringValue());
			VerificaMontaggioResponse verificaMontaggioResponse = magazzinoPricipaleService.verificaMontaggio(verificaMontaggioRequest);
			montaggioOk = verificaMontaggioResponse.isDaMontare();
			
		} else {
			montaggioOk = false;
		}
		
		execution.setVariable("montaggioOk", montaggioOk );

	}

}
