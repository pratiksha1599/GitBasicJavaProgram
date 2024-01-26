package com.basic;

public class ReverseString {
	public static void main(String[] args) {

//		String str = "Pratiksha";
//		int len = str.length();
//		String rev = " ";
//		for (int i<len-1; i >= 0; i--) {
//			rev = rev + str.charAt(i);
//		}
//		System.out.println(rev);

		
		String str = "Pratiksha",nstr="";
		char ch;
		System.out.println("Pratiksha");
		
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i); //ch
			nstr = ch+nstr;//ch //G //eG
			System.out.println(nstr);
		}
		System.out.println("reversed string: "+nstr);
	}
	
}
