package objects;

import java.util.Scanner;

public class ThreeDimensionalArray {
	public static void main(String[] args) {
		int arr[][][] = new int[3][2][3];

		try (Scanner sc = new Scanner(System.in)) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					for (int k = 0; k < arr[i][j].length; k++) {
						System.out.println("school " + i + " class " + j + " student " + k);
						arr[i][j][k] = sc.nextInt();
					}
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(" ");
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.print(arr[i][j][k]);
					System.out.print(" ");
				}
			}
		}
	}
}
