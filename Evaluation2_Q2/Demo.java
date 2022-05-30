package com.Evaluation2_Q2;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of Students:");
		int numOfStudents = input.nextInt();
		
		
		Student[] student = new Student[numOfStudents];
		
		input.nextLine();
		
		for(int i=0; i<numOfStudents; i++)
		{
			System.out.println("   ");
			
			System.out.println("Enter name of student:");
			String name = input.nextLine();
			
			System.out.println("Enter student roll no:");
			int rollNo = input.nextInt();
			
			System.out.println("Enter marks:");
			int marks = input.nextInt();
			
			input.nextLine();
			
			System.out.println("Enter student address:");
			String address = input.nextLine();
			
			Student s = new Student();
			
			s.setName(name);
			s.setRoll(rollNo);
			s.setMarks(marks);
			s.setAddress(address);
			
			student[i] = s;
		}
		
		input.close();
		
		
		
		for(int i=0; i<student.length; i++)
		{
			System.out.println("========================");
			System.out.println("   ");
			System.out.println("Details of student: " + (i+1));
			System.out.println("   ");
			System.out.println("Student name is: " + student[i].getName());
			System.out.println("Student roll no is: " + student[i].getRoll());
			System.out.println("Student marks is: " + student[i].getMarks());
			System.out.println("Student address is: " + student[i].getAddress());
		}
		
		
		int totalMarks = 0;
		
		for(Student stud: student)
		{
			totalMarks +=  stud.getMarks();
		}
		
		double avg = totalMarks/student.length;
		
		System.out.println("   ");
		System.out.println("Average marks is: " + avg);
	}

}
