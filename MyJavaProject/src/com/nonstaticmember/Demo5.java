//NON-STATIC METHOD//

package com.nonstaticmember;

public class Demo5
{
 void m1()
 {
	 System.out.println("from method m1");
	 System.out.println(this);
 }
 public static void main(String[]args) 
 {
	 Demo5 x=new Demo5();
	 System.out.println(x);
	x.m1();
	
}
}
