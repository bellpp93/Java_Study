package com.in28minutes.firstjavaproject;

public class LeapYearChecker {

	public boolean isLeapYear(int year) {
		// 주어진 연도가 1보다 작은지 검사, 1보다 작다면 유효한 연도가 아니므로 false 리턴
		if (year < 1) {
			return false;
		}
		// 2041 - No
		// 연도가 4로 나누어 떨어지는지 검사, 그렇지 않다면 false를 리턴
		if (year % 4 != 0) {
			return false;
		}
		// 2048 - Yes
		// 연도가 100으로 나누어 떨어지지 않는지 검사, 그렇지 않다면 true를 리턴
		if (year % 100 != 0) {
			return true;
		}
		// 연도가 400으로 나누어 떨어지지 않는지 검사, 그렇지 않다면 false를 리턴
		if (year % 400 != 0) {
			// 2000, 2400 - Yes
			return false;
		}
		// 위의 조건 중에 충족된 조건이 없다면 그 연도는 윤년이므로 true를 리턴
		return true;
	}
}
