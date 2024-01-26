package com.basic;

public class MinimumElementFromArray {

	public static void main(String[] args) {
		int arr[] = { 4, 1, 12, 56, 78, 3, 90 };
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
         if(arr[i]<min) {
        	 min=arr[i];
         }
		}
		System.out.println(min);
	}
}
/*
 *  i=1 7<4
 *  i=2 12<4
 *  i=3 56<4
 *  i=4 78<4
 *  i=5 3<4
 *  min=3
 *  90<3
 * 
 * */
