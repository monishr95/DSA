package arrayDSA;

public class Problem3 {
	static boolean CheckSortedArray(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1])
				return false;
		}

		return true;
	}

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 5 };

		boolean result = CheckSortedArray(arr);
		if (result) {
			System.out.println("the array is in sorted order");
		} else {
			System.out.println("the array is not in sorted order");
		}
	}
}
