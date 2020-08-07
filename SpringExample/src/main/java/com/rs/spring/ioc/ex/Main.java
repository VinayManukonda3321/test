package com.rs.spring.ioc.ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.common.HelloWorld;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");

		User user = (User) context.getBean("user");

		System.out.println(user.hashCode());
		user.printUser();

		user = (User) context.getBean("user");

		System.out.println(user.hashCode());
		user.printUser();

	}
}
