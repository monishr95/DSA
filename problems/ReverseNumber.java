package problems;

public class ReverseNumber {
	public static void main(String[] args) {
		int num = 1234;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		System.out.println(rev);
	}
}
/*
 * Iteration 1
 * 
 * digit = 1234 % 10 = 4
 * 
 * rev before = 0
 * 
 * rev = 0 * 10 + 4 = 0 + 4 = 4
 * 
 * num = 1234 / 10 = 123 (integer division)
 * 
 * After: num = 123, rev = 4
 * 
 * Iteration 2
 * 
 * digit = 123 % 10 = 3
 * 
 * rev before = 4
 * 
 * rev = 4 * 10 + 3 = 40 + 3 = 43
 * 
 * num = 123 / 10 = 12
 * 
 * After: num = 12, rev = 43
 */