package com.codewithMosh;

public class main {
	public static void main (String[] args){
		short x = 1;
		int y = x + 2;
		System.out.println(y);

		// Implicit casting - byte > short > int > long > float > double
		double a = 1.1;
		double b = a + 2;
		System.out.println(b);
		
		double c = 1.1;
		int d = (int)c + 2;
		System.out.println(d);
		
		String e = "1.1";
		// int f = Integer.parseInt(e) + 2; error
		double f = Double.parseDouble(e) + 2;
		System.out.println(f);
	}
}
