package com.rs.spring.ioc.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.common.HelloWorld;

public class StudentSetMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module-collections.xml");

		StudentSet student = (StudentSet) context.getBean("studentSet");
		student.show();
		
	}
}
