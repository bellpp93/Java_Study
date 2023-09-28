package com.in28minutes.primitive.datatypes;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('b');
		System.out.println(myChar.isVowel()); // 'a','e','i','o','u' and Capitals
		
		System.out.println(myChar.isDigit()); // Number 0 ~ 9
		System.out.println(myChar.isAlphabet()); // Alphabet a ~ z and Capitals
		
		System.out.println(myChar.isConsonant()); // Alphabet and Consonant
		
		MyChar.printLowerCaseAlphabets(); // Alphabet a ~ z
		MyChar.printUpperCaseAlphabets(); // Alphabet A ~ Z
	}
}
