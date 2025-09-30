package com.Logic;

public class ReverseString {
	public static void main(String[] args) {
		String input = "Vishal";
		String reveresed = new StringBuilder(input).reverse().toString();
		System.out.println("Reversed:" +reveresed);
	}
}
