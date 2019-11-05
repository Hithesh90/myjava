package com.assignment;

import java.util.Scanner;
 class PrimeNum
{

  public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to check for Prime");
     int n = sc.nextInt();
     int Count=0 ;                                 
														
	for (int i=1;i<=n;i++)									
	{
		if(n%i==0)
		{
			Count++;
		}
	}
	if(Count==2)									
		System.out.println(n+" is a Prime Number");			
	else
		System.out.println(n+" is not a Prime Number"); 

}
}