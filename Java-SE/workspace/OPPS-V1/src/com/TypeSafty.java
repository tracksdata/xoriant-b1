package com;

import java.util.Scanner;

public class TypeSafty {
	
	public static void main(String[] args) {
		
		
		
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Marks of 3 subjects: ");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		
		int total=m1+m2+m3;
		
		float avg= (float) total/3; // chance of loosing precision
	
		System.out.println("Total: "+total);
		System.out.println("Average: "+avg);


	
		
		
		
		
		
	}

}
