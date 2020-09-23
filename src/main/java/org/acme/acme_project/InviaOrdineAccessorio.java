package org.acme.acme_project;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.variable.value.ObjectValue;
import org.camunda.spin.json.SpinJsonNode;

import static org.camunda.spin.DataFormats.json;
import static org.camunda.spin.Spin.S;

import org.aceme.acme_project.services.magazzinoEsterno.generated.* ;
public class InviaOrdineAccessorio implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		String accessorioJson = execution.getVariable("accessorio").toString();
		SpinJsonNode json = S(accessorioJson, json());

		MagazzinoEsternoServiceService magazzinoEsternoServiceService = new MagazzinoEsternoServiceService();
		MagazzinoEsternoService magazzinoEsternoService = magazzinoEsternoServiceService.getMagazzinoEsternoServiceServicePort();
		
		OrdineComponenteAccessori ordineComponenteAccessoriRequest = new OrdineComponenteAccessori();

		if (json.hasProp("codice")) {
			
			ordineComponenteAccessoriRequest.setAccessorio(accessorioJson);
			ordineComponenteAccessoriRequest.setIndirizzoMagazzino(execution.getVariable("magazzinoAccessorio").toString());
			magazzinoEsternoService.ordineComponenteAccessori(ordineComponenteAccessoriRequest);
		
		}
		
		
		execution.getProcessEngineServices().getRuntimeService()
		.createMessageCorrelation("InviaOrdineAccessorioRec")
		.correlate();
		
	}
}
