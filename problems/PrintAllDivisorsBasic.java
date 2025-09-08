package problems;

//i am not getting the result in array

//public static void main(String[] args) {
//	Scanner scan = new Scanner(System.in);
//	int num = scan.nextInt();
//	for (int i = 1; i <= num; i++) {
//		if (num % i == 0) {
//			System.out.println(i);
//		}
//	}
//}

//BRUTE FORCE;

public class PrintAllDivisorsBasic {

	public static int[] printDivisors(int n, int[] size) {
		// Allocate memory for
		// the array of divisors
		int[] divisors = new int[n];
		// Initialize the count of divisors
		int count = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				// Add the divisor to the array
				divisors[count++] = i;
			}
		}
		// Update the size parameter
		// with the count of divisors
		size[0] = count;
		// Return the array of divisors
		return divisors;
	}

	public static void main(String[] args) {
		int number = 12;
		int[] size = new int[1];
		int[] divisors = printDivisors(number, size);

		System.out.print("Divisors of " + number + " are: ");
		for (int i = 0; i < size[0]; i++) {
			System.out.print(divisors[i] + " ");
		}
		System.out.println();

		// Free dynamically allocated memory
		divisors = null;
	}
}

