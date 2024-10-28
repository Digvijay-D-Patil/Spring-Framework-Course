package com.spring_3;

public class Address {

	private int id;
	private String address;
	private String city;
	private String state;

	public Address(int id, String address, String city, String state) {
		super();
		this.id = id;
		this.address = address;
		this.city = city;
		this.state = state;
	}

	@Override
	public String toString() {
		return city;
	}

}
