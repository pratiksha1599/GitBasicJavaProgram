package com.basic1;

import java.util.Scanner;

public class PitersonNumber {
	public static void main(String[] args) {

		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = n, sum = 0;
		while (n > 0) {
			int rem = n % 10;
			int fact = factorialofnum(rem);

			sum = sum + fact;
			n = n / 10;

		}

		if (sum == m) {
			System.out.println("Num is Piterson number");
		}

		else {
			System.out.println("Num is not Piterson number");
		}
	}

	public static int factorialofnum(int k) {
		int fact = 1;
		while (k > 1) {
			fact = fact * k;
			k--;
		}
		return fact;

	}
}
