package com.spring_6.autowiring_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring_6/autowiring_annotation/spring_config.xml");

		Student student = (Student) context.getBean("studentObj");

		System.out.println(student);

	}

}
