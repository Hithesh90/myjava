package com.Constructor;

 class mainclass1
 {
  public static void main(String[] args) 
  {
	System.out.println("from main of mainclass1 ");
	
	Demo1 ob1 = new Demo1();   //constructors executes only during object
	System.out.println("*************  ");
  
	Demo1 ob2 = new Demo1();
	System.out.println("main of main class1 ends  ");
}
}
