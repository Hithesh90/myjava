package com.assignment;

public class SumOfMulti3 {

	public static void main(String[] args) 
	{
		int limit=10;
		int sum=0;
		for (int i=1; i<=limit; i++)
		{
			if(i%3==0)
				sum = sum + i;
		}

		System.out.println(sum+ " is the sum of multiples of 3 till " +limit);
	}
}
