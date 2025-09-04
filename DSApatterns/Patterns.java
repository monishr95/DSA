package DSApatterns;

import java.util.Scanner;

public class Patterns {

//	private static void pattern1(int n) {
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		output
//		****
//		****
//		****
//		****
//	}

//	private static void pattern1(int n) {
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		output
//		*
//		**
//		***
//		****
//	}

//	private static void pattern1(int n) {
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
//		output
//		0
//		11
//		222
//		3333
//		44444
//	}

//	private static void pattern1(int n) {
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//		output
//		0
//		01
//		012
//		0123
//		01234
//	}

//	private static void pattern1(int n) {
//		for (int i = 0; i <= n; i++) {
//			for (int j = 0; j <= n-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		output
//		*****
//		****
//		***
//		**
//		*
//	}

//	private static void pattern1(int n) {
//		for (int i = 0; i <= n; i++) {
//			for (int j = 0; j <= n-i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//		output
//		01234
//		0123
//		012
//		01
//		0
//	}

	private static void pattern1(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		pattern1(n);
	}

}
