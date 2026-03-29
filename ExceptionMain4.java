package com.exceptionhandling;

import java.util.Scanner;

class Alpha1
{
	
     public void cal()   // throws ArithmeticException    // If exception not handle in method then  delegate  exception to the caller using throws keyword
       {
		
		System.out.println(" Alpha Connection established");
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter numerator: ");
			int n = sc.nextInt();
			
			System.out.println("Enter denominator: ");
			int d = sc.nextInt();
			
			int res = n / d;
			
			System.out.println("Result : " +res);
			
			sc.close();
			
		}
		catch(ArithmeticException e) {
			
			System.out.println("Denominator can't be  0 (Zero)");
			throw e ;   //throwing  handled exception to the caller called re-throwing exception 
		}      // throw  below the line will not executed it is like return statement,it  directly jump to caller method
		
		finally   //irrespective of situation it will execute
		{
			
			System.out.println("Alpha Connection closed");
		}
			
			
	}

}

class Beta1 {
	
	public void display() {
		
		System.out.println("Beta connection established ");
		
		Alpha1  a = new Alpha1();
		
		a.cal();
		
	}
	
}	


 class ExceptionMain4 {
	
	
	public static void main(String[] args) {
		
	
		System.out.println("Main connection started ");
		
		Beta1 b = new Beta1();
		
		try {
			b.display();
		}
		catch(ArithmeticException e) {
			System.out.println("Denominator can't be 0");
		}
			
		
		System.out.println("Main connection closed");
		
	}
}