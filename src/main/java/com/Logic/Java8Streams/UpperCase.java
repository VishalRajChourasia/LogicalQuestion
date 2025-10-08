package com.Logic.Java8Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("vishal", "amit", "neha", "rohit");
		List<String> UpperNames = names.stream() // convert each element to upper case
		     .map(String::toUpperCase)// convert each element to upper case
		     .collect(Collectors.toList());
		System.out.println("Convert into UpperCase:" +UpperNames);
	}
}
