package com.spring_14.aop_concepts;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

	@Before("execution(* com.spring_14.aop_concepts.PaymentService_Impl.makePayment(..))")
	public void printBefore() {
		System.out.println("Payment started!\n---------------");
	}

	@After("execution(* com.spring_14.aop_concepts.PaymentService_Impl.makePayment(..))")
	public void printAfter() {
		System.out.println("---------------\nPayment ended!");
	}

}
