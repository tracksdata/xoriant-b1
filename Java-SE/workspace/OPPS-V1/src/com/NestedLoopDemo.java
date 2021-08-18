package com;

public class NestedLoopDemo {

	public static void main(String[] args) {
		
		// ASCII  A - 65, B- 66 , a=97 , b =98 -> used by C and C++
		// char data type size is 1 byte
		// java char data type size is 2 bytes
		
		// JAVA ==> UNICODE
		// i 18 n
		
		// display all capital alphabets
		
		for(int i=65;i<=90;i++) {
			System.out.print((char)i+" ");
		}
		
		System.out.println();
		
		for(int i=97;i<=122;i++) {
			System.out.print((char)i+" ");
		}
		
	
		
		/*


		
		for (int i = 1; i <= 5; i++) { // outer loop
			
			for(int j=1;j<=i;j++) { // inner loop 
				System.out.print(j+" "); 
			}
			
			System.out.println();

		}
		// 
		
		*/

	}

}
