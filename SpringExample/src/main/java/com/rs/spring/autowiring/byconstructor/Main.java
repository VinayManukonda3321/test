package com.rs.spring.autowiring.byconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module-autowiring.xml");

		Categories categories = (Categories) context.getBean("categories3");
		categories.show();
		
	}

}
