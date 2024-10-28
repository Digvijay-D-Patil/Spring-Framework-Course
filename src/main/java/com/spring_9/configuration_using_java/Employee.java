package com.spring_9.configuration_using_java;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Value("101")
	private int id;

	@Value("Rohit")
	private String name;

	@Value("#{countryList}")
	private List<String> countryList = new ArrayList<>();

//	@Value("#{addressObj}")
	@Autowired
	Address address;

	// -------------------------------

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

	public List<String> getCountryList() {
		return countryList;
	}

	public void setCountryList(List<String> countryList) {
		this.countryList = countryList;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	// -------------------------------

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", countryList=" + countryList + ", address=" + address + "]";
	}

}
