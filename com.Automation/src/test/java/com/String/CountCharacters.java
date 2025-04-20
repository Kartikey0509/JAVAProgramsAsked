package com.String;

public class CountCharacters {

	public static void main(String[] args) {
		// Java Program to count the total number of characters in a string
		String str ="The best of both worlds";
		str= str.replace(" ", "");
		int count =0;
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)!=0) {
				count++;
			}
			
		}
		System.out.println(str+"--->"+count);
	}

}
