/**
 * 
 */
package com.airbus.acdc.simple.rest.service;

import java.util.ArrayList;
import java.util.List;

import com.airbus.acdc.simple.model.AirSpace;

/**
 *
 */
public class Storage {
	
	private static final Storage INSTANCE = new Storage();
	
	private List<AirSpace> airSpaces = new ArrayList<>();
	
	private Storage() {
		airSpaces.add(new AirSpace("Hier nix rein"));
	}
	
	public List<AirSpace> getAirSpaces() {
		return airSpaces;
	}
	
	public void add(AirSpace airSpace) {
		airSpaces.add(airSpace);
	}
	
	public static Storage getInstance() {
		return INSTANCE;
	}
	
}
