package com.rs.spring.ioc.dependency;

public class Travel {
	
	private Vehicle vehicle;

	public void setV(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	   
	public void startJourney() {
		System.out.println("Journey has been started");
		vehicle.move();
	}

}
