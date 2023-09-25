package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {

		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();
		
		ducati.start();
		honda.start();
		
		ducati.setSpeed(100);
		
		ducati.increaseSpeed(100);
		honda.increaseSpeed(100);
		
		ducati.decreaseSpeed(250);
		honda.decreaseSpeed(250);
		
//		int ducatiSpeed = ducati.getSpeed(); // get ducati speed
//		ducatiSpeed += 100; // increase it by 100
//		ducati.setSpeed(ducatiSpeed); // set it to ducati
//
//		int hondaSpeed = honda.getSpeed(); // get honda speed
//		hondaSpeed += 100; // increase it by 100
//		honda.setSpeed(hondaSpeed); // set it to honda
		
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
	}
}
