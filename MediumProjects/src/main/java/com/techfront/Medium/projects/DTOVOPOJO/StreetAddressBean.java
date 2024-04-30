package com.techfront.Medium.projects.DTOVOPOJO;

import java.io.Serializable;

public class StreetAddressBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3277484128392394140L;
	private String street;
	private String city;
	private Long zipcode;
	
	public StreetAddressBean() {}
	
	public String getFullAddress() {
		return "" + street + city + zipcode;
	}
	
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public Long getZipcode() {
		return zipcode;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}
}
