package String;

public class StringEx {
	public static void main(String[] args) {

		String s1 = new String("Pratiksha");
		String s2 = new String("Pratiksha");

		// s1 and s2 are poininting to two different objects
		// == used for reference/address comparison

		System.out.println(s1 == s2);
		String s3 = "Cat";
		String s4 = "Cat";
		System.out.println(s3 == s4); // true s3 and s4 pointing to same object
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s2)); //true // equals method used for ccontent check

	}
}
