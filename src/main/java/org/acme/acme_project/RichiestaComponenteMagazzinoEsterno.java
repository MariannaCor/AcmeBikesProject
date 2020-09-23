package org.acme.acme_project;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.variable.value.ObjectValue;
import org.camunda.spin.json.SpinJsonNode;
import static org.camunda.spin.DataFormats.json;
import static org.camunda.spin.Spin.S;
import org.aceme.acme_project.services.magazzinoEsterno.generated.* ;


public class RichiestaComponenteMagazzinoEsterno implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {

		MagazzinoEsternoServiceService magazzinoEsternoServiceService = new MagazzinoEsternoServiceService();
		MagazzinoEsternoService magazzinoEsternoService = magazzinoEsternoServiceService.getMagazzinoEsternoServiceServicePort();
		
		OrdineComponenteCicli ordineComponenteCicliRequest = new OrdineComponenteCicli();

		ordineComponenteCicliRequest.setCodiceComponente(execution.getVariable("codiceComponente").toString());
		ordineComponenteCicliRequest.setIndirizzoMagazzino(execution.getVariable("magazzinoComponente").toString());
		magazzinoEsternoService.ordineComponenteCicli(ordineComponenteCicliRequest);
	
		
		execution.getProcessEngineServices().getRuntimeService()
		.createMessageCorrelation("RichiediComponenteRec")
		.correlate();
		
	}
}
