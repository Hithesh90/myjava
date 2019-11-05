package com.assignment;

public class SumOfPrime
{
public static void main(String[] args) 
{
			int limit=10;
			int sum2=0;

			for(int i=2; i<=limit; i++)
			{
				int CountOfFactors=2;
				
				for(int j=2; j<=i/2; j++)
				{
					if (i%j==0)
						CountOfFactors++;
				}

				if(CountOfFactors==2)
					sum2 = sum2 + i;
			}

			System.out.println(sum2+ " is the sum of Prime numbers till "+limit);

			

			// Using CountOfFactors=0
			int limit2=5;
			int sum3=0;

			for(int i=2; i<=limit2; i++)
			{
				int CountOfFactors=0;
				
				for(int j=1; j<=i; j++)
				{
					if (i%j==0)
						CountOfFactors++;
				}

				if(CountOfFactors==2)
					sum3 = sum3 + i;
			}

			System.out.println(sum3+ " is the sum of Prime numbers till "+limit2);

		}
	}

