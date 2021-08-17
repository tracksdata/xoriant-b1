package com;

public class Calc {
	
	/*
	 * Note:
	 * 	Every method must returns a value. When a method
	 *  returns nothing then return type should be 'void'
	 *  
	 *  Types of arguments / parameters: 2 types
	 * 		1. actual arguments / parameters 
	 * 		2. formal arguments / parameters
	 * 
	 * 
	 * 
	 */
	
	void sum() { // method definition / body of a method
		System.out.println("Sum of 10 and 20 is "+(10+20));
	}
	
	void sum(int x,int y) { // here x and y is formal arguments
		System.out.println("Sum of "+x+" and "+y +"is "+(x+y));
	}
	
	int add(int x,int y) {
		return x+y;
	}
	
	
	
	public static void main(String[] args) {
		
		Calc c=new Calc();
		c.sum(); //method call / invocation 
		c.sum(100,200); // here 100 and 200 is called actual arguments
		
		int result = c.add(50, 60);
		System.out.println("Sum is "+result);
		System.out.println("50+60="+result);
		
		
		
		
	}

}
