package com;

import java.util.Scanner;

public class Product {
	
	
	Scanner sc = new Scanner(System.in);

	int productID; 
	String productName;
	double price;
	String description;
	String coupon;

	
	 void addProduct()
	{
		System.out.println("Enter Product Id : ");
		productID = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter Product Name : ");
		productName= sc.nextLine();
		
		System.out.println("Enter Product Price : ");
		price= sc.nextDouble();
		
		sc.nextLine();
		
		System.out.println("Enter Product Description : ");
		description= sc.nextLine();
				
	}
	
	void super50() {
		
		double p = 100 - 50;
		price = (p*price)/100;
	}
	
	void spring20() {
		
		double p = 100 - 20;
		price = (p*price)/100;
	}
	void winter30() {
		
		double p = 100 - 30;
		price = (p*price)/100;
	}

	void addDiscountCode(){
		//String discountCode;
		System.out.println("Enter Product coupon : " );
		coupon = sc.next();
	
		if (coupon == "SUPPER50OFF") {
			super50();
		}
		if (coupon.equals("SPRING20OFF")) {
			spring20();
		}
		if (coupon == "WINTER30OFF") {
			winter30();
		}
	 
	}
	void displayProduct()
	{
		System.out.println("Product ID 	: " +productID);
		System.out.println("Product Name : " +productName);
		System.out.println("Product Price : " +price);
		System.out.println("Product Description : " +description);
	}
	
	
	
	public static void main(String[] args) {
		Product p1 = new Product();
		
		p1.addProduct();
		p1.addDiscountCode();
		p1.displayProduct();
	}
}
