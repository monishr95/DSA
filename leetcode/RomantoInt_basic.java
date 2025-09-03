package leetcode;

public class RomantoInt_basic {
	// Helper function to get the value of a Roman numeral character
	private int getValue(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0; // Should not happen for valid input
		}
	}

	public int romanToInt(String s) {
		// Initialize the result with the value of the last character
		int result = getValue(s.charAt(s.length() - 1));

		// Iterate through the string from the second-to-last character to the first
		for (int i = s.length() - 2; i >= 0; i--) {
			// If the current numeral is smaller than the next one, subtract it
			if (getValue(s.charAt(i)) < getValue(s.charAt(i + 1))) {
				result = result - getValue(s.charAt(i));
			}
			// Otherwise, add it to the result
			else {
				result = result + getValue(s.charAt(i));
			}
		}
		return result;
	}
}
