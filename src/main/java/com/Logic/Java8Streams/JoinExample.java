package com.Logic.Java8Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinExample {
	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Delhi", "Mumbai", "Chennai", "Kolkata");
		String result = cities.stream() // Converting list into a stream and joining elements with ", "
		      .collect(Collectors.joining(", "));
		System.out.println("Cities:" +result);
	}
}
