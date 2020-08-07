package com.rs.spring.ioc.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMapMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module-collections.xml");

		StudentMap student = (StudentMap) context.getBean("studentMap");
		student.show();
		
	}

}
