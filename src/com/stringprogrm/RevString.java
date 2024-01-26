package com.stringprogrm;

public class RevString {
	public static void main(String[] args) {
//	String str ="Satish Punekar Banglore India";
//	String[] ch=str.split(" ");
//	String rev="";
//	for(int i=ch.length-1;i>=0;i--) {
//		System.out.print(ch[i]+" ");
//		
//	}
//	//System.out.println(rev);
		// * Reverse single word Pratiksha --> ahskitarP

	/*	String s1 = "Pratiksha";
		String rev = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			rev = rev + s1.charAt(i);
		}
		System.out.println(rev);

	}*/
		
		
		String s2="satish puneker";
		String rev ="";
		String stringarray[]=s2.split("");
		
		for(int i=0;i<=stringarray.length-1;i++) {
			rev=rev+stringarray[i];
			
		}
		System.out.println(rev);
	}
}

//satish puneker
//hsitas rekenup
/**
 * Reverse single word Pratiksha --> ahskitarP /
 * 
 * 
 */