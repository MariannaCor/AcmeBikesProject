package org.acme.acme_project.services;


import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ImpostaSogliaSconto implements JavaDelegate {

	private double min = 20, max = 100;
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {

		
		/* Inizializza variabile applicaSconto a false. Se lo sconto verrà applicato la variabile sarà sovrascritta*/
		execution.setVariable("applicaSconto", false );
		
		double soglia = (Math.random() * ((max - min) + 1)) + min ;
		
		execution.setVariable("scontoSoglia", soglia );
	}

}
