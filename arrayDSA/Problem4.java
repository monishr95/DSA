package arrayDSA;

public class Problem4 {

	static int removeDuplicates(int[] arr) {
		int j = 0;
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			if (arr[i] != arr[i + 1]) {
				arr[j] = arr[i];
				j++;
			}

		// the last digit is missing so we will use this to get the correct result.
		arr[j] = arr[n - 1];
		j++;
		return j;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 2, 2, 3, 3, 4 };
		int k = removeDuplicates(arr);
		System.out.println("The array after removing duplicate elements is ");
		for (int i = 0; i < k; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
