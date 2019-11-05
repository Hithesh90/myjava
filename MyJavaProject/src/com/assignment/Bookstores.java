package com.assignment;

public class Bookstores {

		public static void main(String[] args) 
		{
		Book b1=new Book("ABC", 400);
		Book b2=new Book("XYZ", 500);
		Book b3=new Book("CDU", 505);
		Book b4=new Book("LMN", 600);
		Book b5=new Book("HIG", 800);
		Book[] array= {b1,b2,b3,b4,b5};
		for (Book ob : array)
		{
		System.out.println("Bookname: "+ ob.name + "   Bookprice: "+ ob.price + "   Bookno: "+ ob.isbn);
		ob.genre("romantic");
		}
		}
		}  
	


