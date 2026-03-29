package com.exceptionhandling;

import java.util.Scanner;

class Alpha 
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
//			cal();
			throw e ;   //when want to 
		}
		
			System.out.println("Alpha Connection closed");
			
	}

}



class Beta {
	
	public void display() {
		
		System.out.println("Beta connection established ");
		
		Alpha  a = new Alpha();
		
		a.cal();
		
//		try {   // if use the throws then caller will handle the exception 
//			
//			a.cal();
//			
//		}
//		
//		catch(ArithmeticException e) {
//			
//			System.out.println("Denominator can't be  0 (Zero) ");
//			
//		}
		
		
		System.out.println("Beta connection closed ");
		
	}
}


public class ExceptionMain3 {
	
	public static void main(String[] args) {
		System.out.println("Main connection started ");
		
		Beta b = new Beta();
		
		try
		{
			b.display();
		}

		
		catch(ArithmeticException e) {
			
			System.out.println("Denominator can't be  0 (Zero) ");
			
		}
		
		System.out.println("Main connection closed");
	}
	

}
