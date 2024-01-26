package Exceptionhanding;

import java.util.Date;
class B{
	static int i=10;
	static void m1() {
		System.out.println("m1-A");
	}
}
public class Test {
	
	public static void main(String[] args) {
//		Date d =new Date();
//		System.out.println(d.toString());
		B b = null;
		System.out.println(b.i);
		b.m1();

	}
}
/*
 * In java applications NullpointerException is possible for only instance variable and In
 * stance methods null pointer exception is not applicable for static variables and static methods
 * 
 * */
