package objects;

public class Program2 {
	public static void main(String[] args) {
		int arr[] = { 10, 15, 20, 25, 30, 35, 40, 45, 50, 55 };
		int key = 50;
		int answer = binarySearch(arr, key);
		if (answer >= 0) {
			System.out.println("key is found at " + answer);
		} else {
			System.out.println("key not found");
		}
	}

	private static int binarySearch(int nums[], int key) {
		int low = 0;
		int high = nums.length - 1;
		int mid;
		while (high >= low) {
			mid = (low + high) / 2;
			if (key == nums[mid]) {
				return mid;
			} else if (key > nums[mid]) {
				low = mid + 1;
			} else {
				high = mid + 1;
			}
		}
		return -1;
	}
}
