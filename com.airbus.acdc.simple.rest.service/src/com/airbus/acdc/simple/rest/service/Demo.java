package com.airbus.acdc.simple.rest.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.airbus.acdc.simple.model.AirSpace;
import com.airbus.acdc.simple.model.Storage;

@Path("/demo")
public class Demo {

	// This method is called if TEXT_PLAIN is request
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<AirSpace> getAllAirSpaces() {
		return Storage.getInstance().getAirSpaces();
	}

//	// This method is called if XML is request
//	@GET
//	@Produces(MediaType.TEXT_XML)
//	public String sayXMLHello() {
//		return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
//	}
//
//	// This method is called if HTML is request
//	@GET
//	@Produces(MediaType.TEXT_HTML)
//	public String sayHtmlHello() {
//		return "<html> " + "<title>" + "Hello Jersey" + "</title>" + "<body><h1>" + "Hello Jersey" + "</body></h1>"
//				+ "</html> ";
//	}
	
	

}