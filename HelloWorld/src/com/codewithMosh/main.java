package com.codewithMosh;

public class main {
	public static void main (String[] args){
		String message = "Hello World";
		System.out.println(message);
		
		String message2 = "Hello World" + "!!";	
		System.out.println(message2.endsWith("!!"));
		System.out.println(message2.startsWith("!!"));
		
		System.out.println(message2.length());
		System.out.println(message2.indexOf("e"));
		System.out.println(message2.replace("!", "*"));
	}
}
