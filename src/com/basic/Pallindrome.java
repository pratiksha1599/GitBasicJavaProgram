package com.basic;

public class Pallindrome {
	public static void main(String[] args) {

		int n = 515;
		int temp;
		int num, r = 0;
		temp = n;
		while (n != 0) {
			r = r * 10 + n % 10;
			n = n / 10;
		}
		System.out.println("pallindrome number is:" + r);

		if (temp == r) {
			System.out.println("No. is pallindrome");
		} else {
			System.out.println("No. is not pallindrome");
		}
	}
}
