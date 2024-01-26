package ArrayPractice1;

/*  java program to sort an array in ascending order elements will be sorted in such a way that the smallest element will appear on exterme left
 * 
 */
public class SortArrayInAscendingOrder {
	public static void main(String[] args) {
		int arr[] = { 89, 23, 45, 21, 1 };
		int temp = 0;
		System.out.println("Array before sorting:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		for (int i = 0; i < arr.length ; i++) {
			for (int j = i + 1; j <arr.length ; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}

		}
		System.out.println("Sorted array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

}
