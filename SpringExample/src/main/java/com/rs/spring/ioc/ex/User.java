package com.rs.spring.ioc.ex;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class User implements BeanPostProcessor{

	private int id;

	private String name;

	private List<Integer> marks;

	private Address address;
	
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void printUser() {
		System.out.println(id + ", " + name + ", " + marks);
	
		if(address != null) {
			address.printAddress();
		}
	}
	
	void init() {
		System.out.println("init()");
	}

	void destroy() {
		System.out.println("destroy()");
	}

	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("After Inititaition");
		return null;
	}

	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("Before Inititaition");
		return null;
	}
}
