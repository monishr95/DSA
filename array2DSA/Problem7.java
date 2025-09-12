package array2DSA;

//Rearrange Array Elements by Sign

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements. Without altering the relative order of positive and negative elements, you must return an array of alternately positive and negative values.
public class Problem7 {
	public static void main(String[] args) {
		// Array Initialization.
		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, -4, -5));
		ArrayList<Integer> ans = RearrangebySign(A);

		for (int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i) + " ");
		}
	}

	public static ArrayList<Integer> RearrangebySign(ArrayList<Integer> A) {
		int n = A.size();

		// Define array for storing the ans separately.
		ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));

		// positive elements start from 0 and negative from 1.
		int posIndex = 0, negIndex = 1;
		for (int i = 0; i < n; i++) {

			// Fill negative elements in odd indices and inc by 2.
			if (A.get(i) < 0) {
				ans.set(negIndex, A.get(i));
				negIndex += 2;
			}

			// Fill positive elements in even indices and inc by 2.
			else {
				ans.set(posIndex, A.get(i));
				posIndex += 2;
			}
		}

		return ans;
	}
}
