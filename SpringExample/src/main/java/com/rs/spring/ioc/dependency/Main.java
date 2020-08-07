package com.rs.spring.ioc.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rs.spring.ioc.ex.User;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context1 = new ClassPathXmlApplicationContext("Spring-Module1.xml");
		Bus bus= (Bus) context1.getBean("bus");
		
		ApplicationContext context2 = new ClassPathXmlApplicationContext("Spring-Module2.xml");
		Travel travel=(Travel) context2.getBean("travel");
		
		
	}

}


