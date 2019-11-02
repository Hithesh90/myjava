// WPTO CHECK IF THE GIVEN NUMBER IS PALENDROME //

package com.assignment;

public class palindrome 
{
	public static void main(String[]args)
	{
		int num=425;
		int number=num;
		int temp=0;
		int rev=0;
		while(num>0)
	    {
			temp=num%10;
			rev=rev*10+temp;
			num=num/10;
	    }
		if( num==rev)
			System.out.println(number+ " is plandrome number");
		else
			System.out.println(number+ " is not a palendrome number");
		
		
	}

}



