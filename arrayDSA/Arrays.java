package arrayDSA;

public class Arrays {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);

		for (int i = 0; i < arr.length; i++) {// for loop
			System.out.println(arr[i]);
		}

		int j = 0;
		while (j < arr.length) {// while loop
			System.out.println(arr[j]);
			j++;
		}

		int k = 0; // do while
		do {
			System.out.println(arr[k]);
			k++;
		} while (k < arr.length);

		for (int x : arr) {// for each loop
			System.out.println(x);
		}

	}

}
