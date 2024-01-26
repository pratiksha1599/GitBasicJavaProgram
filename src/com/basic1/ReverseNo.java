package com.basic1;

import java.util.Scanner;

public class ReverseNo {
	public static void main(String[] args) {
		System.out.println("Enter any number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int m = num;
		int rev = 0;
		while (num != 0) {
			int r = num % 10;
			rev = rev * 10 + r;
			num = num / 10;

		}
		System.out.println("reversed number is:" + rev);

		if (rev == m) {
			System.out.println("Number is reverese");
		} else {
			System.out.println("Number is not reverse");
		}
	}
}
