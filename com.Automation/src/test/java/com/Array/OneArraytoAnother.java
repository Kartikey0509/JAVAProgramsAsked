package com.Array;

// copy all elements of one array into another
public class OneArraytoAnother {

	public static void main(String[] args) {
		
		int[] arr1= {1,2,3,4};
		
		int[] arr2 = new int[arr1.length];
		
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		
		System.out.println("Original Array:");
		
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("Original Array:");
		for(int i=0;i<arr2.length;i++) {
		System.out.print(arr2[i]+" ");
		}
		System.out.println();
		if((arr1.length)==(arr2.length)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}

	}

}
