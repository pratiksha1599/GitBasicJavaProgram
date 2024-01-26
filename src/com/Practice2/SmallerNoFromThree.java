package com.Practice2;

import java.util.Scanner;

public class SmallerNoFromThree {
	public static void main(String[] args) {
		System.out.println("Enter three no.");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		// 12 25 21
		if (a < b && a < c) {
			System.out.println("smaller no: " + a);
		} else if (b < a && b < c) {
			System.out.println("smaller no: " + b);
		} else {
			System.out.println("smaller no: " + c);
		}
	}
}
