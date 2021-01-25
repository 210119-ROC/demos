package com.revature.strings;

public class Driver {
	
	/*
	 * String Pool
	 * 
	 * The String Pool is the area within the Heap where strings are stored.
	 * 
	 * Remember that objects are stored in the Heap, but a special part of it called the String Pool
	 * is specifically where Strings created with a String literal are stored. The String Pool holds strings 
	 * that are instantiated with the String literal " ".
	 */
	
	public static void main(String[] args) {
		
		// this String is declared using the String literal and it is stored in the String pool
		String str1 = "hi"; 
		
		// declare another String using the string literal
		// both str1 and str2 now point String object in memory within the String pool
		String str2 = "hi";
		
		System.out.println(str1 == str2); // do these ref varaiables point to the SAME object? the SAME address?
		// true
		
		// when we declare a String object using the new keyword, this is stored in the heap NOT the string pool
		String str3 = new String("hi");
		
		System.out.println(str1 == str3);
		
	}

}