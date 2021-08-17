package com;



public class Loops {
	
	
	public static void main(String[] args){
		
		/*
		 * 1.while
		 * 2.do-while
		 * 3. for
		 * 
		 */
		
	
		//while
		int i=1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("------------------");
		System.out.println("------------------");
		System.out.println("------------------");
		System.out.println("------------------");
		
		i=1;
		do {
			System.out.println(i);
			i++;
		}while(i<=5);
		
		System.out.println("-------------------");
		
		for(i=1;i<=5;i++) {
			System.out.println(i);
		}
		
		
		
		
		
		
	
		/*
		Scanner sc=new Scanner(System.in);
		
		int x;
		System.out.println("Enter a value: ");
		x=sc.nextInt();
		System.out.println("X is "+x);
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Value: ");
		String s1=br.readLine();
		System.out.println("S1: "+s1);
		
		*/
		
	}

}
