package com.Logic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNumber {
	public static void main(String[] args) {
		List<Integer> highestNumber = Arrays.asList(10, 20, 50, 40, 70, 60);
		int secondHighest = highestNumber.stream()//Converts the list into a Stream
		                                 .sorted(Comparator.reverseOrder())//I am arranging the numbers from largest to smallest
		                                 .skip(1)//I am ignoring the largest number because I want the second largest
		                                 .findFirst()//I am picking the first number from the remaining numbers, which is the second largest
		                                 .orElseThrow(()-> new RuntimeException("No Second Highest"));//If there is no second largest number, I will throw an error to indicate that.
		System.out.println("Second Highest Number:" +secondHighest);
	}
}
