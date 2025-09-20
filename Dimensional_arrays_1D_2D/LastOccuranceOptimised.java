package Dimensional_arrays_1D_2D;

public class LastOccuranceOptimised {
	public static int solve(int n, int key, int[] arr) {
		int low = 0;
		int high = n - 1;
		int res = -1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == key) {
				res = mid;
				low = mid + 1;

			} else if (key < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return res;
	}

	public static void main(String args[]) {
		int n = 7;
		int key = 13;
		int[] arr = { 3, 4, 13, 13, 13, 20, 40 };

		// returning the last occurrence index if the element is present otherwise -1
		System.out.println(solve(n, key, arr));
	}
}
