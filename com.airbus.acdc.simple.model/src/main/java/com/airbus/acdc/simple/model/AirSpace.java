/**
 * 
 */
package com.airbus.acdc.simple.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 */
@XmlRootElement
public class AirSpace {
	
	private String name;
	
	public AirSpace(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}
