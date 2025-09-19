package Dimensional_arrays_1D_2D;

public class UpperBoundBasic {
	static int upperBound(int[] arr, int n, int x) {
		for (int i = 0; i < n; i++) {
			if (arr[i] > x) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 5, 8, 9, 15, 19 };
		int n = 5;
		int x = 9;

		System.out.println(upperBound(arr, n, x));
	}

}
