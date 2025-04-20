package com.Automation.Java;

public class Factorial {
	public static void main(String[] args){

		int num =5;
		int fact = findFact(num);
		System.out.println("Factorial of " + num +" is "+fact);
		}
		
		public static int findFact(int num){

		if(num==0) {
			return 1;
		}
		else {
			return num * findFact(num-1);
		}
		
		}
	

}
