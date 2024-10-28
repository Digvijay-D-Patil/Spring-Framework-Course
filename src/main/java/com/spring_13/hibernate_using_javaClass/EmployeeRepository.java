package com.spring_13.hibernate_using_javaClass;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class EmployeeRepository {

	@Autowired
	private SessionFactory sessionFactory;

	public void save(Employee employee) {
		sessionFactory.getCurrentSession().save(employee);
	}

	public Employee findById(Long id) {
		return sessionFactory.getCurrentSession().get(Employee.class, id);
	}

	public List<Employee> findAll() {
		return sessionFactory.getCurrentSession().createQuery("from Employee", Employee.class).list();
	}
}
