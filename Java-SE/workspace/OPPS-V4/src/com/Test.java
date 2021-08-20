package com;

class A{
	
	public void f1() {}
	void f2() {}
	protected void f3() {}
}

class B extends A{
	
	/*
	 * If super class method is public, then
	 *   -> overridden sub class method must be public
	 *   
	 * if super class method is protected, then sub class overridden method can be
	 * 		-> protected
	 * 		-> public
	 * 
	 * if super class method is default, then sub class overridden method can be
	 * 		-> default
	 * 		-> public
	 * 	    -> protected  
	 */
	
	
	@Override
	public void f1() {}
	
	@Override
	 void f2() {}
	
	@Override
	protected void f3() {}
	
}

public class Test {
	public static void main(String[] args) {

	}
}
