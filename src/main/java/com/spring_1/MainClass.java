package com.spring_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		// ---------------- Tightly coupled 👇 ------------------

//		Ram ram = new Ram();
//		ram.eat();
//		ram.sleep();
//
//		Shyam shyam = new Shyam();
//		shyam.eat();
//		shyam.sleep();

		// ------------------ Loose coupled 👇 -----------------------

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring_1/spring_config.xml");

		Ram ram = (Ram) context.getBean("ramClass");
		ram.eat();
		ram.sleep();

		Shyam shyam = (Shyam) context.getBean("shyamClass");
		shyam.eat();
		shyam.sleep();

	}

}
