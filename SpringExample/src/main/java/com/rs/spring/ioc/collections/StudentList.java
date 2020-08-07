package com.rs.spring.ioc.collections;

import java.util.List;

public class StudentList {

	private int id;

	private String name;

	private List studentData;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStudentData(List studentData) {
		this.studentData = studentData;
	}

	public void show() {
		System.out.println("id:" + id);
		System.out.println("name:" + name);
		System.out.println("studentData:" + studentData);
	}

}
