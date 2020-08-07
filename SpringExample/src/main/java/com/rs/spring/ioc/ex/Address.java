package com.rs.spring.ioc.ex;

public class Address {

	private int id;
	
	private String area;
	
	private int userId;
	
	Address(int id, String area, int userId) {
		this.id = id;
		this.area = area;
		this.userId = userId;
	}
	
	public void setArea(String area) {
		this.area = area;
	}
	
	public void printAddress() {
		System.out.println(id+", "+area+", "+userId);
	}
}
