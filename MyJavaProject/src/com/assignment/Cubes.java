package com.assignment;

public class Cubes
{
	public static void main(String[] args) 
	{
		int limit = 10;
		for(int i=0 ; i<=limit; i++)
		{
			int cube = 0;
			cube = i * i * i;
			System.out.println("Cube of " +i+ " is " +cube);
		}
	}

}
