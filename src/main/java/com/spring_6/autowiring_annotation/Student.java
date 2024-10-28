package com.spring_6.autowiring_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	private int id;

	@Autowired
	@Qualifier("addressObj2")
	private Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

//	@Autowired
	public void setAddress(Address address) {
		System.out.println("Setter injection");
		this.address = address;
	}

	@Override
	public String toString() {
		return "id=" + id + ", address=" + address;
	}

}
