package com.spring_8.expression_language;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring_8/expression_language/spring_config.xml");

		Student student = (Student) context.getBean("studObj");

		System.out.println("Addition: " + student.sum);
		System.out.println("Substraction: " + student.sub);
		System.out.println("Multiplication: " + student.mul);
		System.out.println("Division: " + student.div);

		System.out.println("Boolean: " + student.equalValid);
		System.out.println("Boolean: " + student.checkStatus);
		System.out.println("Ternary : " + student.terinaryCheck);
		System.out.println("Square root : " + student.num);

		System.out.println("calling : " + student.result);
	}

}
