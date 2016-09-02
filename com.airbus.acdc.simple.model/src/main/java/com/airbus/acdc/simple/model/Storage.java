/**
 * 
 */
package com.airbus.acdc.simple.model;

import java.util.ArrayList;
import java.util.List;

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
	
	public static Storage getInstance() {
		return INSTANCE;
	}
	
}
