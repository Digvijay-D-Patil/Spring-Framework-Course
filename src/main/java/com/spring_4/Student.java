package com.spring_4;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private int id;
	String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	// -------------- Life cycle using XML file ------------------

//	public void init() {
//		System.out.println("init method called from xml");
//	}
//
//	@Override
//	public void destroy() {
//		System.out.println("destroy method called from xml");
//	}

	// ----------- Life cycle using interfaces (implements InitializingBean,
	// DisposableBean) ---------------

//	@Override
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("init method called from interface");
//	}
//
//	@Override
//	public void destroy() throws Exception {
//		System.out.println("destroy method called from interface");
//	}

	// -------------- Life cycle using annotations ------------------

	@PostConstruct
	public void init() {
		System.out.println("init method called from annotation");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy method called from annotation");
	}

}
