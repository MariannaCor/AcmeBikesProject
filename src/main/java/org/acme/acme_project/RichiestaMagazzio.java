package org.acme.acme_project;

import static org.camunda.spin.DataFormats.json;
import static org.camunda.spin.Spin.S;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.spin.json.SpinJsonNode;

public class RichiestaMagazzio implements JavaDelegate {

	String magazzinoEsterno;
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {

		sendPost();
		
		execution.setVariable("magazzinoEsternoScelto", magazzinoEsterno );

		execution.getProcessEngineServices().getRuntimeService().createMessageCorrelation("richiestaMagazzinoRec")
				.correlate();
	}
	
	private void sendPost() throws Exception {

		HttpPost post = new HttpPost("http://localhost:3001/mapService");

		List<NameValuePair> urlParameters = new ArrayList<>();
		//TODO: mettere indirizzo cliente dinamico 
		urlParameters.add(new BasicNameValuePair("address", "Via Paolo Sarpi, 10, Milan, Metropolitan City of Milan, Italy"));

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
			
			magazzinoEsterno = json.prop("indMagazzino").stringValue();
		}

	}

}
