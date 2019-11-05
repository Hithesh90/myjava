package com.assignment;

public class PrimeTillN 
{

	public static void main(String[] args) 
	{
	
	int limit =20;
	
	for(int n=2;n<=limit;n++)
	{
		int Count=2;
		for(int i=2;i<=n/2;i++)
		{

			if(n%i==0)
			{
				Count++;
			}

		}
		if(Count==2)
			System.out.println(n);
	}

	}

}
