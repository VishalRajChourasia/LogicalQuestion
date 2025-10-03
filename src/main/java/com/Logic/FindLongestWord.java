package com.Logic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindLongestWord {
	public static void main(String[] args) {
		List<String> word = Arrays.asList("apple", "banana", "grapes", "strawberry", "kiwi");
		String LongWrd = word.stream()
		    .max(Comparator.comparingInt(String::length))// Compare words by their length and find the maximum
		    .orElse(null);
		System.out.println("Longest Word:" +LongWrd);
	}
}
