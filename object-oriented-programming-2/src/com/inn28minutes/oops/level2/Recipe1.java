package com.inn28minutes.oops.level2;

public class Recipe1 extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the raw materials");
		System.out.println("Get the utensils");
	}

	@Override
	void doTheDish() {
		System.out.println("Prepare the dish");
	}

	@Override
	void cleanup() {
		System.out.println("Clean up the utensils");
	}
}