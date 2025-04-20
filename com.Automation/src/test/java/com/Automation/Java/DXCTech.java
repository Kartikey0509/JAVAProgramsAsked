package com.Automation.Java;

public class DXCTech {

	public static void main(String[] args) {
	
	//	Move 0 at the end {1,0,3,0,5,6,3,2,0}
		int [] arr = {1,0,3,0,5,6,3,2,0};
	
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
			for(int j= i+1; j<arr.length;j++) {
				
			
			if(arr[j]!=0) {
			int temp=arr[i]; //0
			 arr[i]= arr[j];
			 arr[j]=temp;
			}
			
			
			}
			}
			System.out.print(arr[i]);
		}
		
			
			}
		

	}


