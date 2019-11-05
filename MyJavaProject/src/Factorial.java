
import	java.util.Scanner;

class  Factorial
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number to calculate factorial ");
		int n = sc.nextInt();

		int temp = n;						
		int fact = 1;
		while (n>0)
		{
			fact = fact * n;
			n--;
		}

		System.out.println("Factorial of " +temp+ " is " +fact);
	}
}

