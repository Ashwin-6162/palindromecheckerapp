import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

public class UseCase13PalindromeCheckerApp {

    // Stack based palindrome check
    static boolean stackPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return input.equals(reversed);
    }

    // Deque based palindrome check
    static boolean dequePalindrome(String input) {

        Deque<Character> deque = new LinkedList<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {

            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }

    // Recursive palindrome check
    static boolean recursivePalindrome(String str, int start, int end) {

        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return recursivePalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String input = "level";

        // Stack timing
        long start1 = System.nanoTime();
        boolean result1 = stackPalindrome(input);
        long end1 = System.nanoTime();

        // Deque timing
        long start2 = System.nanoTime();
        boolean result2 = dequePalindrome(input);
        long end2 = System.nanoTime();

        // Recursive timing
        long start3 = System.nanoTime();
        boolean result3 = recursivePalindrome(input, 0, input.length() - 1);
        long end3 = System.nanoTime();

        System.out.println("Input: " + input);
        System.out.println();

        System.out.println("Stack Method: " + result1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Deque Method: " + result2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Recursive Method: " + result3 +
                " | Time: " + (end3 - start3) + " ns");
    }
}
