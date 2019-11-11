// for SINGLE LEVEL inheritance//

package com.upcasting;

 class MainClass 
 {
public static void main(String[] args)
{
	A ob1=new B(); //UPCASTING
	System.out.println(ob1.i); //10
	//System.out.println(ob1.j); CTE---> using parent type refrnc var we cant acess member of child class


   B ob2=new B();
   System.out.println(ob2.i); //10
   System.out.println(ob2.j); //20
   
   
   A ob3=ob2; //UPCASTING
   System.out.println(ob3.i); //10
  // System.out.println(ob3.j); CTE---->using parent type refrnc var we cant acess member of child class


}
}
