package com.String;

public class AZ {

	public static void main(String[] args) {
		
		String str ="a1b2c3/@#$";
		
		for(int i=0; i<str.length(); i++){
			if(Character.isLetter(str.charAt(i))) {
				
			System.out.println("Alphabet:"+str.charAt(i));
			}
			else if(Character.isDigit(str.charAt(i))){
				System.out.println("Number: "+str.charAt(i));
				
			}else {
				System.out.println("Special Character :"+str.charAt(i));
			}
		}
	}

}

