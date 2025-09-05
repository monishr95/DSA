package sample_interview_questions;

/*
Q2) How can you determine whether a number is even or odd without using the modulus operator (%)?

✅ Logic:
1. Normally, even numbers → divisible by 2, odd → not divisible.
2. Since we cannot use '%':
   - Divide number by 2 → num / 2
   - Multiply back → (num / 2) * 2
   - If result == num → Even
   - Else → Odd
*/

import java.util.Scanner;

public class EvenOddCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		if ((num / 2) * 2 == num) {
			System.out.println("This is an Even Number");
		} else {
			System.out.println("This is an Odd Number");
		}

		sc.close();
	}
}
