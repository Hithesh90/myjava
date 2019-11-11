package com.fail;
 // fail keyword for LOCAL VARIABLE//

 class Demo1  
{
public static void main(String[] args) 
{
	final int i=10; //CTE---> reassigned
	System.out.println(i);
	
	i=i+1; //CTE 
	System.out.println(i);
	System.out.println(++i); //CTE ---> reassigned
	
	i=12;  //CTE---> reassigned
	System.out.println(i+1); //NO ERROR bcs variable is altered
}
}
