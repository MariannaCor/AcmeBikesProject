package org.acme.acme_project.services;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.spin.json.SpinJsonNode;
import static org.camunda.spin.DataFormats.json;
import static org.camunda.spin.Spin.S;
import org.aceme.acme_project.services.magazzinoPrincipale.generated.* ;

public class VerificaDispComponentiMancanti implements JavaDelegate {

	
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
	
		String codiceComponente = execution.getVariable("codiceComponente").toString();
		
		MagazzinoPrincipaleServiceService magazzinoPrincipServiceService = new MagazzinoPrincipaleServiceService();
		MagazzinoPrincipaleService magazzinoPricipaleService = magazzinoPrincipServiceService.getMagazzinoPrincipaleServiceServicePort();
		
		VerificaComponentiMancantiCicli verificaComponentiMancantiCicliRequest = new VerificaComponentiMancantiCicli();
		verificaComponentiMancantiCicliRequest.setCodiceComponente(codiceComponente);
		VerificaComponentiMancantiCicliResponse verificaComponentiMancantiCicliResponse = magazzinoPricipaleService.verificaComponentiMancantiCicli(verificaComponentiMancantiCicliRequest);
			
		boolean componenteDisponibile = verificaComponentiMancantiCicliResponse.isVerificaComponente();
		String magazzino = verificaComponentiMancantiCicliResponse.getMagazzino();	
				
		execution.setVariable("componenteDisponibile", componenteDisponibile );
		execution.setVariable("magazzinoComponente", magazzino );
	}

}
