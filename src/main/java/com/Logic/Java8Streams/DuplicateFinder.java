package com.Logic.Java8Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateFinder {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 10, 40, 20, 50);
		Set<Integer> duplicate = numbers.stream()
		       .filter(i-> Collections.frequency(numbers, i) >1) // Filter are using here whose element frequency is greater than 1 and Collections.frequency(list, element) returns how many times the element appears in the list
		       .collect(Collectors.toSet());// Filtered elements ko Set me store kar rahe hain taaki repeated duplicates automatic remove ho jayein
		System.out.println("Duplicate Find:" +duplicate);
	}
}
