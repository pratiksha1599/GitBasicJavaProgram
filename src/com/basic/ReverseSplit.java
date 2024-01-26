package com.basic;

import java.util.Scanner;

public class ReverseSplit {
	public static void main(String[] args) {
		String str="016-78967";
//        Scanner sc = new Scanner(System.in);
        System.out.println("enter String");
       // str = sc.nextLine();
        String[] token = str.split(" ");
        for(int i=token.length-1;i>=0;i--) {
        	System.out.print(token[i]+ "");
        }
	}
}
