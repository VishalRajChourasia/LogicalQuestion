package com.Logic;

import java.util.Collections;
import java.util.stream.Collectors;

public class ReveresedStringUsingStream {
	public static void main(String[] args) {
		String input = "Vishal";
		String reveresed =input.chars()
		     .mapToObj(c->(char)c)
		     .collect(Collectors.collectingAndThen(
		    		 Collectors.toList(),
		    		 list-> {
		    			 Collections.reverse(list);//To reverse the order of characters.
		    			 return list.stream() //Convert the reversed list back to a stream.
		    					 .map(String:: valueOf)//Convert each Character to String
		    					 .collect(Collectors.joining());//Combine all strings into a single string
		    		 }));
		System.out.println("Reversed:" +reveresed);
	}
}
