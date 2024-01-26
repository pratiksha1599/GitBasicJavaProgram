package com.Practice2;

//Print consonant count
public class ConsonentCount {
	public static void main(String[] args) {
		String str = "welcome to javaz";

		char[] ch = str.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I'
						|| c == 'O' || c == 'U')) {
					count++;
				}

			}
		}
		System.out.println(" " + count);

	}
}
