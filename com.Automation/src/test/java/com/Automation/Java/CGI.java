package com.Automation.Java;

public class CGI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="I am good guy"; //I ma good yug
		String[] word = str.split(" ");
		String words = word[0]+word[1]+word[2]+word[3];
		String rev= "";
		String rev1 ="";
		
		for(int i=word[1].length()-1;i>=0;i--) {
			rev += word[1].charAt(i);
		}
		for(int j =word[3].length()-1;j>=0;j--) {
			rev1+=word[3].charAt(j);
		}
	 
	
		String result =word[0]+" "+rev+" "+word[2]+" "+rev1;
		System.out.println(result);
	}
}


