package com;


// Single line comment
/**  documentation comment  */
/* Multi line comment */

/* 
 *    Class
 *    -------------
 *    -> class is keyword
 *    -> naming conventions for class creation
 *    	-> class name should start with upper  case letter
 *    	-> if class name contains more than one word, then each word first letter should  be capitalized
 *    	-> class name should not start with letters or any special symbols except '%' sign
 * 
 * 
 *    What class consists of?
 *    --------------------------
 *    	-> fields / variables / properties
 *    		types of properties
 *    	--------------------------
 *    		1. instance
 *    		2. static
 *    		3. final
 *    		4. volatile
 *   
 *    	-> methods
 *    		types of methods
 *    		------------------
 *    		1. instance method
 *    		2. static methods
 *    		3. final methods
 *    		4. abstract methods
 *    		5. native methods
 *    
 *    		
 *    	-> constructor
 *      -> blocks
 *      	1. static blocks
 *      	2. non static / instance blocks
 *      
 *      
 *      How to create object of a class?
 *      -----------------------------------
 *      	-> new operator
 *      	-> newInstance method
 *      	-> cloning technique
 *      
 *      Why to create object in Java?
 *      ----------------------------------
 *      -> to access non static methods/properties from static methods
 *      -> to access non static methods/properties from other class static and non static methods
 *      -> to access non static methods from other class methods/constructors
 *      
 *      In how many ways object can be created? : 3 ways
 *      ----------------------------------
 *      -> new operator
 *      -> newInstance method
 *      -> cloning technique
 *    
 *    
 *      Rules
 *      ---------
 *      1. instance data can not be invoked / accessed directly from static method
 *      2. instance / non-static methods/fields can access static and non static data directly from the same class
 *      3. instance / non-static methods/fields can access static and non static data with class name from other classes
 *      4. static methods access static data only. 
 *      5. non-static methods/instance methods can access instance and non-static data directly from the same class
 *      
 *      
 *      new operator
 *      -----------------
 *      -> new is  a keyword
 *      -> new always followed by constructor name / class Name  
 * 
 */



//void f2() {} //function ->  every thing should be with in class itself

public class Demo {
	

	 static String mgrName="James"; // static variable
	
	 int empId; // instance variable // non-static filed 
	
	static void f2() { // static method
		
		mgrName="Praveen";
		System.out.println("Manager name is "+mgrName);
		// can not access any non static data directly
		//empId=10; exception
	}
	
	void f1() { // non static method
		System.out.println(">>>>> f1 method");
		mgrName="Kavya";
		empId=20;
	} //method

	public static void main(String[] args) {
		
		
		// creating an object to Demo class
		
		int x;
		x=10;
		char ch='A';
		
		//Demo d=null; // d is the referance variable of type Demo class 
		//d=new Demo(); // new Demo(); portion creates object to the class Demo and stores inside d
		
		Demo d=new Demo();
		d.f1();
		
		
		// empId=10; error
		
		System.out.println("MGR Name:: main :: "+mgrName);
		
		//d.f2();
		Demo.f2();
		// if static data available in the same class, then we can call them directly without class name
		f2(); // direct invocation with out object / class name
		System.out.println("Welcome to Java");
		System.out.println("Line two");
		System.out.println("Line Three");
		System.out.println("Line Four");
		
		System.out.println("Hellooo");	
	}

}












