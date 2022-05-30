package com.Evaluation2_Q4;

public class Main {

	public static Person generatePerson(Person person) {
		
		return person;
	}
	
	public static void main(String[] args) {
		
		Student student = new Student();
		
		Person p1 = Main.generatePerson(student);
		
		System.out.println(p1);
		
		
		
		
	    Instructor instructor = new Instructor();
	    
	    Person p2 = Main.generatePerson(instructor);
	    
	    System.out.println(p2);
	    
		
		
	}
}

