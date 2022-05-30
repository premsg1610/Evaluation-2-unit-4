package com.Evaluation2_Q3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of passengers:");
		int noOfPassengers = input.nextInt();
		
		System.out.println("Enter number of kilometers:");
		int noOfKilometers = input.nextInt();
		
		Ola ola = new Ola();
		
		
//		returned object can be of sedan or hatchback therefore storing in parent class.
		
		Car c = ola.bookCar(noOfPassengers, noOfKilometers);
		
		int fare = ola.calculateBill(c);
		
		System.out.println("Total fare is: " + fare);
		
	}
}
