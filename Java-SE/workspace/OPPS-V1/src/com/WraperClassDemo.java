package com;

public class WraperClassDemo {
	
	public static void main(String[] args) {
		
		
		// Type casting : 2 types
		/*
		 * 1. Conversion of Higher value into lower value type
		 * 2. Conversion of lower value into higher value
		 * 
		 * 
		 */
		
		
		// Higher type into lower type conversion
		//-------------------------------------------
		
		  int x=76; // 4 bytes
		  byte b; // 1 byte -> 127 to -128
		  
		  b=(byte)x;
		  
		  System.out.println(b);
		  
		  System.out.println("--------------------------");
		  
		  int i=87;
		  long l=6666L; // 8 bytes
		  float f=l;
		  System.out.println(f);
		  
		  System.out.println("---------------------");
		  
		  //float ff=87.43f; // treats as double
		  float ff=(float)87.43;
		  System.out.println(ff);
		  int iii=(int)ff;
		  System.out.println(iii);
		  
		  System.out.println("=========================");
		  
		  int iiii=100; // primitive type in java
		  
		  Integer intObj=new Integer(iiii); // wrapping of a primitive into object
		  
		 System.out.println(iiii);
		 System.out.println(intObj);
		 double dd= intObj.doubleValue();
	    	System.out.println(dd);
	    	
	    	// xxxValue
	    	// intValue
	    	// doubelValue
	    	// shortValue
	    	// floatValue
	    	
	  // how to convert a number into String ?
	    	
	    	Integer y=988;
	    	//String s=(String)y; // invalid
	    	
	        String s1 = y.toString();
	    	System.out.println(s1);
	    	
	    	int yy=998;
	    	
	    	String s2=yy+"";
	    	System.out.println(s2);
	    	
	    	System.out.println((s1+s2));
	    	System.out.println((yy+y));
	    	
	    	// Wrapper classes are used in java to convert any primitive type into Object type
	    	
	    	// imp Notes
	    	//-------------
	    	///int k=007543444; // any series starts with zero must not end wither 8 or 9
	    	//System.out.println(k);
	    	
	    	
	    	
	    	// Operators
	    	
	    	int c=10;
	    	//c=c+1;
	    	//c++;
	    	c+=1; // c=c+1
	    	
	    	System.out.println(c);
	    	
	    	byte b1=54;
	    	//b1=b1+1; // Any number by defaullt treat as integer
	    	//System.out.println(b1);
	    	b1+=1; // same like b1=b1+1;
	    	System.out.println(b1);
	    	
	    	System.out.println("==================================");
	    	
	    	System.out.println(10+20+30);
	    	System.out.println(10+""+20+30);
	    	System.out.println(""+10+20);
	    	System.out.println(10+" "+(20+30));
	    	
		
	}

}
