package com.Logic.Java8Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyCounter {
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
		Map<String, Long> count = fruits.stream() //The result of groupingBy + counting is stored in a Map,where key = fruit name and value = count of that fruit.
		      .collect(Collectors.groupingBy(f->f,Collectors.counting()));//f -> f means — group by the same value
		System.out.println("Fruit count:" + count);
	}
}
