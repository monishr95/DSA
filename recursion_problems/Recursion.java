package recursion_problems;

public class Recursion {
	static int count = 0;

	static void print() {

		// Base Condition.
		if (count == 3) {
			return;
		}
		System.out.println(count);

		// Count incremented.
		count = count + 1;
		print();

	}

	public static void main(String[] args) {
		print();
	}
}
