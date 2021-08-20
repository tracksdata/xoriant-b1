package com;

public class Sample {
	
	/*
	 *  PolyMorphism in Java   : 2 types
	 *  ----------------------
	 *  1. Static PolyMorphism  or Early binding : decision takes at compile time
	 *  	Ex: method loading
	 *  2. Dynamic  PolyMorphism or Late binding : decision takes at run time
	 *  	Ex: method overriding
	 *  
	 *  method loading
	 *  ----------------
	 *  -> re-declaring same method name with different signature
	 *  What is Signature?
	 *  -----------------
	 *  	1. number of arguments
	 *  	2. type of arguments
	 *  	3. position of arguments
	 *  	(note: In java return type is not considered as signature)
	 *  
	 *  Ex: 
	 *  
	 *  void draw()
	 *  void draw(int x)
	 *  void draw(int x,int y)
	 *  void draw(int x,float y)
	 *  void draw(float x,int y)
	 *  
	 *  wrong methods
	 *  -------------
	 *  int draw() // invalid 
	 *  void draw(int i,int j) // invalid
	 *  
	 *  
	 *  
	 *  method overriding
	 *  ====================
	 *  => defining same method name with same signature in the sub class. 
	 *  Note: access modifier also considered as signature
	 *  
	 */

	
	
	  void draw() {}
	  void draw(int x) {}
	  void draw(long x) {}
	  void draw(short x,short y) {}
	  void draw(int x,int y) {}
	  void draw(float x,int y) {}
	  //void draw() {} // invalid. 
	  //int draw() {return 0}  // invalid
	  //void draw(int i,int j) {} // invalid
	  
	  void f1() {}
	  void f2() {}
	  
	  
	  public static void main(String[] args) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
