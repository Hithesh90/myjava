package com.assignment;

class  StrongTillN
{
	public static void main(String[] args) 
	{
		int limit = 100000;
		//int num2 = n;
		
		for (int start = 1; start <=limit; start++ )
		{
			int num = start;
			int count =0;
			while(num>0)
			{
				num = num / 10;
				count++;
			}

			int sum = 0;
			int num2 = start;
			for (int i=count; i>0; i--)
			{
				int fact = 1;
				int digit = num2 % 10;
				
				for (int j=digit; j>0; j--)
				{
					fact = fact * j;
				}

				sum = sum + fact;
				num2 = num2 / 10;
			}

			if(sum == start)
				System.out.println(start+" is a Strong number");
		}
	}
}
