package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain2 {
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
					
				    System.out.println("Enter the size of an array : ");
				    int size = sc.nextInt();
				    int arr[] = new int[size];
				    
				    System.out.println("Enter an array element: ");
				    int element = sc.nextInt();
				    
				    System.out.println("Enter the array index element to be insert");
				    int index = sc.nextInt();
				    
				    arr[index] = element ;
				    
				    System.out.println("Array element inerted successfullY at the index: "+index);
				}
				
				catch(ArithmeticException e) {
					System.out.println("Denominator can't be zero!!");
				} 
				
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("Array index out of bounds exception");
				}
				
				catch(NegativeArraySizeException e) {
					System.out.println("array size can't be negatve ");
				}
				
				
				catch(InputMismatchException e) {
					System.out.println("Array input should integer only");
				}
				
				
			   catch (Exception e)  //Generic exception must be at the last line , if the any of the exceptions not encountered then generic exception executed that's why it is last  exception block
				{
				   System.out.println("Some error!!! ");
			   }
				System.out.println("Connection terminated");

	}

}
