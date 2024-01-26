package Array;

import java.util.LinkedHashSet;

public class RemoveDuplicatesElementsfromArry {

	public static void removeduplicates(int[] a) {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

		// adding elements to LinkedHashset
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);

		}
		// Print the element of linkedhashset
		System.out.println("Removed Duplicates elements:" + set);
	}

//driver code
	public static void main(String[] args) {
		int a[] = { 1, 1, 3, 4, 2, 2, 3, 8, 8 };

		removeduplicates(a);

	}
}
