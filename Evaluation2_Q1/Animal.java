package com.Evaluation2_Q1;

public class Animal {

	static Cat c1 = new Cat();  //has-A relationship
	
	public void eat() {
		System.out.println("Animal is eating...");
	}
}


// All definitions are explained below:-

/*
 * Difference between Is-A relationship and Has-A relationship:
 * 
 * Is-A relationship: when we inherit the property of a parent class to its child class
 *                    then a relation ship is created which is known as Is-A relationship.
 *                    
 *                    for example: In above example Animal is a parent class and Dog
 *                    extends the Animal class i.e, it inherits the property of Animal
 *                    class.
 *                    
 *                    Now we can say that "Dog is a Animal".
 *                    In this way we establish a Is-A relationship.
 *                    
 *  
 *  Has-A relationship: when we declare an object of another class as an instance member
 *                      of any class then a Has-A relationship established between two 
 *                      classes.
 *                      
 *                      in above example we can say "Animal has a Cat".
 */






/*
 * Access modifier:
 * 
 * Access modifier are the keyword which tells us about the accessibility of any
 * variable,method or class.
 * 
 * In java we have 4 types of access modifiers:
 * 1. public
 * 2. private
 * 3. default
 * 4. protected 
 * 
 * 1. public: it's access is global i.e any variable, method or class having public access
 *    modifier can be accessed globally.
 *    
 * 2. private: it's accessibility is within that particular class only.
 * 
 * 3. default: when nothing is written then by default it's access modifier is default.
 *            it's accessibility is within the package. We can't access it outside the
 *            package.
 *            It act as public inside the package and private outside the package.
 *            
 * 4. protected: it is similar to the default but it can be accessed outside the package 
 *               only through inheritance i.e, it can be accessed after extending it.
 */
