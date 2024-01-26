package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountCharFromString {
	public static void main(String[] args) {

		System.out.println("Enter any String:");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		// System.out.println("Entered string is:" + s);

		// Apply the logic
		// replace the whitsspace
		s = s.replace(" ", "");
		// Make the string into chararray
		char arr[] = s.toCharArray();// convert string into chararry
		int count = 0;

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			map.put(arr[i], count);

		}
		System.out.println(map);

	}
}
