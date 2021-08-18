package com;

import java.util.Scanner;

public class SimpleIntrest {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter p t r values: ");
		float p = sc.nextFloat();
		float t = sc.nextFloat();
		float r = sc.nextFloat();
		float si = (p * t * r) / 100;
		System.out.println("SI: " + si);
		sc.close();

	}

}
