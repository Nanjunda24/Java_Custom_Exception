package com.exceptionhandling;

import java.util.Scanner;


class InvalidCustomerException  extends Exception 
{
	public InvalidCustomerException(String msg) {
		super(msg);
	}
}
class ATM 
{
	private long accountNumber = 73090100045714L ;
	private String password  = "User@123";
	
	long accNo ;
	String psw ;
	  
   public void input() 
   {                                          
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the account number : ");
		 accNo = sc.nextLong();
		System.out.print("Enter the password: ");
		 psw =sc.next();  
		
	}
   
   public void verify() throws InvalidCustomerException
   {
	   if( accNo == accountNumber && psw.equals(password)) 
	   {
		   System.out.println("Proceed to withdraw ");
	   }
	   else 
	   {
		   InvalidCustomerException invalid = new InvalidCustomerException("Invalid credentials!!");
		   System.out.println(invalid.getMessage());
	        throw invalid ;	   
    // throw new InvalidCustomerException();   //manually throwing exception 	
//		   
//		   System.out.println("Seem like legend ? What's the matter");
//		   input();
//		   verify();
	   }
   }
	
}

class Bank
{
	public void initiate()
	{
		ATM atm = new ATM();
		
		try {
		atm.input();
		atm.verify();
		}
		
		catch(InvalidCustomerException invalid)
		{
			
			System.out.println("Try again 3!!");
			
			try {
				atm.input();
				atm.verify();
				}
			
			catch( InvalidCustomerException invalid2) 
			{
				
				System.out.println("Try again 2!!");
				
				try {
					atm.input();
					atm.verify();
					}
				
				catch( InvalidCustomerException invalid3)
				{
					System.out.println("No more chances , sorry thank you!!");
					
				}
				
			}
			
		}
	}
}
public class ExceptionMain6 {
  public static void main(String[] args) {
	
	  Bank b = new Bank();
	  b.initiate();
}
}
