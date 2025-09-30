package com.Logic;

import java.util.Map;
import java.util.stream.Collectors;

public class Occurance {
	public static void main(String[] args) {
		String input="Programming";
		Map<Character, Long> occurrence = input.chars() // now here converts string into stream of numbers //map is used to keep the character along with its frequency.
		                                       .mapToObj(c-> (char) c) //now here each numbers converts into characters.
		                                       .collect(Collectors.groupingBy(c->c ,Collectors.counting()));
		System.out.println(occurrence);
	}
}
