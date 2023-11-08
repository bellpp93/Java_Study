package com.in28minutes.arrays;

import java.util.Iterator;

public class StringRunner {

	public static void main(String[] args) {

		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday",
				"Wednesday", "Thursday", "Friday", "Saturday" };
		
		String dayWithMostCharacters = "";
		for (String day:daysOfWeek) {
			if (day.length() > dayWithMostCharacters.length()) {
				dayWithMostCharacters = day;
			}
		}
		
		System.out.println("Day with Most number of characters is " + dayWithMostCharacters);
		
		// 요일 순서대로 출력하기(일,월,화...)
//		for (int i = 0; i < daysOfWeek.length; i++) {
//			System.out.println(daysOfWeek[i]);
//		}
		
		// 요일 반대로 출력하기(토,금,목...)
		for (int i = daysOfWeek.length - 1; i >= 0; i--) {
			System.out.println(daysOfWeek[i]);
		}
	}

}
