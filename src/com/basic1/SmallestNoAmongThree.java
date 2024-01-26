package com.basic1;

public class SmallestNoAmongThree {
	public static void main(String[] args) {
		int a = 12, b = 34, c = 10;
		if (a > b) {
			if (a > c) {
				System.out.println("b is smaller" + b);
			} else {
				System.out.println("c is smaller" + c);
			}
		}
		else if(b>a) {
			if(b>c) {
				System.out.println("a is smaller" +a);
				
				
			}
			else {
				System.out.println("c is smaller"+c);
			}
		}
		else if(c>a){
			if(c>b) {
				System.out.println("a is smaller"+a);
			}
			else {
				System.out.println("b is smaller"+b);
			}
	
		}
//		else {
//			System.out.println("no one is smaller");
//		}
	}
}
