package com.Practice2;

import java.util.Scanner;

public class GraterNoFromThree {
	public static void main(String[] args) {
		System.out.println("Enter three numbers: ");

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println("Grater is: " + a);
		} else if (b > a && b > c) {
			System.out.println("Grater is: " + b);
		} else {
			System.out.println("Grater is: " + c);
		}

	}
}
