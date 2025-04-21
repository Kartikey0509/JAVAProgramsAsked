package com.String;

public class SumOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "$10";
		s1=s1.replace("$", "");
		String s2 ="$20";
		s2=s2.replace("$", "");
		String s3 =  s1+s2;
		s3= Integer.toString(Integer.parseInt(s1)+Integer.parseInt(s2));
		System.out.println("$"+s3);

	}

}
