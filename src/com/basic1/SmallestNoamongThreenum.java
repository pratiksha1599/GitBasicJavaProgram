package com.basic1;

public class SmallestNoamongThreenum {
	public static void main(String[] args) {

		int a = 2, b = 7, c = 10;
		if (a <= b && a <= c) {
			System.out.println(a + "is the smallest");
		} else if (b <= a && b <= c) {
			System.out.println(b + "is the smallest");
		} else {
			System.out.println(c + "is the smallest");
		}
	}
}