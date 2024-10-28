package com.spring_4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring_4/spring_config.xml");
		Student student = (Student) context.getBean("studObj");

		System.out.println(student);

		context.registerShutdownHook();// destroy method called using this keyword & AbstractApplicationContext

	}

}
