package com.collectionsList;

import java.util.ArrayList;


public class Al1 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add("XYZ");
		System.out.println(al); //[10, 20, XYZ]
		
		al.add(1, "ABC");
		System.out.println(al); //[10, ABC, 20, XYZ]

		al.add("MNO");
		al.add("LOK");
		
		System.out.println(al.isEmpty());//false
		System.out.println(al.size());//6
		
		Object ob =al.set(5, "PQR");
		System.out.println(ob); //"LOK"
		
		System.out.println(al); //[10, ABC, 20, XYZ, MNO, PQR]
		
		System.out.println(al.contains("asmitha"));//false
		System.out.println(al.add(20));//true
		System.out.println(al); //[10, ABC, 20, XYZ, MNO, PQR, 20]
		System.out.println(al.indexOf(20));//2
		System.out.println(al.lastIndexOf(20));//6
		System.out.println(al.indexOf("MNO"));//4
		
		System.out.println(al.size()); //7
		
		System.out.println(al);//[10, ABC, 20, XYZ, MNO, PQR, 20]
		
		al.clear();
		System.out.println(al.isEmpty());//true
		System.out.println(al.size()); //0
		
		
		
		
	}
	
}
