package com.assignment;

public class CountOfDigits 
{
	public static void main(String[] args) 
	{
		int num = 508383;
		int temp = num;						// used to print the result
		int count=0;
		while (num>0)
		{
			num = num / 10;
			count++;
		}
		
		System.out.println("The number of digits in "+temp+" is "+count);
	}
}
