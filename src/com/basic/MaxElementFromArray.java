package com.basic;

public class MaxElementFromArray {
	public static void main(String[] args) {
		int arr[] = { 46,56,72,85,1000,23,1,4,3 };
		int max = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
		
}
}