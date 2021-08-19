package com;

// POJO class -> Plain old Java Object . 
// Model class
// Entity class
// Bean class
public class Employee {

	/*
	 * // types of constructor // 1. default constructor // 2 Parametrised one
	 * 
	 * Note: JVM adds a default constructor, when you dont provide default
	 * constructor JVM will not provide default constructor when you are providing
	 * parametrised constructor
	 * 
	 * When you are providing parametrised constructor, then you must provide
	 * default constructor also.
	 * 
	 */

	private int empId;
	private String empName;
	private double salary;

	
	public Employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void display() {
		System.out.println("ID: " + empId);
		System.out.println("Name: " + empName);
		System.out.println("Salary: " + salary);
	}

}
