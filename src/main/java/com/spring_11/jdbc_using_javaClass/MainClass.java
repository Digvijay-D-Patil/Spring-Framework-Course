package com.spring_11.jdbc_using_javaClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(jdbcConfig.class);
		JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplateObj");

	}

}
