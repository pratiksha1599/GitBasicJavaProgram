package com.Practice2;

public class CountOfDigitsinGivenNumber {
	public static void main(String[] args) {
		// count of digits in given number 121

		int n = 0003452,count=0;
		while (n != 0) {
        n=n/10;
        count++;
		}
		System.out.println("Total count is: "+count);
	}
}
