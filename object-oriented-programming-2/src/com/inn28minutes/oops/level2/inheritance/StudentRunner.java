package com.inn28minutes.oops.level2.inheritance;

public class StudentRunner {

	public static void main(String[] args) {
		
//		Student student = new Student();
//		student.setName("Range");
//		student.setEmail("in28minutes@gmail.com");
		
		/*
		Person person = new Person();
		person.setName("Ranga");
		person.setEmail("ranga@in28minutes.com");
		person.setPhoneNumber("123-456-7890");
		String value = person.toString();
		System.out.println(value);
		System.out.println(person);
		*/
		
		Employee employee = new Employee();
		employee.setName("Ranga");
		employee.setEmail("ranga@in28minutes.com");
		employee.setPhoneNumber("123-456-7890");
		employee.setEmployeeGrade('A');
		employee.setTitle("Programmer Analyst");
		
		System.out.println(employee);
	}
}