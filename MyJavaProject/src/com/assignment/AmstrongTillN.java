package com.assignment;

class AmstrongTillN
{
	public static void main(String[] args) 
	{
		//int n = 407;                      // 1, 153, 370, 371, 407
		//int num = n;
	
		int limit = 500;

		for (int i = 1; i<= limit ; i++)
		{
			int num =i;
			int sum = 0;
			int digit = 0;
			
			
			while(num>0)
			{
				digit = num % 10;

				sum = sum + (digit * digit * digit);

				num = num / 10;
			}
			
			if(sum == i)
				System.out.println(i+" is an Armstrong number");
		
		}
		
	}
}
