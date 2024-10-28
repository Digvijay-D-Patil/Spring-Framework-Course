package com.spring_7.sterotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("empObj")
@Scope("prototype")
public class Employee {

	@Value("102")
	private int id;

	@Value("Riddhi")
	private String name;

	@Value("#{address}")
	private List<String> addressList;

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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", addressList=" + addressList + "]";
	}

}
