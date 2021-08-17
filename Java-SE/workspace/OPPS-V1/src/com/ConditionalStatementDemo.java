package com;

public class ConditionalStatementDemo {

	// conditional statements in Java
	/*
	 * 1.if 
	 * 2.if else 
	 * 3. nested if 
	 * 4. switch case
	 * 
	 * 
	 */

	public static void main(String[] args) {

		if (100 > 20) {
			System.out.println("100 is big");
		}

		int a = 1000, b = 60, c = 300;

		if (a > b) {
			System.out.println(a + " is big");
		} else {
			System.out.println(b + " is big");
		}

		// print big number among a,b,c

		if (a > b) {
			if (a > c) {
				System.out.println(a + " is big");
			}
		} else if (b > c) {
			System.out.println(b + " is big");
		} else {
			System.out.println(c + " is big");
		}
		
		//-------------------------------------------------------
		
		// switch
		/*
		 * switch type value should be integers, characters, String (Java 8) and Enums
		 * Note:
		 * Cannot switch on a value of type double. Only convertible int values, strings or enum variables are permitted
		 */
		
		int x=20;
		
		switch(x) {
			case 1:
				System.out.println("case 1");
			break;
			case 2:
				System.out.println("case 2");
				break;
			case 3:
				System.out.println("case 3");
				break;
			default:
				System.out.println("other than 1, 2 and 3");
		
		}
		

	}

}
