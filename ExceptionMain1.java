package com.exceptionhandling;

import java.util.Scanner;

public class ExceptionMain1 {
	public static void main(String[] args) {
		
		System.out.println("Connection Establishment");
		
		try                           //RISKY code or Suspicious code should inside try block 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a neumerator: ");
			int n = sc.nextInt();
			System.out.println("Enter denomenator : ");
			int d = sc.nextInt();
			
			double res = n / d ;
			System.out.println("Result: " +res);
			
		   
		}
		catch(ArithmeticException e) {
			System.out.println("Denomenator must  be non-zero number");
		}
	   catch (Exception e)   // Generic exception Exception block always at the end 
		{
		   System.out.println("Some problem !!! ");
	   }
		System.out.println("Connection terminated");
	}

}
