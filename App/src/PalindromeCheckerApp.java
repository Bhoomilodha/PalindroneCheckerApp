/**
 * ============================================================
 * MAIN CLASS – UseCase9PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using recursion.
 *
 * The recursive method compares characters from the
 * start and end positions and moves inward until the
 * base condition is met.
 *
 * Key Concepts:
 * - Recursion
 * - Base Condition
 * - Call Stack
 *
 * Data Structure: Call Stack
 *
 * @bhoomi Developer
 * @version 9.0
 */

import java.util.Scanner;

public class PalindromeCheckerApp {

    public static boolean isPalindromeRecursive(String str, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        boolean result;

        if (input == null || input.length() <= 1) {
            result = true;
        } else {
            result = isPalindromeRecursive(input, 0, input.length() - 1);
        }

        System.out.println("Is Palindrome? : " + result);

        scanner.close();
    }
}