package com.basic1;

public class Demo {
	public static void main(String[] args) {
// Input - “My name is Mayank”

		// Output - “kn ayaM si emanyM”

		String str = "My name is Mayank";
		String rev = " ";

		String ch[] = str.split(" ");

		for (int i = ch.length - 1; i >= 0; i--) {
			// System.out.println(ch[i]+ " ");

			rev = rev + ch[i];
		}

		System.out.println(rev);

	}
}
