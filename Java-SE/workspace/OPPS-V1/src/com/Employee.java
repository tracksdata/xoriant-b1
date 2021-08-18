package com;

import java.util.Scanner;

public class Employee {
	
	 int empID;
	 String empName;
	 double salary;

	 Scanner sc=new Scanner(System.in);
	 
	 void acceptData() {
		 System.out.println("Enter Employee ID: ");
		 empID = sc.nextInt();
		 
		 sc.nextLine(); // skipping enter key : taking of input terminates as soon as enter key is pressed
		 
		 System.out.println("Employee name: ");
		 empName=sc.nextLine();
		 
		 
		 System.out.println("Salary: " );
		 salary=sc.nextDouble();
		   
	 }
	 
	 void display() {
		 System.out.println("Eployee ID: "+empID);
		 System.out.println("Employee Name: "+empName);
		 System.out.println("Salary: "+salary);
		 System.out.println("------------------------------");
	 }
	 
	 
	 public static void main(String[] args) {
		
		 Employee e1=new Employee();
		 Employee e2=new Employee();
		 e1.acceptData();
		 e2.acceptData();
		 
		 e1.display();
		 e2.display();
		 
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	

}
