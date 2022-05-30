package com.Evaluation2_Q1;

public class Dog extends Animal {     //Is-A relationship exists

	public void print() {
		System.out.println("In print method of class Dog");
	}
	
	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		d1.print();
		
		d1.eat();            //Is-A relationship exists
		
		
	}
}
