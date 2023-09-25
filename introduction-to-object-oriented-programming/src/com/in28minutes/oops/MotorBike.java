package com.in28minutes.oops;

public class MotorBike {

	/* method생성
	   ※메서드는 (입력, 출력, 명칭) 세가지가 필요
	   inputs → int speed
	   outputs → void
	   name → setSpeed */
	
	// state
	private int speed; // member variable(멤버 변수)
	
	// behaviour
//	void setSpeed(int speed) { // local variable(지역 변수)
//		this.speed = speed;
//		System.out.println(speed); // 지역 변수의 speed를 출력
//		System.out.println(this.speed); // 멤버 변수의 speed를 출력
//	}

	// Source - Getter, Setter 자동 코드생성
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}
	
	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}

	void start() {
		System.out.println("Bike Started");
	}
}
