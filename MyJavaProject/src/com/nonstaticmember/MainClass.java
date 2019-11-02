package com.nonstaticmember;

 class MainClass  
 {
	 public static void main(String[]args) 
	 {
	A ob1	= new A();
	A ob2 =  new A();
	System.out.println(ob1); //A@15db9742
	System.out.println(ob2);  //A@6d06d69c
	System.out.println(ob1.d); // 0.0
	System.out.println(ob2.d); //0.0
	ob1.d=12.0;
	System.out.println(ob1.d); //12.0
	System.out.println(ob2.d); //0.0
	ob2.d=50.1;
	System.out.println(ob1.d); //12.0
	System.out.println(ob2.d); //50.1
		
	}

}
