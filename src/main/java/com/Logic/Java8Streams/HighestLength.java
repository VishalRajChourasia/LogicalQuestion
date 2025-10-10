package com.Logic.Java8Streams;

import java.util.Arrays;
import java.util.List;

public class HighestLength {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Vishal", "Amit", "Neha", "Vivekanand", "Saurabh");
		int maxLength = names.stream()
		     .mapToInt(String::length)
		     .max()
		     .orElse(0);
		List<String> LongestNames = names.stream()
		     .filter(name -> name.length() == maxLength)
		     .toList();
		System.out.println("Longest Names: " + LongestNames);
	}
	
}
