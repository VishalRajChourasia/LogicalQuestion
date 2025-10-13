package com.Logic.Java8Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByFirstLetter {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Vishal", "Vivek", "Neha", "Nikita", "Amit", "Ankit");
		Map<Character, Long> grouped = names.stream()
		.collect(Collectors.groupingBy(name->name.charAt(0),Collectors.counting()));
		System.out.println("Grouped by first Letter:" +grouped);
	}
}
