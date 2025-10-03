package com.Logic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesInteger {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 10, 30, 40, 30, 50);
		List<Integer> intgerDuplicates = numbers.stream()
		       .distinct()// Keep only unique elements
		       .collect(Collectors.toList());// Collect the result back into a List
		System.out.println("RemoveDupInteger is:" +intgerDuplicates);
	}
}
