package com.rs.spring.ioc.dependency;

public class Bus {

	private int maxSpeed;

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void move() {
		System.out.println("maxSpeed" + maxSpeed);
		System.out.println("Car has started...");
	}

}
