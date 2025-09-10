package arrayDSA;

//MoveZeros
public class Problem6 {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 3, 12 };

		int pos = 0; // index to place the next non-zero number

		// Step 1: Move non-zero elements forward
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[pos] = arr[i];
				pos++;
			}
		}

		// Step 2: Fill the rest with zeros
		while (pos < arr.length) {
			arr[pos] = 0;
			pos++;
		}

		// Output the array
		System.out.print("After moving zeros: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
