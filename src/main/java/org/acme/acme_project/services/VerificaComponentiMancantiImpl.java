package org.acme.acme_project.services;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.spin.json.SpinJsonNode;

import static org.camunda.spin.DataFormats.json;
import static org.camunda.spin.Spin.S;
import java.util.ArrayList;

public class VerificaComponentiMancantiImpl implements JavaDelegate {

	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
	
		ArrayList<String> listaTmp = (ArrayList<String>) execution.getVariable("listaComponentiMancanti");
		
		if(listaTmp.isEmpty())
			execution.setVariable("compMancantiOk", false);
		else
			execution.setVariable("compMancantiOk", true);

	}

}
