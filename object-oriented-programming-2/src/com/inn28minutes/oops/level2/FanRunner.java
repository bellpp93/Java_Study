package com.inn28minutes.oops.level2;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Manufacturer 1", 0.34567, "GREEN");
//		fan.isOn(true);
		fan.switchOn();
		System.out.println(fan); // isOn - true, speed - 5
		fan.setSpeed((byte)3);
		System.out.println(fan); // isOn - true, speed - 3
		fan.switchOff();
		System.out.println(fan); // isOn - false, speed - 0
	}
}