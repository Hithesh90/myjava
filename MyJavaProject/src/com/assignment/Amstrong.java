package com.assignment;

public class Amstrong 
{
	public static void main(String[] args) 
	{
		int n = 407;                     
		int num = n;
		int sum = 0;
		int digit = 0;
	
		while(num>0)
		{
			digit = num % 10;

			sum = sum + (digit * digit * digit);

			num = num / 10;

		}
		
		if(sum == n)
			System.out.println(n+" is an Armstrong number");
		else
			System.out.println(n+" is not an Armstrong number");
	}
}


