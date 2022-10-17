package com.spring;

public class Office {
	private String oName;
	private int floor;
	private Address address;//dependent object
	
	public Office(Address address) {
		this.address=address;
		
	}
	
	public String getoName() {
		return oName;
	}
	public void setoName(String oName) {
		this.oName = oName;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
