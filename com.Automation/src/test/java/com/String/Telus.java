package com.String;

public class Telus {

	public static void main(String[] args) {
		String str ="kartikey srivastava";
		String[] names = str.split(" ");
		String output ="";
		for(String name : names) {
			String rev =" ";
			for(int i=name.length()-1;i>=0;i--) {
				rev=rev+name.charAt(i);
			}
			output=output+rev;
		}
		System.out.println(output);

	}
	

}
