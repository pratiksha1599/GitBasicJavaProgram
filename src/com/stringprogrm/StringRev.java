package com.stringprogrm;

// java program to check whether two strings are anagrams are not
public class StringRev {
	public static void main(String[] args) {

		/*String str = "Apurva Ghorpade";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}
		System.out.println(rev);*/
		
		String str = "Welcome to java World";
		String splitArray[]=str.split(" ");
		String rev = "";
		for(int i=splitArray.length-1;i>=0;i--) {
			//rev=rev+" "+splitArray[i];
			System.out.println(splitArray[i]);
		}
		//System.out.println(rev);
	}
}
