package com.fail;

class P2 extends P1
{
void test()  //CTE--->cant override method
{
	System.out.println("from test of P2");
}
public static void main(String[] args)
{
	P2 ob= new P2();
	ob.test(); // no CTE //can be inherited
}
}
