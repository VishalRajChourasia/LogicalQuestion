package com.Logic.Java8Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveNull {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Vishal", null, "Amit", null, "Neha");
		List<String> rmvNull = names.stream()
		     .filter(Objects::nonNull)//filter() unhi elements ko aage bhejta hai jinke liye condition true hoti hai.Objects::nonNull returns true only if the element is not null.
		     .collect(Collectors.toList());//After filtering out null elements, we collect all remaining non-null elements back into a new list.
		System.out.println("List without nulls:" +rmvNull);
	}
}
