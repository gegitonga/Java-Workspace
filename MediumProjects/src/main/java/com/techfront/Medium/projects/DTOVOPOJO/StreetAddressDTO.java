package com.techfront.Medium.projects.DTOVOPOJO;

import com.techfront.Medium.projects.DTOVOPOJO.model.CountryCode;

public class StreetAddressDTO {
	private String street;
	private String city;
	private Long zipcode;
	
	private CountryCode countryCode;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public Long getZipcode() {
		return zipcode;
	}
	
	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}
	
	public CountryCode getCountryCode() {
		return countryCode;
	}
	
	public void setCountryCode(CountryCode countryCode) {
		this.countryCode = countryCode;
	}
}
