package com.spring_13.hibernate_using_javaClass;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
		EmployeeRepository employeeRepo = context.getBean(EmployeeRepository.class);

		// Create and save a new employee

		Employee employee = new Employee();
		employee.setName("John Doe");
		employee.setDepartment("Engineering");
		employeeRepo.save(employee);

		// Retrieve and print all employees

		System.out.println("Employees:");
		List<Employee> empList = employeeRepo.findAll();

		for (Employee emp : empList) {
			System.out.println(emp.getId() + ": " + emp.getName() + " - " + emp.getDepartment());
		}
	}
}
