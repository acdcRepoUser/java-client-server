/**
 * 
 */
package com.airbus.acdc.simple.desktop.client;

import java.net.URI;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

import com.airbus.acdc.simple.model.AirSpace;

/**
 *
 */
public class SimpleApp {
	
	public static void main(String[] args) {
		ClientConfig config = new ClientConfig();
		
		Client client = ClientBuilder.newClient(config);
		WebTarget service = client.target(getBaseURI());
		
		AirSpace airSpace2 = new AirSpace("blub");
		
		Response addResponse = service.path("rest").path("demo").request(MediaType.APPLICATION_JSON_TYPE).put(Entity.entity(airSpace2, MediaType.APPLICATION_JSON_TYPE), Response.class);
		System.out.println( addResponse.getStatusInfo() );
		
		Response response = service.path("rest").path("demo").request(MediaType.APPLICATION_JSON).get(Response.class);
		List<AirSpace> list = response.readEntity(new GenericType<List<AirSpace>>(){});
		
		for (AirSpace airSpace : list) {
			System.out.println(airSpace);
		}
		
	}
	
	private static URI getBaseURI() {
		return UriBuilder.fromUri("http://localhost:8080/com.airbus.acdc.simple.rest.service").build();
	}

}
