package com;

public class DataTypes {
	public static void main(String[] args) {
		
		/*
		 *   int   - 4 bytes
		 *   short - 2 bytes
		 *   long  - 8 bytes
		 *   byte  - 1 byte
		 *   ------------------
		 *   float - 4 bytes
		 *   double - 8 bytes
		 *   ------------------
		 *   char - 2 
		 *   ------------------
		 *   
		 *   
		 *   // Wrapper classes  -> all wraper classes are simple type
		 *   -------------------
		 *   Integer
		 *   Short
		 *   Byte
		 *   Long
		 *   Float
		 *   Double
		 *   Character
		 *   Boolean
		 *   --------------------
		 *   
		 *    Types of Objects on Java : 2 types
		 *    ------------------------
		 *   
		 *   1. Simple type : can hold or store only one type of value
		 *   	Ex: Integer i=98;
		 *   2. Complex Type : can hold or store more than one type of values
		 *     Ex: Employee { int id, String name, float salary, char gender}
		 *          e.id=10;  e.name ="Praveen" ; e.salary=873.433; e.gender='M'
		 *          
		 *   
		 *   
		 *   
		 *   
		 * 
		 * 
		 */
		
		
		   byte b; // - 128 to 127
		   b=127;
		   int x=2147483647;
		   long l=9223372036854775807L; // 8 bytes
		   short s=32767;
		   
		   
		   System.out.println(l);
		   
		 //  long l=87;
		   
		   
		   int i=98; // primitive data type
		   
		   Integer ii=98; // Object Data type
		   
		   DataTypes dt=new DataTypes();
		   
		   
		   System.out.println(i+"  >>>> "+ii);
		   
		   
		   
		   System.out.println(x);
		   System.out.println(Short.MAX_VALUE);
		   System.out.println(Integer.MAX_VALUE);
		   System.out.println(Long.MAX_VALUE);
		   System.out.println((Integer.SIZE)/8);
		   System.out.println((Short.SIZE)/8);
		   System.out.println((Long.SIZE)/8);
		   System.out.println((Byte.SIZE)/8);
		   
		   System.out.println("----------------");
		   System.out.println((Float.SIZE)/8);
		   System.out.println((Double.SIZE)/8);
		   System.out.println("----------------");
		   System.out.println((Character.SIZE)/8);
		 
		
		
		
		
	}

}
