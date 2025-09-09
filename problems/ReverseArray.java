package problems;

public class ReverseArray {

	static void printArray(int arr[], int n) {
		System.out.print("Reversed array is:- \n");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		System.out.println("the original array is : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;

			left++;
			right--;
		}
		printArray(arr, arr.length);
	}
}
