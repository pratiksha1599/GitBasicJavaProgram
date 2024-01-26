package com.basic;

public class Splitmethod {
	public static void main(String[] args) {

		String str = "Elephant";
		String[] arrOfstr = str.split("n");

		for (String a : arrOfstr) {
			System.out.println(a);
		}
	}
}
