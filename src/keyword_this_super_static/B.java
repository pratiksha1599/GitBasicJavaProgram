package keyword_this_super_static;

class ExSuper {
	int i = 10;
}

public class B extends ExSuper {
	int i = 20;

	void show(int i) {
		System.out.println(i);
		System.out.println("super class instance :" + super.i);
		System.out.println("Current class instance variable:" + this.i);
	}

	public static void main(String[] args) {
		B obj = new B();
		obj.show(30);

	}
}
