package arrayDSA;

//right rotate an array by D places
public class Problem5 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3; // rotate right by 3

		k = k % arr.length;
//		if k=9 then 9%7 is 2so the value of k=2 even if the value of k=9 result will be the same
		RotateArrayRight(arr, 0, arr.length - 1);
		RotateArrayRight(arr, 0, k - 1);
		RotateArrayRight(arr, k, arr.length - 1);

		System.out.print("Array after rotation: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void RotateArrayRight(int[] arr, int start, int end) {
		while (start < end) {

			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
	}
}
//Array after rotation: 5 6 7 1 2 3 4 