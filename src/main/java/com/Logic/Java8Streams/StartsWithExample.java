package com.Logic.Java8Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWithExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Vishal", "Amit", "Neha", "Vivek", "Nikita");
		List<String> filtered = names.stream()
		     .filter(name-> name.startsWith("V"))// Using stream and filter to select names starting with "V"
		     .collect(Collectors.toList());
		System.out.println("Names starting with v:" +filtered);
	}
}
