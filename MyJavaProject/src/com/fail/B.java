package com.fail;

class B extends A
{
static void test() //CTE----> cannot  method shadowing
{
	System.out.println("from test() of B");
}
}
