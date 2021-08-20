package com;

/*
 * Notes
 * ---------
 * 1. Sub class object is used to access all methods of sub class and super class
 * 2. Super class object can not invoke methods of sub class. 
 * 
 */
class Shape { // Super class of Shape is java.lang.Object
	// Object class contains methods which are common to all other objects
	double width=76.43;
	
	public void draw() {
		System.out.println(">>> Shape class draw method");
	}
}

class Circle extends Shape{ // here Shape is super class
	
	public void makingCircle() { // individual method of Circle class
		System.out.println("Width: "+width);
		System.out.println(">>> Formula to make circle here...");
	}
	
	
	// override // same signature
	@Override // annotation
	public void draw() { // Overridden method of Circle class
		// super keyword is used to call super class constructor as well methods
		//super.draw();
		System.out.println(">>> Circle class draw method");
		//super.draw();
	}
}

public class MethodOverriding {
	
	// Techniques to create objects when sub classes are available
	// Note : creating direct object to the sub class is not recommended
	
	public static void main(String[] args) {
		Circle c=new  Circle();
		c.draw(); 
		c.makingCircle();// sensitive
		
		Shape s =new Shape();
		s.draw();
		
	}

}
