package com.staticBlock;

 class stationary 
 {

	public static void main(String[]args)
	{
		System.out.println(marker.price);
		System.out.println(marker.colour);
		marker.price =100;
		marker.colour = "black";
		marker.price =80;
		marker.colour ="blue";
		System.out.println("marker of color " + marker.colour + "  marker.price " + marker.price);
		marker.writing();
	}

}
