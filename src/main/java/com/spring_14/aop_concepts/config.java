package com.spring_14.aop_concepts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.spring_14.aop_concepts")
@EnableAspectJAutoProxy
public class config {

	@Bean(name = "paymentServiceImpObj")
	public PaymentService_Impl paymentService_Impl() {
		return new PaymentService_Impl();
	}

	@Bean
	public MyAspect myAspect() {
		return new MyAspect();
	}

}
