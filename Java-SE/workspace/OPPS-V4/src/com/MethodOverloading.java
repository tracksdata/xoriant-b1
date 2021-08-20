package com;

public class MethodOverloading {

	// MethodOverloading must be used in the same class
	
	void f1(float x) { // 4 bytes
		System.out.println("float: "+x);
	}
	
	void f1(double x) { // 8 bytes
		System.out.println("double: "+x);
	}
	
	void f1(long x) { // 8 bytes
		System.out.println("long: " + x);
	}
	
	
	void f1(int x) { // 4 bytes
		System.out.println("int: " + x);
	} 

	void f1(short x) { // 2 bytes
		System.out.println("short: " + x);
	}

	void f1(byte x) { // 1 byte
		System.out.println("byte: " + x);
	}
	
	

	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
		
		mo.f1(87);
		/*
		mo.f1(10); // by default always int gets called if int type is available
		mo.f1(100L);  // long
		mo.f1((short)76); // short
		mo.f1((byte)12); // byte
		*/
		
		//mo.f1((byte)65); // long ==> by default int type. when int type is not available, then integers next highiest range type is searched
		
		
		
		

	}

}
