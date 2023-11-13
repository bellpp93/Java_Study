package com.inn28minutes.oops.level2;

public class RecipeRunner {

	public static void main(String[] args) {
		
		Recipe1 recipe = new Recipe1();
		recipe.execute();
		
		System.out.println("");
		
		RecipeWithMicrowave recipeWithMicrowave = new RecipeWithMicrowave();
		recipeWithMicrowave.execute();
	}
}