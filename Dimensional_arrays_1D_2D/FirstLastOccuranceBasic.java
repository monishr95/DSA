package Dimensional_arrays_1D_2D;

public class FirstLastOccuranceBasic {
	static int[] firstLast(int[] arr, int target, int n) {
		int[] res = { -1, -1 };
		for (int i = 0; i < n; i++) {
			if (arr[i] == target) {
				int first = i;
				res[0] = first;
				break;
			}
		}
		for (int j = n - 1; j >= 0; j--) {
			if (arr[j] == target) {
				int last = j;
				res[1] = last;
				break;
			}
		}

		return res;
	}

	public static void main(String[] args) {
		int n = 7;
		int target = 13;
		int[] arr = { 3, 4, 13, 13, 13, 20, 40 };

		int[] ans = firstLast(arr, target, n);

		if (ans[0] != -1 && ans[1] != -1) {
			System.out.println("The first occurrence is at index: " + ans[0]);
			System.out.println("The last occurrence is at index: " + ans[1]);
		} else {
			System.out.println("The target " + target + " was not found in the array.");
		}
	}

}
