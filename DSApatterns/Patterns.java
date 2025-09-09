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

//	private static void pattern1(int n) {
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n-i-1; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < (2*i)+1; j++) {
//				System.out.print("*");
//			}
//			for (int j = 0; j < n-i-1; j++) {
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
//		output
//		    *    
//		   ***   
//		  *****  
//		 ******* 
//		*********
//	}

//	private static void pattern1(int n) {
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < (2*n)-(2*i+1); j++) {
//				System.out.print("*");
//			}
//			for (int j = 0; j <=i; j++) {
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
//		output
//		 ********* 
//		  *******  
//		   *****   
//		    ***    
//		     *     
//	}

//	private static void pattern1(int n) {
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j <= n - i - 1; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < (2 * i) + 1; j++) {
//				System.out.print("*");
//			}
//			for (int j = 0; j <= n - i - 1; j++) {
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < (2 * n) - (2 * i + 1); j++) {
//				System.out.print("*");
//			}
//			for (int j = 0; j <= i; j++) {
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
//		output
//		     *     
//		    ***    
//		   *****   
//		  *******  
//		 ********* 
//		 ********* 
//		  *******  
//		   *****   
//		    ***    
//		     *     
//	}

//	private static void pattern1(int n) {
//		// Part 1: Print the increasing star pattern
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//		// Part 2: Print the decreasing star pattern
//		for (int i = n - 1; i >= 1; i--) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	output
//	*
//	**
//	***
//	****
//	*****
//	****
//	***
//	**
//	*
//	}

//	private static void pattern1(int n) {
//		for (int i = 1; i <= n; i++) {
//			// Determine the starting number for the current row
//			// If the row number is odd, start with 1.
//			// If the row number is even, start with 0.
//			int startNum = (i % 2 == 1) ? 1 : 0;
//
//			// Print the numbers for the current row
//			for (int j = 1; j <= i; j++) {
//				System.out.print(startNum);
//				// Flip the number for the next position
//				startNum = 1 - startNum;
//			}
//			System.out.println();
//		}
//		output
//		1
//		01
//		101
//		0101
//		10101
//	}

//	private static void pattern1(int n) {
//		int spaces = 2 * (n - 1);
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j);
//			}
//			for (int j = 1; j <= spaces; j++) {
//				System.out.print(" ");
//			}
//			for (int j = i; j > 0; j--) {
//				System.out.print(j);
//			}
//			spaces -= 2;
//			System.out.println();
//		}
//		output
//		1        1
//		12      21
//		123    321
//		1234  4321
//		1234554321
//
//	}

//	private static void pattern1(int n) {
//		int count = 0;
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print(count);
//				count++;
//			}
//			System.out.println();
//		}
//		output
//		0
//		1 2
//		3 4 5
//		6 7 8 9
//	}

//	private static void pattern1(int n) {
//		for (int i = 0; i < n; i++) {
//			for (char ch = 'A'; ch <= 'A' + i; ch++) {
//				System.out.print(ch + " ");
//
//			}
//			System.out.println();
//		}
//		output
//		A 
//		A B 
//		A B C 
//		A B C D 
//	}

//	private static void pattern1(int n) {
//		for (int i = n - 1; i >= 0; i--) {
//			for (char ch = 'A'; ch <= 'A' + i; ch++) {
//				System.out.print(ch + " ");
//
//			}
//			System.out.println();
//		}
//		output
//		A B C D 
//		A B C 
//		A B 
//		A 
//	}

//	private static void pattern1(int n) {
//		char ch = 'A';
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print(ch + " ");
//			}
//			ch++;
//			System.out.println();
//		}
//		output
//		A 
//		B B 
//		C C C 
//		D D D D 
//	}

	private static void pattern1(int N) {

		// Outer loop for the number of rows.
		for (int i = 0; i < N; i++) {

			// for printing the spaces.
			for (int j = 0; j < N - i - 1; j++) {
				System.out.print(" ");
			}

			// for printing the characters.
			char ch = 'A';
			int breakpoint = (2 * i + 1) / 2;
			for (int j = 1; j <= 2 * i + 1; j++) {

				System.out.print(ch);
				if (j <= breakpoint)
					ch++;
				else
					ch--;
			}

			// for printing the spaces again.
			for (int j = 0; j < N - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
//		output
//		    A   
//		   ABA  
//		  ABCBA 
//		 ABCDCBA
	}

	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		pattern1(n);
	}

}
