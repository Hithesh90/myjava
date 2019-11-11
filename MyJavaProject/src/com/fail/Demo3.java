package com.fail;
//fail keyword for STATIC MEMBER  VARIABLE//


class Demo3
{
final static int i=10;
public static void main(String[] args)
{
	System.out.println(i);
	
	i++;  //CTE
	i%=2; //CTE
	System.out.println(i);
}
}
