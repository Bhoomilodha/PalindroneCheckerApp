import java.util.Scanner;   // Needed for user input
import java.util.Stack;     // Needed for stack-based palindrome check

/**
 * ============================================================
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Demonstrates palindrome validation using OOPS principles:
 * - Encapsulation
 * - Single Responsibility Principle
 * - Data Structures (Stack / Array)
 *
 * @author Bhoomi
 * @version 11.0
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalindromeService service = new PalindromeService();

        System.out.println("Enter a string to check palindrome:");
        String input = sc.nextLine();

        // Choose which method to use
        boolean resultStack = service.checkPalindromeStack(input);
        boolean resultArray = service.checkPalindromeArray(input);

        System.out.println("\nUsing Stack Approach:");
        System.out.println("Is Palindrome? : " + resultStack);

        System.out.println("\nUsing Two-Pointer Array Approach:");
        System.out.println("Is Palindrome? : " + resultArray);

        sc.close();
    }
}
class PalindromeService {

    public boolean checkPalindromeStack(String input) {
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();
        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return normalized.equals(reversed.toString());
    }

    public boolean checkPalindromeArray(String input) {
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}