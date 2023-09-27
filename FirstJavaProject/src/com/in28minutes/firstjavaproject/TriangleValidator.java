package com.in28minutes.firstjavaproject;

public class TriangleValidator {
	
	// Case 1
//	public boolean isValidTriagle(int angle1, int angle2, int angle3) {
//	
//		if (angle1 <= 0 || angle2 <= 0 || angle3 <= 0) {
//			return false;
//		}
//		int sumOfAngles = angle1 + angle2 + angle3;
//		boolean isSumOfAngles180 = sumOfAngles == 180;
//		return isSumOfAngles180;
//	}
	
	// Case 2
	public boolean isValidTriagle(int angle1, int angle2, int angle3) {
		
		if (angle1 <= 0 || angle2 <= 0 || angle3 <= 0) {
			return false;
		}
		int sumOfAngles = angle1 + angle2 + angle3;
		return sumOfAngles == 180;
	}
}
