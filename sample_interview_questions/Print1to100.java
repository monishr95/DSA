package sample_interview_questions;

/*
Q3) Write a program to print numbers from 1 to 100 without using loops.

✅ Logic:
1. Normally we use for/while loops, but here we cannot.
2. Use **recursion**:
   - Create a method printNumbers(int n)
   - Base case: if n > 100 → stop
   - Otherwise: print n and call printNumbers(n+1)
*/

public class Print1to100 {
	public static void main(String[] args) {
		printNumbers(1); // Start from 1
	}

	static void printNumbers(int n) {
		if (n > 100) {
			return; // base case
		}
		System.out.print(n + " ");
//		n++;
		printNumbers(n + 1); // recursive call
	}
}
