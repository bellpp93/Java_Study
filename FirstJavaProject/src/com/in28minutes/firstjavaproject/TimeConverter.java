package com.in28minutes.firstjavaproject;

public class TimeConverter {
	
	public static int convertHoursToMinutes(int hours) {
		if (hours < 0)
			return -1;
		return hours * 60;
	}
	public static int convertDaysToMinutes(int days) {
		if (days < 0)
			return -1;
		return days * 24 * 60;
	}
}
