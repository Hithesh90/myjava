//WPT REVERSE THE GIVEN NUMBER//

package com.assignment;

public class reverse 
{
	public static void main(String[]args)
	{
		int num=420;
		int temp=0;
		int rev=0;
		while(num>0)
	    {
			temp=num%10;
			rev=rev*10+temp;
			num=num/10;
	    }
		System.out.println(rev);
		
		
	}

}
