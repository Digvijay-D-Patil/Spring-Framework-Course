package com.spring_7.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring_7/sterotype/spring_config.xml");

		Employee e1 = (Employee) context.getBean("empObj");
		System.out.println(e1);

		Employee e2 = (Employee) context.getBean("empObj");
		System.out.println("e1 object hashcode " + e1.hashCode());
		System.out.println("e2 object hashcode " + e2.hashCode());

	}

}
