package org.acme.acme_project;

import java.util.ArrayList;


import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
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


public class InviaAcconto implements JavaDelegate {

	private int insertedIdValue = -1;

	@Override
	public void execute(DelegateExecution execution) throws Exception {

		sendPost();

		execution.setVariable("codiceBonificoAcconto", insertedIdValue);
		
		execution.getProcessEngineServices().getRuntimeService().createMessageCorrelation("InviaAccontoRec")
				.correlate();

	}

	private void sendPost() throws Exception {

		HttpPost post = new HttpPost("http://localhost:3000/transfer");

		// TODO: rendere dinamici da form
		List<NameValuePair> urlParameters = new ArrayList<>();
		urlParameters.add(new BasicNameValuePair("receiver", "'AcmeBikes'"));
		urlParameters.add(new BasicNameValuePair("sender", "'rivendita'"));
		urlParameters.add(new BasicNameValuePair("transferAmount", "354"));

		post.setEntity(new UrlEncodedFormEntity(urlParameters));
		CloseableHttpClient httpClient = null;
		String responseString = null;

		try {
			httpClient = HttpClients.createDefault();
			CloseableHttpResponse response = httpClient.execute(post);

			responseString = EntityUtils.toString(response.getEntity());

		} finally {
			httpClient.close();
		}

		if (responseString != null) {
			String responseJson = responseString;
			SpinJsonNode json = S(responseJson, json());
			
			insertedIdValue = Integer.parseInt(json.prop("insertId").stringValue());

		}

	}

}
