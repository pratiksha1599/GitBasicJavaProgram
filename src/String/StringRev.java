package String;

public class StringRev {

	/*
	 * 
	 * r= str.charAt()
	 * 
	 * 
	 * //
	 */public static void main(String[] args) {
//		char ch;
//		String str = "ABCD";
//		int len = str.length();
//		String rev = "";
//		for (int i = 0; i < str.charAt(i); i++) {
//			ch = str.charAt(i);
//			rev = ch + rev;
//
//		}
//		System.out.println(rev);

		String str = "ABCD ko";
		String rev = "";

		/*
		 * for(int i = str.length()-1;i>=0;i--) { rev = rev +str.charAt(i); //d //dc
		 * //dcb //dcba } System.out.println(rev);
		 */

		/*
		 * 2. using Character Array
		 */

		char a[] = str.toCharArray();
		int len = a.length;
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + a[i];
		}
		System.out.println(rev);
	}
}
