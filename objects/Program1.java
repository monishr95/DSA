//write a java program to search for an element using linear search

package objects;

public class Program1 {
	public static void main(String[] args) {
		int arr[] = { 40, 30, 10, 50, 20 };
		int key = 10;
		int answer = linearSearch(arr, key);
		if (answer >= 0) {
			System.out.println("key is found at " + answer);
		} else {
			System.out.println("key not found");
		}
	}

	private static int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

}
