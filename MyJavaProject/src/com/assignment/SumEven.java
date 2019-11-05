package com.assignment;

public class SumEven {

	public static void main(String[] args) 
	{
		int n = 20;
		int sum=0;
		for(int i =1; i<=n; i++)
		{
			if (i%2==0)
				sum = sum + i;
		}

		System.out.println(sum + " is the sum of Even natural numbers till "+n);
	}
}
