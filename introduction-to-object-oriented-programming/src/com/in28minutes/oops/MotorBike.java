package com.in28minutes.oops;

public class MotorBike {

	// state
	private int setSpeed; // member variable
	
	//behaviour
	//method
	//inputs - int speed
	//outputs - void
	//name - setSpeed
	void setSpeed(int speed) { // local variable
		this.setSpeed = speed;
//		System.out.println(speed);
//		System.out.println(this.speed);
	}
	
	void start() {
		System.out.println("Bike Started");
	}
}
