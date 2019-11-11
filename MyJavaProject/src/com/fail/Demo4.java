package com.fail;

//fail keyword for NON-STATIC MEMBER  VARIABLE//


class Demo4 
{
final int i=10;
public static void main(String[] args)
{
	Demo4 ab=new Demo4();
	ab.i=20; // CTE
}
}
