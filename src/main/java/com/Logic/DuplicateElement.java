package com.Logic;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElement {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,7,4,9,10,22,33,22,44,12,2,33);
		Set<Integer> duplicates = numbers.stream() //here it convert list of integer into Streams of Integer
		       .collect(Collectors.groupingBy(n->n, Collectors.counting())) //Groups numbers by their value.Counts how many times each number appears.
		       .entrySet().stream()//Converts the map into a stream of key-value pairs
		       .filter(entry-> entry.getValue() >1)//Keeps only those entries where the value (count) is greater than 1, meaning duplicates.
		       .map(Map.Entry::getKey)//Extracts just the keys (numbers) from the map entries.
		       .collect(Collectors.toSet());//Collects the results into a Set<Integer>,A Set automatically removes duplicates and stores unique values.
		System.out.println("Duplicate Elements:" +duplicates);
	}
}
