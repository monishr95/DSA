package arrayDSA;

//Largest Element in an Array
public class Problem1 {

	public static void main(String args[]) {

		int arr1[] = { 2, 5, 1, 3, 0 };
		System.out.println("The Largest element in the array is: " + findLargestElement(arr1));

		int arr2[] = { 8, 10, 5, 7, 9 };
		System.out.println("The Largest element in the array is: " + findLargestElement(arr2));

	}

	static int findLargestElement(int arr[]) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		// using for each loop
//		for (int x : arr) {
//			if (x > max) {
//				max = x;
//			}
//		}
		return max;
	}
}
