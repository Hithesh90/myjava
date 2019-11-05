
class FibonacciTillN
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=0;
		int sum = 0;

		int limit=5;
		for(int i=0; i<limit; i++)
		{
			sum = a + b;

			if(i==0)
				b++;

			a = b;
			b = sum;
		}

		System.out.println(sum+ " is the " +limit+ "th term in Fibonacci Series");
	}
}
