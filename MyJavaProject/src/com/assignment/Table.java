package com.assignment;



import java.util.Scanner;

class  Table
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to diplay multiplication table");

		int num = sc.nextInt();

		for (int i=1;i<=10;i++)
		{
			int prod = 0;
			prod = num * i;
			System.out.println(num+" * "+i+ " = "+prod);
		}
	}
}

