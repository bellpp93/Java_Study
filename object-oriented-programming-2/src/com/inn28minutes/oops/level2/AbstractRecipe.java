package com.inn28minutes.oops.level2;

public abstract class AbstractRecipe {
	
	// prepare
	// recipe
	// cleanup
	
	public void execute() {
		getReady();
		doTheDish();
		cleanup();
	}
	
	abstract void getReady();
	abstract void doTheDish();
	abstract void cleanup();
}
