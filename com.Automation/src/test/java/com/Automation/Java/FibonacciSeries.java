package com.Automation.Java;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int num1=0; 
		int num2=1;
		System.out.println(num1);
		System.out.println(num2);
		int sum=0;
		int n;
		System.out.println("Enter the number:");
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		for (int i=2; i<n;i++) {
			sum= num1+num2;
			System.out.println(sum);
			num1=num2;
			num2=sum;
			
		}

	}

}
