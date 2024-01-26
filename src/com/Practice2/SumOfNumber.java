package com.Practice2;

import java.util.Scanner;

public class SumOfNumber {
	public static void main(String[] args) {
		// sum of digits of given number 132
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");

		int n = sc.nextInt();
		int r = 0, sum = 0;
		while (n != 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + r;
		}
		System.out.println("sum of given no:" + sum);

	}
}
