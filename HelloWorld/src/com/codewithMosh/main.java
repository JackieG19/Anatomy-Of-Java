package com.codewithMosh;

import java.util.Arrays;

public class main {
	public static void main (String[] args){
		int[] numbers = new int[5];
		numbers[0] = 1;
		numbers[1] = 2;
		System.out.println(Arrays.toString(numbers));
		
		int[] number = { 2, 3, 5, 1, 4 };
		System.out.println(number.length);
		
		Arrays.sort(number);
		System.out.println(Arrays.toString(number));
	}
}
