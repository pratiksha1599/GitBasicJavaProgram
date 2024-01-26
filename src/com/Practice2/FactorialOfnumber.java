package com.Practice2;

import java.util.Scanner;

public class FactorialOfnumber {
	public static void main(String[] args) {

		System.out.println("Enter any no.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= n; ++i) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
