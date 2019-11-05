

class  Fibbonacci
{
	public static void main(String[] args) 
	{
		
		int a=0;
		int b=0;
		int sum = 0;

		for(int i=0; i<=20; i++)
		{
			sum = a + b;

			System.out.println(sum);

			if(i==0)
				b++;

			a = b;
			b = sum;
		}

	}	
}



