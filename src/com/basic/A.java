package com.basic;

public class A {
	public static void main(String[] args) {
		int arr[] = { 3, 4, 1, 7, 2, 9 };
	  int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		System.out.println("Minimum ele"+max);
	}
}
