package recursion_problems;

public class Fibonacci {
	public static void main(String[] args) {
		int n = 7;
		int first = 0, second = 1;

		System.out.print(first + " " + second);

		for (int i = 2; i < n; i++) {
			int next = first + second;
			System.out.print(" " + next);
			first = second;
			second = next;
		}
	}
}
//0 1 1 2 3 5 8

//0+1=1  1+1=2  1+2=3  2+3=5  3+5=8
