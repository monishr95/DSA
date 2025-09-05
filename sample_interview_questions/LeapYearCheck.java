package sample_interview_questions;

/*
Q1) Write a Program to check given year is Leap Year or not without using modulus (%) operator.

✅ Logic:
1. Normally, leap year rule:
   - Divisible by 400 → Leap year
   - Else if divisible by 100 → Not leap year
   - Else if divisible by 4 → Leap year
   - Else → Not leap year

2. Since we cannot use '%' operator:
   - Check divisibility using (year / divisor) * divisor == year
     Example: (2024 / 4) * 4 == 2024 → divisible by 4
*/

import java.util.Scanner;

public class LeapYearCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();

		if ((year / 400) * 400 == year) {
			System.out.println("It is a Leap Year");
			System.out.println("executed in /400");

		} else if ((year / 100) * 100 == year) {
			System.out.println("It is not a Leap Year");
			System.out.println("executed in /100");

		} else if ((year / 4) * 4 == year) {
			System.out.println("It is a Leap Year");
			System.out.println("executed in /4");
		} else {
			System.out.println("It is not a Leap Year");
			System.out.println("executed in none");

		}

		sc.close();
	}
}
