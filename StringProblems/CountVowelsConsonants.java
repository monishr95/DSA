package StringProblems;

public class CountVowelsConsonants {
	public static void main(String[] args) {
		String str = "Hello World";

		int vowels = 0;
		int consonants = 0;

		// Convert to lowercase for easy checking
		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			// Check if character is a letter
			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels++;
				} else {
					consonants++;
				}
			}
		}

		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
	}
}
