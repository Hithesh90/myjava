//  inheritance with static members//
package com.inheritance;

 class A
{
	static int i=20;
	
	static
	{
		System.out.println("from SIb of A"); 
	 }
 static void test()
 {
	 System.out.println("from test() of A");
 }
 
}

