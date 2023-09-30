package com.in28minutes.loops;

public class MyNumberRunner {

	public static void main(String[] args) {

		MyNumber number = new MyNumber(4);
		boolean isPrime = number.isPrime();
		System.out.println("isPrime " + isPrime);
	}
}
