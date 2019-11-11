//  inheritance with non static members//
package com.inheritance;

 class P2 extends P1
 { 
	 int j=10;
 {
	 System.out.println("from IIb of P2");
 }
P2()
{
	System.out.println("from P2");
}
	 

public static void main(String[] args)
	 {
		P2 ob1=new P2();
		System.out.println(ob1.i); //is a member of parent inherited in child obj
		System.out.println(ob1.j); // is member of P2 class
		
		
		
		
	}
}
