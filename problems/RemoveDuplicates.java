package problems;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 2, 3, 4, 4 };
		int n = arr.length;

		int j = 0;
		for (int i = 0; i < n - 1; i++)
			if (arr[i] != arr[i + 1]) {
				arr[j] = arr[i];
				j++;
			}
		
		//the last digit is missing so we will use this to get the correct result.
		arr[j] = arr[n - 1];
		j++;

		for (int i = 0; i < j; i++)
			System.out.print(arr[i] + " ");
	}
}
