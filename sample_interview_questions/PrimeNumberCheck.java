package sample_interview_questions;

public class PrimeNumberCheck {

	static boolean checkPrime(int n) {

		int count = 0;
		// Loop through numbers from 1
		// to the square root of n.
		for (int i = 1; i <= Math.sqrt(n); i++) {

			if (n % i == 0) {

				count = count + 1;
				// If n is not a perfect square,
				// count its reciprocal factor.
				if (n / i != i) {
					count = count + 1;
				}
			}
		}
		// If the number of
		// factors is exactly 2.
		if (count == 2) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int n = 1483;
		boolean isPrime = checkPrime(n);
		if (isPrime) {
			System.out.println(n + " is a prime number.");
		} else {
			System.out.println(n + " is not a prime number.");
		}
	}
}
