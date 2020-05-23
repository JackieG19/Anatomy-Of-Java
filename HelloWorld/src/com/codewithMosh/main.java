package com.codewithMosh;

import java.awt.Point;

public class main {
	public static void main (String[] args){
		// Primitive Type
		byte x = 1;
		byte y = x;
		x = 2;
		System.out.println(y);
		// the bytes are in different memory location which makes them independent from each other 
		
		// Reference Type
		Point point1 = new Point(1, 1);
		Point point2 = point1;
		point1.x = 2;
		System.out.println(point2);
		// the point value store the address of the point memory
	}
}
