package com;

import java.util.Scanner;

public class SimpleIntrestV2 {

	static Scanner sc = new Scanner(System.in);

	static float getFloatValue() {
		return sc.nextFloat();
	}
	
	static float calculateSimpleIntrest(float p,float t,float r) {
		return  (float) (p * t * r) / 100;
	}

	public static void main(String[] args) {

		System.out.println("Enter P value: ");
		float p = getFloatValue();
		System.out.println("Enter t value: ");
		float t = getFloatValue();
		System.out.println("Enter R value: ");
		float r = getFloatValue();

		//float si = (float) (p * t * r) / 100;
		
		float si = calculateSimpleIntrest(p, t, r);
		
		System.out.println("SI: " + si);

	}

}
