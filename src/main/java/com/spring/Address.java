package com.spring;

public class Address {

	public String offNu,street,state;

	public Address() {
		super();
		
	}
	public Address(String offNu, String street, String state) {
		super();
		this.offNu = offNu;
		this.street = street;
		this.state = state;
	}
//
	public String getOffNu() {
		return offNu;
	}

	public void setOffNu(String offNu) {
		this.offNu = offNu;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
}
