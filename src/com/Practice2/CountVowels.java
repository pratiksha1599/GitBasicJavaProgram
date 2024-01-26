package com.Practice2;
//Print Vowel Count
public class CountVowels {
	public static void main(String[] args) {
		String s = "welcome to java class todayaaa";
		char ch[] = s.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
			}
		}
		System.out.println(count);
	}
}
