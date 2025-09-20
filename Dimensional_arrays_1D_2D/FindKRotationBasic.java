package Dimensional_arrays_1D_2D;

public class FindKRotationBasic {
	static void rotate(int[] arr, int[] original) {
		int x = original[0];
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] == x) {
				System.out.println("it has rotated " + i + " times");
				break;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 4, 5, 1, 2, 3 };
		int[] original = { 1, 2, 3, 4, 5 };
		rotate(arr, original);
	}

}
/*
public class tUf {
    public static int findKRotation(int[] arr) {
        int n = arr.length; //size of array.
        int ans = Integer.MAX_VALUE, index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int ans = findKRotation(arr);
        System.out.println("The array is rotated " + ans + " times.");
    }
}
*/