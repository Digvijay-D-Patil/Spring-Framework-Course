package com.spring_14.aop_concepts;

import org.springframework.stereotype.Component;

@Component
public class PaymentService_Impl {

	public void makePayment(int num) {

		System.out.println(num + " Amount debited..");

		System.out.println(num + " Amount credited..");

	}

}
