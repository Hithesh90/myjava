package com.assignment;

//Find factors of a number and number of factors

class FindFactors
{
	public static void main(String[] args) 
	{
		int n=21;
		int CountOfFactors=0;
		System.out.println("Factors of " +n+ " are");
		for (int i=1;i<=n;i++)
		{
			if(n%i==0)
			{	
				System.out.println(i);
				CountOfFactors++;
			}
		}
		System.out.println("Number of Factors of " +n+ " are " +CountOfFactors);
	}
}
