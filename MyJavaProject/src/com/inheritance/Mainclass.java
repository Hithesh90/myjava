//  inheritance with static members//
package com.inheritance;

class Mainclass
{
public static void main(String[] args)
{
	System.out.println(B.i);
	B.i=40;
	System.out.println(B.i);
	System.out.println(A.i);
	A.i=30;
	System.out.println(B.i);
	A.test();
	B.test();
	B.test1();
	
}
}
