package StringProblems;

public class PalindromeCheck {
	public static void main(String[] args) {
		String str = "madam";

		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				System.out.println("its not a palindrome");
				break;
			}
			left++;
			right--;
			System.out.println("it is a palindrome");
		}

		
	}
}
