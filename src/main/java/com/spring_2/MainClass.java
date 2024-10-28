package com.spring_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring_2/spring_config.xml");
		Student student = (Student) context.getBean("student");

		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getSchool_fees());
		System.out.println(student.getAddress().getCity());

	}

}
