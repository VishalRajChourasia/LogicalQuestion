package com.Logic.Java8Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeTwoLists {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("Java", "Spring", "Hibernate");
		List<String> list2 = Arrays.asList("Spring", "Microservices", "AWS");
		List<String> merged = Stream.concat(list1.stream(), list2.stream())
	          .distinct()
	          .toList();
	          System.out.println("Merged List: " + merged);
	}
}
