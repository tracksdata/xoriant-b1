package com;

import java.util.Scanner;

import com.p1.C2;
import com.p1.C3;
import com.p1.C4;
import com.p1.q1.Q1;
import com.*;  // only classes of com package available. None of p1 package and p2 package nott available
//import com.p1.*; // bad practice
//import com.p1.q1.*;
import com.p2.D1;



public class Test {

	public static void main(String[] args) {
		
		C1 c1=new C1();
		c1.f1();
		c1.c1();
		c1.f2();
	
		C2 c2=new C2();
		C3 c3=new C3();
		C4 c4=new C4();
		
		Q1 q1=new Q1();
		
		D1 d1=new D1();
		
		
		// java.lang
		
		System.out.print(12);
		Math.sqrt(60);
		Integer i=new Integer(100);
		
		Scanner sc=new Scanner(System.in);
		
		
		
		

	}

}
