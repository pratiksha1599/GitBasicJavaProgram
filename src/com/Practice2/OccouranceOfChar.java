package com.Practice2;

public class OccouranceOfChar {
public static void main(String[] args) {
//	String Java coding Question: #1
//	Input : Original String: aaabbcca
//	Output: Compressed String: a3b2c2a
//
//	public class StringCompression {
//	private static String compressString(String input) {
//	if (input == null || input.isEmpty()) {
//	return input;
//	}
//	StringBuilder compressed = new StringBuilder();
//	char currentChar = input.charAt(0);
//	int count = 1;
//	for (int i = 1; i < input.length(); i++) {
//	if (input.charAt(i) == currentChar) {
//	count++;
//	} else {
//	compressed.append(currentChar);
//	compressed.append(count);
//	currentChar = input.charAt(i);
//	count = 1;
//	}
//	}
//	compressed.append(currentChar);
//	compressed.append(count);
//	return compressed.toString();
//	}
//	public static void main(String[] args) {
//	String input = "aabbcda";
//	String compressedString = compressString(input);
//	System.out.println("input String----------" + input);
//	System.out.println("compressed string =======" + compressedString);
//	}
//	}
}
}
