package com.Logic;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NonRepeatedChar {
	public static void main(String[] args) {
		String input = "programming";
		              Character fisrtNonRepeated=  input.chars()//converts the string into an IntStream of character codes
		                     .mapToObj(c->(char)c)//converting the ASCII values back to characters
		                     .collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))//keeps the insertion order, so the first character appears first,counts occurrences of each character.
		                     .entrySet().stream()//I want to go through each character-count pair one by one.
		                     .filter(entry-> entry.getValue()==1)//I only want characters that appear one time in the string.
		                     .map(Map.Entry::getKey)//Extracts only the character from the map entry.
		                     .findFirst()//I pick the first non-repeated character.
		                     .orElse(null);//If there is none, I get null.
		                
		System.out.println("First Non-Repeated Chracter:" +fisrtNonRepeated);
	}
}
