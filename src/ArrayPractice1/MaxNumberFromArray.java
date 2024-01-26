package ArrayPractice1;

public class MaxNumberFromArray {
	public static void main(String[] args) {

		// Max number
		/*
		 * int arr[] = {12,23,13,4,5}; int max=arr[0]; for(int i=0;i<arr.length;i++) {
		 * if(arr[i]>max) { max=arr[i];
		 * 
		 * }
		 * 
		 * } System.out.println("Maximum element from an array:"+max);
		 */
		// min number
		int arr[] = { 12, 23, 13, 4, 5 };
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Minimum element from an array:" + min);

	}

}
