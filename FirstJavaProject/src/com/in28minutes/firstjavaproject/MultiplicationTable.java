package com.in28minutes.firstjavaproject;

public class MultiplicationTable {
	
	String rst = "%d * %d = %d";

	void print() {
//		for(int i = 1; i <= 10; i++) {
//			System.out.printf(rst, 5, i, 5 * i).println();
//		}
		print(5); // Code refactoring
	}
	
	void print(int table) {
//		for(int i = 1; i <= 10; i++) {
//			System.out.printf(rst, table, i, table * i).println();
//		}
		print(table, 1, 10); // Code refactoring
	}
	
	void print(int table, int from, int to) {
		for(int i = from; i <= to; i++) {
			System.out.printf(rst, table, i, table * i).println();
		}
	}
}
