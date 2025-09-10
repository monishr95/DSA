package arrayDSA;

//Second Largest and smallest Element in an Array without sorting
public class Problem2 {
	static private int secondSmallest(int[] arr, int n) {
		if (n < 2) {
			return -1;
		}
		int small = Integer.MAX_VALUE;
		int second_small = Integer.MAX_VALUE;
		int i;
		for (i = 0; i < n; i++) {
			if (arr[i] < small) {
				second_small = small;
				small = arr[i];
			} else if (arr[i] < second_small && arr[i] != small) {
				second_small = arr[i];
			}
		}
		return second_small;
	}

	static private int secondLargest(int[] arr, int n) {
		//if the size of the array is 1 or 0 then there wont be a second value to compare..
		if (n < 2)
			return -1;
		int large = Integer.MIN_VALUE;
		int second_large = Integer.MIN_VALUE;
		int i;
		for (i = 0; i < n; i++) {
			if (large < arr[i]) {
				second_large = large;
				large = arr[i];
			}

			else if (arr[i] > second_large && arr[i] != large) {
				second_large = arr[i];
			}
		}
		return second_large;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 7, 7, 5 };
		int n = arr.length;
		int sS = secondSmallest(arr, n);
		int sL = secondLargest(arr, n);
		System.out.println("Second smallest is " + sS);
		System.out.println("Second largest is " + sL);
	}

}
