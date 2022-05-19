package com.mindgate.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("address")
@Scope("prototype")
public class Address {
	private int addressId;
	private String street;
	private String city;
	private String state;

	public Address() {
		System.out.println("Default constructor of Address called");
	}

	public Address(int addressId, String street, String city, String state) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.state = state;
		System.out.println("Overloaded constructor of Address called");
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
		System.out.println("Setting AddressId :" + addressId);
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
		System.out.println("Setting street :" +street);
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
		System.out.println("Setting city" +city);
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("Setting State :"+state);
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}

}
