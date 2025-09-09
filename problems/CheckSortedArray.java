package problems;

public class CheckSortedArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 }; // Try changing values

		boolean isSorted = true;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				isSorted = false;
				break;
			}
		}

		if (isSorted) {
			System.out.println("The array is sorted in ascending order.");
		} else {
			System.out.println("The array is NOT sorted in ascending order.");
		}
	}
}
