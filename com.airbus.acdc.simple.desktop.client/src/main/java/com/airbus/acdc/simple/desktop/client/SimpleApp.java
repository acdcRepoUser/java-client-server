/**
 * 
 */
package com.airbus.acdc.simple.desktop.client;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

/**
 *
 */
public class SimpleApp {
	
	public static void main(String[] args) {
		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);
		WebTarget service = client.target(getBaseURI());

		String string = service.path("rest").path("demo").request(MediaType.APPLICATION_JSON).get(String.class);
		System.out.println(string);
	}
	
	private static URI getBaseURI() {
		return UriBuilder.fromUri("http://localhost:8080/com.airbus.acdc.simple.rest.service").build();
	}

}
