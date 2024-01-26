package com.basic1;

import java.util.Scanner;

public class FactorialOfnum {
	public static void main(String[] args) {
		System.out.println("Enter num");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		
//    int fact=1;
//    for(int i=1;i<=num;i++) {
//    	fact=fact*i;
//    }
//    System.out.println(fact);
		
		
		
//	}
		
		
		System.out.println(factofnum(num));
		
	}
	
	public static int factofnum(int k) {
		int fact=1;
		while(k>1) {
			fact=fact*k;
			k--;
		}
		return fact;
	}
}
