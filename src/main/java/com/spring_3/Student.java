package com.spring_3;

public class Student {

	private int id;
	private String name;
	private String school_fees;
	private Address address;

	public Student(int id, String name, String school_fees, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.school_fees = school_fees;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", school_fees=" + school_fees + ", address=" + address + "]";
	}

}
