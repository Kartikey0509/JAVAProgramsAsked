package com.String;

import java.util.HashMap;

public class ReplaceLetterWithCount {

	public static void main(String[] args) {
		// In given string found the count of each character and replace it whenever its duplicate
		String input = "Hippopotamus";
		input = input.toLowerCase();
		String output= replaceDuplicateWithCount(input);
		System.out.println("Final : "+output);
	}

	public static String replaceDuplicateWithCount(String input) {
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c:input.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		
		}
		StringBuilder result = new StringBuilder();
		for(char c:input.toCharArray()) {
			int count = map.get(c);
			if(count>1) {
				result.append(count);
			}
			else {
				result.append(c);
			}
		}
		return result.toString();
	}

}


