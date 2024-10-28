package com.spring_8.expression_language;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("studObj")
public class Student {

	@Value("#{2+3}")
	public int sum;

	@Value("#{5-3}")
	public int sub;

	@Value("#{2*3}")
	public int mul;

	@Value("#{10/3}")
	public int div;

	@Value("#{1 == 1}")
	public boolean equalValid;

	@Value("#{1==1 && 2==3}")
	public boolean checkStatus;

	@Value("#{5>3 ? 'Yes':'No'}")
	public String terinaryCheck;

	@Value("#{T(java.lang.Math).sqrt(144)}")
	public int num;

	public static String call() {
		return "Method calling";
	}

	@Value("#{T(com.spring_8.expression_language.Student).call()}")
	public String result;

}
