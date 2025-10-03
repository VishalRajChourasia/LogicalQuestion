package com.Logic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TopThreeMax {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12, 45, 67, 89, 23, 67, 99, 100, 45);
		List<Integer> top3 = numbers.stream()
		       .sorted(Comparator.reverseOrder())
		       .limit(3)
		       .collect(Collectors.toList());
		System.out.println("Top three Max:" +top3);
	}
}
