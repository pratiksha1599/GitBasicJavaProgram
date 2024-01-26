package com.Practice2;

import java.util.Scanner;

public class IfElseLadder {
	public static void main(String[] args) {
		System.out.println("Enter Marks of student:");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		if (marks > 90) {
			System.out.println("A grade");
		} else if (marks >=80 && marks < 90) {
			System.out.println("B grade");
		} else if (marks >= 70 && marks < 80) {
			System.out.println("C grade");
		} else if (marks >= 60 && marks < 70) {
			System.out.println("D grade");
		} else {
			System.out.println("fail");
		}
	}
}
