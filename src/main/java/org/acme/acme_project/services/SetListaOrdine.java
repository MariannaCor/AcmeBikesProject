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

public class SetListaOrdine implements ExecutionListener {

	@Override
	public void notify(DelegateExecution exec) throws Exception {
	
		File f = new File("C:/Users/tearl/Dropbox/INGEGNERIA_DEL_SOFTWARE/src/MagazzinoPrincipale/ordine.json");
		FileInputStream fis = new FileInputStream(f);
		InputStreamReader reader = new InputStreamReader(fis, "utf-8");
		SpinJsonNode json = JSON(reader);		
		SpinJsonNode ordineProp = json.prop("ordine");
		SpinList listaOrdine = ordineProp.elements();
		
		ObjectValue lista =
				  Variables.objectValue(listaOrdine).serializationDataFormat("application/json").create();
		
		exec.setVariable("listaOrdine", lista );
	}

}
