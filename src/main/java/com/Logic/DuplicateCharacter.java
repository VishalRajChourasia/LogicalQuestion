package com.Logic;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateCharacter {
	public static void main(String[] args) {
		String input = "programming";
		//Convert the string into a stream of characters
		Set<Character> duplicates= input.chars() // IntStream of ASCII values
		     .mapToObj(c->(char)c) // Convert int ASCII codes to Character objects
		     .collect(Collectors.groupingBy(c-> c, Collectors.counting()))// Collect characters into a Map with their frequency
		     .entrySet().stream() // Convert the Map into a set of entries (key-value pairs) // Create a stream of map entries
		     .filter(e->e.getValue() >1) // Keep only entries where character occurs more than once
		     .map(Map.Entry::getKey) // Extract the character (key) from each entry
		     .collect(Collectors.toSet()); // Collect the duplicate characters into a Set (unique values)
		System.out.println("Duplcates:" +duplicates);
	}
}
