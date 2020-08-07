package com.rs.spring.autowiring.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module-autowiring.xml");

		Categories categories = (Categories) context.getBean("categories2");
		categories.show();
		
	}

}
