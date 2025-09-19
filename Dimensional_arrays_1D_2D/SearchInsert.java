package Dimensional_arrays_1D_2D;

/*
Input Format: arr[] = {1,2,4,7}, x = 6
Result: 3
Explanation: 6 is not present in the array. So, if we will insert 6 in the 3rd index(0-based indexing),
the array will still be sorted. {1,2,4,6,7}.
*/

public class SearchInsert {

	public static int searchInsert(int[] arr, int x) {
		int n = arr.length; // size of the array
		int low = 0;
		int high = n - 1;
		int ans = n;

		while (low <= high) {
			int mid = (low + high) / 2;
			// maybe an answer
			if (arr[mid] >= x) {
				ans = mid;
				// look for smaller index on the left
				high = mid - 1;
			} else {
				low = mid + 1; // look on the right
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 7 };
		int x = 6;
		int ind = searchInsert(arr, x);
		System.out.println("The index is: " + ind);
	}
}
