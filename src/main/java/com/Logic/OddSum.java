package com.Logic;

import java.util.Arrays;
import java.util.List;

public class OddSum {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35);
		int odSum = numbers.stream()
		.filter(n->n % 2!=0 )
		.mapToInt(Integer::intValue)// Convert Integer objects to primitive int
		.sum();
		System.out.println("OddSum is:" +odSum);
	}
}
