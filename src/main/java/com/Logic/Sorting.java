package com.Logic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5,2,3,7,8,9);
		
		//Ascending Order Perform
		List<Integer> ascending = numbers.stream() //here it convert list into a stream 
		                                 .sorted()//here use a Intermediate Operations and sort in natural order
		                                 .collect(Collectors.toList());// this is terminal operation and produce a final result 
		
		List<Integer> descending = numbers.stream()
		                                  .sorted(Comparator.reverseOrder()) // here use Comparator so this functional interface its compare the two object
		                                  .collect(Collectors.toList());
		
		System.out.println("Ascedning Order:" +ascending);
		System.out.println("Descending Order:" +descending);
		
		       
	}
	
}
