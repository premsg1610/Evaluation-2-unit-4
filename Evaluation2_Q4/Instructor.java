package com.Evaluation2_Q4;

public class Instructor extends Person {

	int instructorId;
	int salary;
	
	@Override
	public String toString() {
		
		instructorId = 1107;
		salary = 300000;
		a = new Address();
		a.city = "delhi";
		a.state = " delhi";
		a.pinCode = "110001";
		
		return "Instructor [instructorId=" + instructorId + ", salary=" + salary + "]";
	}
}
