package com.spring_12.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring_12/hibernate/hibernateConfig.xml");

		HibernateTemplate hTemplate = (HibernateTemplate) context.getBean("hibernateTemplate");

		System.out.println(hTemplate);

	}

}
