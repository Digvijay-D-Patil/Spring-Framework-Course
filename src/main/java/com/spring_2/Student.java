package com.spring_2;

public class Student {

	private int id;
	private String name;
	private String school_fees;
	private Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchool_fees() {
		return school_fees;
	}

	public void setSchool_fees(String school_fees) {
		this.school_fees = school_fees;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
