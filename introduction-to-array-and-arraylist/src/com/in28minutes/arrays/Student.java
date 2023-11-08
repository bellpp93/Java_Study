package com.in28minutes.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int... marks) {
		this.name = name;
		
		for (int mark: marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximumMark() {
//		int maximum = Integer.MIN_VALUE; // ex) 95, 98, 10
//		for (int mark : marks) {
//			if (mark > maximum) {
//				maximum = mark;
//			}
//		}
//		return maximum;
		// ArrayList기반으로 수정 후 Collections사용(최댓값 출력)
		return Collections.max(marks);
	}

	public int getMinimumMark() {
//		int minimum = Integer.MAX_VALUE; // ex) 95, 98, 10
//		for (int mark : marks) {
//			if (mark < minimum) {
//				minimum = mark;
//			}
//		}
//		return minimum;
		// ArrayList기반으로 수정 후 Collections사용(최솟값 출력)
		return Collections.min(marks);
	}

	public BigDecimal getAverageMarks() {
		// sum
		int sum = getTotalSumOfMarks();
		// total
		int number = getNumberOfMarks();
		
//		return new BigDecimal(sum/number); // 이렇게 하면 정수 연산이므로 소수점 미표시
		/*
		 * 98.66666666666666... Precision (3) > 98.667 [자리수 지정]
		 * 98.6665 Precision(3) Rounding mode(UP) [반올림 여부 지정]
		 */
		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}
	
	public String toString() {
		return name + marks;
	}

	public void addNewMark(int mark) {
		marks.add(mark);
	}

	public void removeMarkAtIndex(int index) {
		marks.remove(index);
	}
}
