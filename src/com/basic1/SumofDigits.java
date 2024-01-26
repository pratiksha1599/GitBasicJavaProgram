package com.basic1;

public class SumofDigits {

	public static void main(String[] args) {
		//int arr[] = {2,4,5,6};
		int sum = 0;
		int n=12345;
		
		while(n>0) {
			sum=sum+n%10;
			n=n/10;
		}
		System.out.println("Sum of digits "+sum);
		
			
}
}

