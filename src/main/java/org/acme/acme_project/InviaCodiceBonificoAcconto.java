package org.acme.acme_project;

import java.util.ArrayList;


import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import static org.camunda.spin.DataFormats.json;
import static org.camunda.spin.Spin.S;

import java.io.IOException;

import java.util.List;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.spin.json.SpinJsonNode;


public class InviaCodiceBonificoAcconto implements JavaDelegate {

	private int codiceBonifico; 
	private String totaleAcconto;
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		codiceBonifico = Integer.parseInt(execution.getVariable("codiceBonificoAcconto").toString());
		
		sendGet();

		execution.setVariable("totaleAcconto", totaleAcconto);
		
		execution.getProcessEngineServices().getRuntimeService().createMessageCorrelation("RichiestaInfoBonificoRec")
				.correlate();

	}

	private void sendGet() throws Exception {

		HttpGet get = new HttpGet("http://localhost:3000/transfer/"+codiceBonifico);

		CloseableHttpClient httpClient = null;
		String responseString = null;

		try {
			httpClient = HttpClients.createDefault();
			CloseableHttpResponse response = httpClient.execute(get);

			responseString = EntityUtils.toString(response.getEntity());

		} finally {
			httpClient.close();
		}

		if (responseString != null) {
			SpinJsonNode json = S(responseString, json());
			totaleAcconto = json.prop("TransferAmount").stringValue();
		}

	}

}
