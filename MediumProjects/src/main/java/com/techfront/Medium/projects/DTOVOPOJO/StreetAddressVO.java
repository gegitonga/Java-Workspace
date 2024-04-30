package com.techfront.Medium.projects.DTOVOPOJO;

import java.util.Objects;

public class StreetAddressVO {
	public final String street;
	public final String city;
	public final Long zipcode;
	
	public StreetAddressVO(String street,String city,Long zipcode ){
		this.street = street;
		this.city = city;
		this.zipcode = zipcode;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(o == null || getClass() != o.getClass())
			return false;
		StreetAddressVO that = (StreetAddressVO) o;
		return Objects.equals(street, that.street) && Objects.equals(city, that.city) && Objects.equals(zipcode, that.zipcode);
					
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(street,city,zipcode);
	}
	
//	public record StreetAddressVO(String street, String city, Long zipcode) {}
}
