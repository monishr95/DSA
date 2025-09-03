package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void romanToInt(String s) {
		// Create a map to store the integer values of Roman numerals
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		// Initialize the result with the value of the last character
		int result = map.get(s.charAt(s.length() - 1));

		// Iterate through the string from the second-to-last character to the first
		for (int i = s.length() - 2; i >= 0; i--) {
			// If the current numeral is smaller than the next one, subtract it
			if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
				result = result - map.get(s.charAt(i));
			}
			// Otherwise, add it to the result
			else {
				result = result + map.get(s.charAt(i));
			}
		}

		System.out.println(result);
	}

	public static void main(String[] args) {
		String s = "MCMXCIV";
		romanToInt(s);
	}
}

//result = 5
//result = 5 - 1 = 4
//result = 4 + 100 = 104
//result = 104 - 10 = 94
//result = 94 + 1000 = 1094
//result = 1094 - 100 = 994
//result = 994 + 1000 = 1994