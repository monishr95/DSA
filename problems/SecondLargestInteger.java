package problems;

public class SecondLargestInteger {

	public static Integer findSecondLargest(int[] arr) {
		if (arr == null || arr.length < 2) {
			System.out.println("Array must contain at least two elements.");
			return null; // Or throw an IllegalArgumentException
		}

		// Initialize largest and secondLargest.
		// A common strategy is to sort the first two distinct elements, or
		// use Integer.MIN_VALUE as sentinels.
		// Let's use Integer.MIN_VALUE for robustness.
		int largest = 0;
		int secondLargest = 0;

		// An alternative robust initialization for distinct numbers
		// This handles cases like [5, 5, 5, 2] correctly
		// Find initial largest and second largest from first two elements
		if (arr[0] > arr[1]) {
			largest = arr[0];
			secondLargest = arr[1];
		} else if (arr[1] > arr[0]) { // Ensures they are distinct or correctly ordered
			largest = arr[1];
			secondLargest = arr[0];
		} else { // arr[0] == arr[1], need to find the first distinct value for secondLargest
			largest = arr[0]; // Both are the same, so this is the current largest
			// secondLargest remains Integer.MIN_VALUE until a smaller distinct number is
			// found
		}

		for (int i = 0; i < arr.length; i++) { // Iterate through all elements

			if (arr[i] > largest) {
				secondLargest = largest; // The old largest becomes the new second largest
				largest = arr[i]; // Current element is the new largest
			} 
			else if (arr[i] > secondLargest && arr[i] != largest) {
				// If currentElement is smaller than largest, but greater than secondLargest,
				// and it's not a duplicate of largest
				secondLargest = arr[i];
			}
		}

		// Check if a valid second largest was found (i.e., it's not still the sentinel
		// value
		// and it's not equal to the largest, which happens if all elements are the
		// same)
		if (secondLargest == 0 || secondLargest == largest) {
			// This happens if all elements are the same (e.g., [5, 5, 5])
			// or if there's only one unique number type larger than MIN_VALUE.
			System.out.println("Could not find a distinct second largest number.");
			return null;
		}

		return secondLargest;
	}

	public static void main(String[] args) {
		int[] arr1 = { 3, 1, 8, 4, 2, 9, 5 }; // Expected: 8
		System.out
				.println("Array: " + java.util.Arrays.toString(arr1) + ", Second Largest: " + findSecondLargest(arr1));

		int[] arr2 = { 10, 8, 10, 6 }; // Expected: 8 (distinct)
		System.out
				.println("Array: " + java.util.Arrays.toString(arr2) + ", Second Largest: " + findSecondLargest(arr2));

		int[] arr3 = { 5, 5, 5, 5 }; // Expected: null (no distinct second largest)
		System.out
				.println("Array: " + java.util.Arrays.toString(arr3) + ", Second Largest: " + findSecondLargest(arr3));

		int[] arr4 = { 7, 7, 7, 3, 7, 4 }; // Expected: 4
		System.out
				.println("Array: " + java.util.Arrays.toString(arr4) + ", Second Largest: " + findSecondLargest(arr4));

		int[] arr5 = { -1, -5, -3, -2 }; // Expected: -2
		System.out
				.println("Array: " + java.util.Arrays.toString(arr5) + ", Second Largest: " + findSecondLargest(arr5));

		int[] arr6 = { 1 }; // Expected: null (less than 2 elements)
		System.out
				.println("Array: " + java.util.Arrays.toString(arr6) + ", Second Largest: " + findSecondLargest(arr6));

		int[] arr7 = {}; // Expected: null (less than 2 elements)
		System.out
				.println("Array: " + java.util.Arrays.toString(arr7) + ", Second Largest: " + findSecondLargest(arr7));

		int[] arr8 = { 1, 2 }; // Expected: 1
		System.out
				.println("Array: " + java.util.Arrays.toString(arr8) + ", Second Largest: " + findSecondLargest(arr8));
	}
}
