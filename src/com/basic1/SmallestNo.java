package com.basic1;

import java.util.Scanner;

public class SmallestNo {
	public static void main(String[] args) {
    
		//int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 no.s");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a<b && a<c) {
			System.out.println(a + " is a smaller" );
		}
		else if(b<c){
			System.out.println(b + " is a smaller");
		}
		else {
			System.out.println(c + " is am smaller");
		}
	}
}
