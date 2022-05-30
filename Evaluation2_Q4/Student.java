package com.Evaluation2_Q4;

public class Student extends Person {

	int studentId;
	String courseEnrolled;
	int courseFee;
	
	@Override
	public String toString() {
		
		name = "prem";
		gender = "male";
		studentId = 1107;
		courseEnrolled = "Java Backend";
		courseFee = 300000;
		a = new Address();
		a.city = "Delhi";
		a.state = "Delhi";
		a.city = "110096";
		
		return "Student [studentId=" + studentId + ", courseEnrolled=" + courseEnrolled + ", courseFee=" + courseFee
				+ "address: city: " + a.city + "state: " + a.state + "]";
	}
}
