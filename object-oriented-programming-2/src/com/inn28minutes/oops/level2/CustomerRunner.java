package com.inn28minutes.oops.level2;

public class CustomerRunner {

	public static void main(String[] args) {
		
		Address homeAddress = new Address("line 1", "Hyderabad", "500035");
		Customer customer = new Customer("Ranga", homeAddress);
		System.out.println(customer);
		// name - [Ranga] home address - [line 1 Hyderabad 500035] work address - [null]
		
		Address workAddress = new Address("line 1 for work", "Hyderabad", "500078");
		customer.setWorkAddress(workAddress);
		
		System.out.println(customer);
		// name - [Ranga] home address - [line 1 Hyderabad 500035] work address - [line 1 for work Hyderabad 500078]
	}
}