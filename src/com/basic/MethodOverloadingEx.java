package com.basic;

public class MethodOverloadingEx {

	void sum(int a, long b) {
		System.out.println("a method invoked");
	}

	void sum(long a, int b) {
		System.out.println("b method invoked");

	}

	public static void main(String[] args) {
		MethodOverloadingEx eobj = new MethodOverloadingEx();
		eobj.sum(20l, 20);

	}

}
