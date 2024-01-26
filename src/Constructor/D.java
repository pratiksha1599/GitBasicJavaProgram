package Constructor;

/*
 * Constructor overloading:  
 */
class B {

	int a;
	double b;
	String c;

	B() {
		a = 100;
		b = 45.32;
		c = "ankit";
	}

	B(int x, double d) {
		a = x;
		b = d;
	}

	B(double y, String z) {
		b = y;
		c = z;

	}

}

public final class D {
	public static void main(String[] args) {
		B bobj = new B();
		B bobj2 = new B(12, 23.4);
		B bobj3 = new B(245.67, "ASD");

		System.out.println(bobj.a + " " + bobj.b + " " + bobj.c);

		System.out.println(bobj2.a + " " + bobj2.b);

		System.out.println(bobj3.b + " " + bobj.c);
	}

}
