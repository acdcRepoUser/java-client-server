package com.airbus.acdc.simple.rest.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.airbus.acdc.simple.model.AirSpace;

@Path("/demo")
public class Demo {

	// This method is called if TEXT_PLAIN is request
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllAirSpaces() {
		List<AirSpace> airSpaces = Storage.getInstance().getAirSpaces();
		GenericEntity<List<AirSpace>> generic = new GenericEntity<List<AirSpace>>(airSpaces){};
        return Response.accepted(generic).build();
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addAirSpace(AirSpace newAirSpace) {
		Storage.getInstance().add(newAirSpace);
		return Response.accepted().build();
	}

//	// This method is called if XML is request
//	@GET
//	@Produces(MediaType.TEXT_XML)
//	public String sayXMLHello() {
//		return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
//	}
//
	// This method is called if HTML is request
//	@GET
//	@Produces(MediaType.TEXT_HTML)
//	public String sayHtmlHello() {
//		
//		List<AirSpace> airSpaces = Storage.getInstance().getAirSpaces();
//		String list = "";
//		for (AirSpace airSpace : airSpaces) {
//			list += "<li>"+ airSpace.getName() +"</li>";
//		}
//		
//		return "<html> " + "<title>" + "All Airspaces" + "</title>" 
//					+ "<body><h1>" + list + "</body></h1>"
//				+ "</html> ";
//	}

}