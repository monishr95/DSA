package objects;

import java.util.Scanner;

public class TwoDimensionalJackedArray {

	public static void main(String[] args) {

		int arr[][] = new int[3][];
		arr[0] = new int[2];
		arr[1] = new int[4];
		arr[2] = new int[3];

		try (Scanner scan = new Scanner(System.in)) {
			for (int i = 0; i < arr.length; i++) { // Outer loop iterates through rows (0, 1, 2)
				for (int j = 0; j < arr[i].length; j++) { // Inner loop iterates through columns of the current row
					System.out.println("class " + i + " student " + j); // User prompt
					arr[i][j] = scan.nextInt(); // Reads integer input into the current cell
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}