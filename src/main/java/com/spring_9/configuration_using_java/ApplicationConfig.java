package com.spring_9.configuration_using_java;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring_9.configuration_using_java")
public class ApplicationConfig {

	@Bean(name = "addressObj")
	public Address address() {
		return new Address();
	}

	@Bean(name = "empObj")
	public Employee employee() {
		return new Employee();
	}

	// -------------------------------------

	@Bean
	public List<String> countryList() {
		List<String> list = new ArrayList<>();
		list.add("India");
		list.add("USA");
		return list;
	}

}
