package com.basic;

public class CountEvenAndOddNo {
	public static void main(String[] args) {
		int even = 0, odd = 0;
		int a[] = { 1, 8, 9, 5, 3, 2 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				even++;
				System.out.print(a[i]);// 1+1

			} else {
				odd++; // 1 +1+1+1+

				// System.out.println(a[i]);
			}

		}
		System.out.println("even count: " + even);
		System.out.println("odd count:" + odd);
	}
}
