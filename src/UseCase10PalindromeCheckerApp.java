public class UseCase10PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        // Normalize string: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {

            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome (ignoring case and spaces).");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }
}
