package com.spring_10.jdbc;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class MainClass {

	public static void main(String[] args) throws SQLException {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring_10/jdbc/jdbcConfig.xml");
		JdbcTemplate jd = (JdbcTemplate) context.getBean("jdbcTemplate");

//		Student_Implementation.insertData(jd);
//		Student_Implementation.deleteData(jd);
//		Student_Implementation.updateData(jd);
//		Student_Implementation.displayPerticularData(jd);
		Student_Implementation.displayAllData(jd);

	}

}
