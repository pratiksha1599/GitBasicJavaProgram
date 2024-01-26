package ArrayPractice1;

import java.util.Arrays;
import java.util.Collections;

public class SortingElements {
	public static void main(String[] args) {

		// Approach 1
		int arr[] = { 20, 60, 50, 40, 30 };
		System.out.println("Arrays elements before sorting:" + Arrays.toString(arr));
		Arrays.parallelSort(arr);

		System.out.println("Arrays after sorting;" + Arrays.toString(arr));

		// Approach 2
		System.out.println("_________________________________");
		int a[] = { 20, 10, 30, 22, 12 };
		System.out.println("Array element before sorting:" + Arrays.toString(a));

		Arrays.sort(a);
		System.out.println("Array element after sorting:" + Arrays.toString(a));

		System.out.println("---------------------------------------------");

		// Reverse descending order
		// collections.reverseorder is not supporting primitive data type so use derived
		// data type
		Integer a1[] = { 30, 50, 20, 10, 60 };
		System.out.println("Array elemnet before sorting:" + Arrays.toString(a1));

		Arrays.sort(a1, Collections.reverseOrder());
		System.out.println("Array element after sorting desending order:" + Arrays.toString(a1));

	}
}
