package com.basic1;

import java.util.Scanner;

public class Armstorng {
	public static void main(String[] args) {
		System.out.println("enter any num:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int m = num, sum = 0;
		while (num != 0) {
			int r = num % 10;
			sum = sum + r * r * r;
			num = num / 10;
		}
		System.out.println("Sum of number:" + sum);

		if (sum == m) {
			System.out.println("num is armstrong");
		} else {
			System.out.println("num is not armstrong");
		}
	}
}

/*
 * package Numbers;
 * 
 * import java.util.Scanner;
 * 
 * public class Armstrong {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * Scanner sc=new Scanner(System.in); int n=sc.nextInt(); System.out.println(n);
 * int sum=0; int m=n; while(n>0) { int rem=n%10; int cube=rem*rem*rem;
 * sum=sum+cube; n=n/10; } System.out.println(sum); if(sum==m) {
 * System.out.println("true"); } else { System.out.println("False"); }
 * 
 * }
 * 
 * }
 */
