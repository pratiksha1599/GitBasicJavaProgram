package ArrayPractice1;

public class RevArray {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 2, 4, 5 };
		System.out.println("Elements before rev");
		for (int i = 0; i <= arr.length-1; i++) {

			System.out.println(arr[i]);

		}

		System.out.println("Elemnts after rev");
		for (int i = arr.length-1; i >=0; i--) {
			System.out.println(arr[i]);
		}
	}
}
