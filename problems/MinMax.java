package problems;

public class MinMax {
	public static void main(String[] args) {
		int arr[] = { 5, 2, 9, 1, 6 };
		int min = arr[0];
		int max = arr[0];

		for (int n : arr) {
			if (n < min) {
				min = n;
			}

			if (n > max) {
				max = n;
			}
		}
		System.out.println("Min: " + min + " Max: " + max);
	}
}
