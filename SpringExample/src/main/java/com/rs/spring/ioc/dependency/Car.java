package com.rs.spring.ioc.dependency;

public class Car {

	private String fuelType;
	private int maxSpeed;

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public void move() {
		System.out.println("fuelType:" + fuelType);
		System.out.println("maxSpeed" + maxSpeed);
		System.out.println("Car has started...");
	}

}
