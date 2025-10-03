package com.Logic;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequencyString {
	public static void main(String[] args) {
		List<String> string = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
		Map<String, Long> frequency = string.stream()
		      .collect(Collectors.groupingBy(w->w,Collectors.counting()));//Group words by themselves and count occurrences
		System.out.println("wordFrequency is :" +frequency);
	}
}
