package com.basic;

public class ReverseWordPositionSame {
//	public static void main(String[] args) {
//
//		String str = "Pratiksha is good girl";
//
//		String Result = " ";
//
//		String[] ar = str.split(" ");
//		
//		for (String w : ar) {
//			String word = " ";
//			for (int i = w.length() - 1; i >= 0; i--) {
//				word = word + "" + w.charAt(i);
//			}
//
//			Result = Result + word + " ";
//
//		}
//		System.out.println(Result);
//
//	}
//}
public static void main(String[] args) {
	String str="good girl";
	String res=" ";
	String ar[] = str.split(" ");
	for(String w:ar) {
		String word=" ";
		for(int i=w.length()-1;i>=0;i--) {
			word=res+" "+w.toCharArray();
		}
		System.out.println(word);
	}
}
}
