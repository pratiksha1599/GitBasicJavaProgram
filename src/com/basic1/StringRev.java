package com.basic1;

public class StringRev {
	public static void main(String[] args) {
		String str = "HCLINfotech";
		String nstr = "";
		int len = str.length();
		for (int i = len - 1; i >= 0; i--) {

			nstr = nstr + str.charAt(i);

		}

		System.out.println("Reversed String is " + nstr);
	}
}
