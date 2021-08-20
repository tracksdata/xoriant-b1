package com;

class Rbi {

	void f1() {
		System.out.println(">>>> f1 method of RBI");
	}
	
	public void guideLines() {
		System.out.println(">>> Common RBI Guide lines");
	}

	public void copyRights() {
		System.out.println(">>> RBI CopyRights");
	}
}

class Sbi extends Rbi {
	
	public void custInfo() {
		System.out.println(">>> SBI Customer information");
	}

	@Override
	public void copyRights() {
		System.out.println(">>> SBI CopyRights");
	}
}

class Hdfc extends Rbi {
	
	public void custInfo() {
		System.out.println(">>> HDFC Customer information");
	}
	
	@Override
	public void copyRights() {
		System.out.println(">>> HDFC CopyRights");
	}
}

class Icici extends Rbi {
	
	public void custInfo() {
		System.out.println(">>> ICICI Customer information");
	}
	
	@Override
	public void copyRights() {
		System.out.println(">>> ICICI CopyRights");
	}
}

public class Customer {

	public static void main(String[] args) {

		// Creating direct object to the sub class is not recamended.
		/*
		Sbi s = new Sbi();
		Hdfc h = new Hdfc();
		Icici i = new Icici();
		s.guideLines();
		h.guideLines();
		i.guideLines();

		s.copyRights();
		s.custInfo();
		h.copyRights();
		i.copyRights();
		*/
		
		/*
		 * Notes
		 * -------------
		 * 1. a super class can store hold all its sub class objects
		 * 2. a super class reference can ale to access all the methods
		 *    of a super class, and overridden methods of sub class.
		 * 3. a super class reference can not access of individual(a method which is defined in the sub class and not defined in the super class) methods
		 *    of its sub classes
		 *   
		 *  
		 */
		
		Rbi r=new Sbi(); // valid if Sbi is sub class of Rbi
		r.copyRights();
		r.f1();
		
		r=new Hdfc();
		r.copyRights();
		
		r=new Icici();
		r.copyRights();
		
		
		

	}

}




