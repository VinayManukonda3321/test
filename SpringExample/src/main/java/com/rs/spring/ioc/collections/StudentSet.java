package com.rs.spring.ioc.collections;

import java.util.Set;

public class StudentSet {

	private int id;

	private String name;

	private Set studentData;

	public void setStudentData(Set studentData) {
		this.studentData = studentData;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void show() {
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("studentData:"+studentData);
	}

}
