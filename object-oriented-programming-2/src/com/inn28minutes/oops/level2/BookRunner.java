package com.inn28minutes.oops.level2;

public class BookRunner {

	public static void main(String[] args) {
		
		Book book = new Book(123, "Object Oriented Programming with Java", "Ranga");
		book.addReview(new Review(10, "Great Book", 5));
		book.addReview(new Review(101, "Awesome", 5));
		
		System.out.println(book);
		// id = 123 name = Object Oriented Programming with Java author = Ranga Reviews = [[10 Great Book 5, 101 Awesome 5]]
	}
}