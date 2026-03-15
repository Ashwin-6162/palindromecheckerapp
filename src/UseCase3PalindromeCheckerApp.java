public class UseCase3PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "madam";
        String reversed = "";

        // iterate from last character to first
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // compare original and reversed
        if (input.equals(reversed)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}

