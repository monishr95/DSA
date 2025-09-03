package StringProblems;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        char[] chars = str.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        String reversed = "";
        for (int i = 0; i < chars.length; i++) {
            reversed = reversed + chars[i];
        }

        System.out.println("Reversed String: " + reversed);
    }
}

