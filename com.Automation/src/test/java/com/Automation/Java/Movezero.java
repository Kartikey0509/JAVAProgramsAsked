package com.Automation.Java;

public class Movezero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,0,1,0,1,0,0};
	//	O/P={1,1,1,0,0}
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==0) {
				for(int j =i+1;j<arr.length;j++) {
					if(arr[j]!=0) {
						int temp = arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
				
			}
			System.out.print(arr[i]);
		}
		 
		 
		 
	}

}
