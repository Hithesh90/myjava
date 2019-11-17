package com.exceptionsHandling;

public class D1 
{
public static void main(String[] args) {
		
		
		
		System.out.println("main started");
		int a=10;
	    System.out.println(1);
		
		int b=0;
		int c;
		System.out.println(2);
		try
		{
		c=a/b;//Arithmetic exception
		System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception is cought");
		}
		System.out.println(3);
		System.out.println("main ended ");
}
}
