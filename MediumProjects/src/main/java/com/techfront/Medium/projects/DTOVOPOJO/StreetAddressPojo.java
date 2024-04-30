package com.techfront.Medium.projects.DTOVOPOJO;

public class StreetAddressPojo {
	public String street;
	public String city;
	public Long zipcode;
	
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
