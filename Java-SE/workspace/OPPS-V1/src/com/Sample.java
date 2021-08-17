package com;

public class Sample {
	
	/*
	 * Constructors
	 * -----------------
	 *  -> Constructor is a special method  which starts with a class name
	 *  Rules
	 *  ------
	 *  1. Constructor name and class name must be same
	 *  2. Constructor never returns any thing. Not even void.
	 *  
	 *  Note:
	 *  -------
	 *  Constructor invokes automatically every time after its object is created
	 * 
	 */
	
	
	String name; //default value of class level string is null;
	
	// constructor 
	
	Sample(){
		// loading of images/data/something from file system/memory/db and pass it to f1 method. 
		name="Praveen";
		System.out.println(">>> Sample Constructor");
	}
	
	
	  void f1() {  // f1 is a method
		  System.out.println(">>>> f1 method of Sample class");
		  System.out.println("Name: "+name);
	  }
	
	public static void main(String[] args) {
		
		System.out.println(">>> main method of sample class");
		
		// can i call f1 method directly from here? : No
		// Then  how can i invoke f1 method here? : By creating object 
		Sample s=new Sample();
		s.f1();
		
		
		
	}

}
