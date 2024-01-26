package com.stringprogrm;

import java.util.Scanner;

//Check whether the strig is palindrome or not
public class PalindromeString {
	public static void main(String[] args) {
		System.out.println("Enter String: ");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		// String s = "Pratiksha";
		String rev = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			rev = rev + s1.charAt(i);
		}

		if (s1.equals(rev)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("Not palindrome");
		}
	}
}
