package keyword_this_super_static;
//this keyword
//------------------
//this is a java keyword , it can be used to represent current class object
/* To refere current clas variables
 * To refer current class methods
 * To refer current class constructors
 * To return curremt class object
 * 
 * 
 */
class A {
	int i = 10;
	int j = 20;

	A(int i, int j) {
		System.out.println("Local var :" + i + "  " + j);
		System.out.println("Instance var :" + this.i + " " + this.j);
	}
}

public class Test {
	public static void main(String[] args) {
		A a = new A(30, 40);
	}
}
