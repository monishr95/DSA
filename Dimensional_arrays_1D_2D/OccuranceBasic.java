package Dimensional_arrays_1D_2D;

public class OccuranceBasic {
	static int occurance(int[] arr, int x, int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == x) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int n = 8;
		int x = 2;
		int[] arr = { 1, 1, 2, 2, 2, 2, 2, 3 };
		System.out.println(occurance(arr, x, n));
	}

}
