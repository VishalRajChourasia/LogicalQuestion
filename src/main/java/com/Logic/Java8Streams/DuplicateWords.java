package com.Logic.Java8Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateWords {
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange", "banana", "kiwi");
		Map<String, Long> wordCount = fruits.stream()
		.collect(Collectors.groupingBy(w->w ,Collectors.counting()));
		
		List<String> duplicates = wordCount.entrySet().stream()
		.filter(entry-> entry.getValue() >1)
		.map(Map.Entry::getKey)
		.toList();
		System.out.println("Duplicates Words:" +  duplicates);
	}
}
