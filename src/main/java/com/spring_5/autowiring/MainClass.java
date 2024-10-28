package com.spring_5.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring_5/autowiring/spring_config.xml");

		Student student = (Student) context.getBean("studentObj");

		System.out.println(student);

	}

}
