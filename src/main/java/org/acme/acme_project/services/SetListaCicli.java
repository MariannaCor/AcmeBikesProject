package org.acme.acme_project.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.variable.Variables;
import org.camunda.bpm.engine.variable.value.ObjectValue;
import org.camunda.spin.SpinList;
import org.camunda.spin.json.SpinJsonNode;

import static org.camunda.spin.Spin.*;

public class SetListaCicli implements ExecutionListener {

	@Override
	public void notify(DelegateExecution exec) throws Exception {
	
		//Lista cicli
		File f = new File("C:/Users/tearl/Dropbox/INGEGNERIA_DEL_SOFTWARE/src/MagazzinoPrincipale/cicli.json");
		FileInputStream fis = new FileInputStream(f);
		InputStreamReader reader = new InputStreamReader(fis, "utf-8");
		SpinJsonNode json = JSON(reader);		
		SpinJsonNode cicliProp = json.prop("listaCicli");
		SpinList listaCicli = cicliProp.elements();
		
		ObjectValue typedListaCicli =
				  Variables.objectValue(listaCicli).serializationDataFormat("application/json").create();
		
		//Lista componenti mancanti
		ArrayList<String> listaCM = new ArrayList<>();
		
		exec.setVariable("listaComponentiMancanti", listaCM );
		exec.setVariable("listaCicli", typedListaCicli );
	}

}
