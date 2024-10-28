package com.spring_14.aop_concepts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		PaymentService_Impl psi = (PaymentService_Impl) context.getBean("paymentServiceImpObj");

		// print before makePayment() using AOP
		psi.makePayment(500);
		// print after makePayment() using AOP

	}

}
