package com.Automation.Java;

public class LT {

	public static void main(String[] args) {
	
			String str ="#$@356test";

			for(int i=0; i<str.toCharArray().length;i++){
			char ch = str.charAt(i);
			if(Character.isLetter(ch) == true){
			System.out.println("letter: "+ch);
			}
			else if(Character.isDigit(ch) == true){
			System.out.println("Digits : "+ch);
			}
			else{
			System.out.println("Special character: "+ch);
			}
			}
			}


}
