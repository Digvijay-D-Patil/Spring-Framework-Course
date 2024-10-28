package com.spring_3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring_3/spring_config.xml");
		Student student = (Student) context.getBean("student");

		System.out.println(student);

	}

}
