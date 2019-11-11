package com.fail;

//fail keyword for reference  VARIABLE//


class Demo5 
{
public static void main(String[] args) 
{
	final Demo5 ob=new Demo5();
	
	ob=new Demo5(); //CTE
	
	ob=null;  //CTE
}
}
