package com.spring_9.configuration_using_java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		Employee employee = (Employee) context.getBean("empObj");
		System.out.println(employee);

	}

}
