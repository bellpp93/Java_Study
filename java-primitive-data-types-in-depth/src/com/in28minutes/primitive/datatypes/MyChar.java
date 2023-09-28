package com.in28minutes.primitive.datatypes;

public class MyChar {

	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		// Vowel and Capitals
		if (ch == 'a' || ch == 'A') {
			return true;
		}
		if (ch == 'e' || ch == 'E') {
			return true;
		}
		if (ch == 'i' || ch == 'I') {
			return true;
		}
		if (ch == 'o' || ch == 'O') {
			return true;
		}
		if (ch == 'u' || ch == 'U') {
			return true;
		}
		return false;
	}

	public boolean isDigit() {
		if (ch >= 48 && ch <=57) { // between '0' and '9'
			return true;
		}
		return false;
	}

	public boolean isAlphabet() {
		if (ch >= 97 && ch <= 122) { // between 'a' and 'z'
			return true;
		}
		if (ch >= 65 && ch <= 90) { // between 'A' and 'Z'
			return true;
		}
		return false;
	}

	public boolean isConsonant() {
		if (isAlphabet() && !isVowel()) { // Alphabet and Consonant
			return true;
		}
		return false;
	}
	
	public static void printLowerCaseAlphabets() {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}
	}

	public static void printUpperCaseAlphabets() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}
	}
}
