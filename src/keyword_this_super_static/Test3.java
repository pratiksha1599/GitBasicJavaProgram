package keyword_this_super_static;

class P {
	P() {
		this(10);
		System.out.println("P-con");
	}

	P(int i) {
		this(22.3f);
		System.out.println("P-int paramater con");
	}

	P(float f) {
		System.out.println("f-float parameter con");
	}

}

public class Test3 {
	public static void main(String[] args) {
		P p = new P();

	}

}
