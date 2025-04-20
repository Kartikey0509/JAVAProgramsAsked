package com.String;


import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// input = ddbbbbaaaacceeee remove duplicates and sort it
		String input ="ddbbbbaaaacceeee";
		
		TreeSet<Character> set = new TreeSet<Character>();
		for(char c: input.toCharArray()) {
			if(!set.contains(c)) {
				set.add(c);
			}
			
			
		}
		StringBuilder result = new StringBuilder();
		for(char ch :set) {
			result.append(ch);
		}
		
		System.out.println(result.toString());
		
		
		
	}

}
