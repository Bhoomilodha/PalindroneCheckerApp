import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Define the input string to validate
        String input = "civic";

        // Create a queue to store characters in FIFO order
        Queue<Character> queue = new LinkedList<>();

        // Create a stack to store characters in LIFO order
        Stack<Character> stack = new Stack<>();

        // Insert characters into both data structures
        for (char c : input.toCharArray()) {
            queue.add(c);      // Enqueue
            stack.push(c);     // Push
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare dequeue (FIFO) with pop (LIFO)
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}