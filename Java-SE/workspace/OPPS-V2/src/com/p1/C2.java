package com.p1;

import com.C1;

public class C2 extends C1{
	// C2 is sub class
	// C1 is Super class
	
	/*
	 * -> sub class object can access all public 
	 *    methods/fields of super class
	 * -> sub class object can access all protected
	 *    methods/fields of super class
	 * -> sub class object can not access 
			-> super class's default methods/fields
			-> super class's private methods/fields
	 *    
	 */
	
	public static void main(String[] args) {
		
		C1 c1=new C1();
		c1.c1();
		//c1.f2(); // exception
		
		C2 c2=new C2();
		c2.c1();
		//c2.f1(); // default
		c2.f2(); // protected..
		
		
		
		
		
		
	}

}
