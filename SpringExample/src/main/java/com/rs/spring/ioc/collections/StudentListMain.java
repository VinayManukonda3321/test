package com.rs.spring.ioc.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentListMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module-collections.xml");

		StudentList student = (StudentList) context.getBean("studentList");
		student.show();
		
	}

}
