/**
 * ============================================================
 * MAIN CLASS – UseCase7PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 7: Deque-Based Optimized Palindrome Checker
 *
 * Description:
 * This class validates whether a string is a palindrome
 * using a Deque (Double Ended Queue).
 *
 * Characters are inserted into the deque and then
 * compared by removing elements from both the front
 * and rear until the deque becomes empty or a mismatch
 * is found.
 *
 * Key Concepts:
 * - Deque (Double Ended Queue)
 * - Front and Rear Access
 * - Optimized Data Handling
 *
 * Data Structure: Deque
 *
 * @bhoomi Developer
 * @version 7.0
 */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }
}