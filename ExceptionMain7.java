package com.exceptionhandling;

import java.util.Scanner;

class UnderAgeException extends Exception //must extends runtime exception
{
    public UnderAgeException(String msg) 
    {
    	super(msg);   // exception class ----> throwable
    }
}

class OverAgeException extends Exception 
{
	public OverAgeException(String msg) {
		super(msg) ;   //exception class ----> throwable
	}
}

class Applicant 
{
	int age ;
	
	public void input() 
	{
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter your  age: ");
         age = sc.nextInt();
	}
	
	public void verify() throws UnderAgeException ,  OverAgeException
	{
		if(age >= 18 && age <= 60)
		{
			System.out.println("You can get license");
		}
		else if(age < 18 )
		{
			UnderAgeException u = new UnderAgeException("Have a patience kidoo! Your  time will come");
			System.out.println(u.getMessage());
			throw u;   //exception handling manually, it go to caller to handle exception
		}
		else 
		{
			OverAgeException o = new OverAgeException("Your are in near ! Take rest!!!");
			System.out.println(o.getMessage());
			throw o;
		}
	}
}

class RTO 
{
	public void initiate() 
	{
		Applicant a = new Applicant();
		
		try {
			a.input();
			a.verify();
		} 
		catch (UnderAgeException | OverAgeException e) 
		{
			System.out.println("Try again!!!");
			
			try {
				a.input();
				a.verify();
			} 
			catch (UnderAgeException | OverAgeException e1) 
			{
				System.out.println("No more chances you are blocked, due to age related issue!!!");
			}
		}
	}
}
public class ExceptionMain7 {
	
	public static void main(String[] args) {
		
		RTO r =  new RTO() ;
		
		r.initiate();
		
	}

}
