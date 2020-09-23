package org.acme.acme_project.services;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.spin.json.SpinJsonNode;
import org.aceme.acme_project.services.magazzinoPrincipale.generated.* ;

import static org.camunda.spin.DataFormats.json;
import static org.camunda.spin.Spin.S;


public class VerificaDispAccessoriImpl implements JavaDelegate {

	
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		boolean accessorioPresente ;
		String accessorio = execution.getVariable("accessorio").toString();
		SpinJsonNode json = S(accessorio, json());
		
		if(json.hasProp("codice")){
			MagazzinoPrincipaleServiceService magazzinoPrincipServiceService = new MagazzinoPrincipaleServiceService();
			MagazzinoPrincipaleService magazzinoPricipaleService = magazzinoPrincipServiceService.getMagazzinoPrincipaleServiceServicePort();
			
			VerificaComponentiAccessori verificaComponentiAccessoriRequest = new VerificaComponentiAccessori();
			verificaComponentiAccessoriRequest.setCodiceComponente(json.prop("codice").stringValue());
			VerificaComponentiAccessoriResponse verificaComponentiAccessoriResponse = magazzinoPricipaleService.verificaComponentiAccessori(verificaComponentiAccessoriRequest);
			
			accessorioPresente = verificaComponentiAccessoriResponse.isVerificaComponente();
			
			String magazzino = verificaComponentiAccessoriResponse.getMagazzino();
			execution.setVariable("magazzinoAccessorio", magazzino );
			
		} else {
			accessorioPresente = false;
		}
				
		execution.setVariable("accessorioPresente", accessorioPresente );

	}

}
