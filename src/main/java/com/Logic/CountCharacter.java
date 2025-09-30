package com.Logic;

public class CountCharacter {
	public static void main(String[] args) {
		String input="Hello Java 8 ";
		long count =input.chars()
		     .filter(c-> c!=' ') //here filter are used to without space 
		     .count();
		System.out.println("Total characters (without spaces):" +count);
	}
}
