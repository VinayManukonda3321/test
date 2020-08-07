package com.rs.spring.ioc.ex;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main2 {
	public static void main(String[] args) {
		
		BeanFactory addressFactory = new XmlBeanFactory(new ClassPathResource("Spring-Module1.xml"));
		
		Resource resource = new ClassPathResource("Spring-Module.xml");
		
		BeanFactory factory = new XmlBeanFactory(resource, addressFactory);
		
		User user = (User) factory.getBean("user");

		System.out.println(user.hashCode());
		user.printUser();

		user = (User) factory.getBean("user");

		System.out.println(user.hashCode());
		user.printUser();

	}
}
