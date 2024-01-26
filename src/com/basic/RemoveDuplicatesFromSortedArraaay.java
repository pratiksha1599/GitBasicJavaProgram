package com.basic;

public class RemoveDuplicatesFromSortedArraaay {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 4, 5, 5, 5, 5, 8 }; // sorted array 10
		int temp[] = new int[arr.length];//10 { 1, 2, 3, 4, 5, 0, 0, 0, 0, 0 };

		// int s =arr.length-1;
		// System.out.println(s);

		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {// [1,2,3,4,5,]
				temp[j] = arr[i];
				j++;
			}
		}
		temp[j] = arr[arr.length - 1];

		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i] + " ");
		}

	}
}

//test cases arr[]=[1,2,3,3] //false
//test cases arr[]=[1,2,3,4] //true
