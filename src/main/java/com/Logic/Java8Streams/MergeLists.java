package com.Logic.Java8Streams;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeLists {
	public static void main(String[] args) {
		    List<String> list1 = Arrays.asList("Java", "Spring", "Hibernate");
	        List<String> list2 = Arrays.asList("AWS", "Spring", "Microservices");
	        List<String> merged = Stream.concat(list1.stream(), list2.stream())
	                .collect(Collectors.toCollection(() -> new TreeSet<>(String.CASE_INSENSITIVE_ORDER)))
	                .stream()
	                .toList();
	        System.out.println("Merged Unique List: " + merged);
	}
}
