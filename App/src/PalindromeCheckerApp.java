/**
 * ============================================================
 * MAIN CLASS – UseCase10PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 10: Case-Insensitive & Space-Ignored Palindrome
 *
 * Description:
 * This class validates whether a string is a palindrome
 * by ignoring spaces and letter case.
 *
 * The input string is first normalized by:
 * - Removing spaces using regular expressions
 * - Converting all characters to lowercase
 *
 * Then symmetric characters are compared from both ends.
 *
 * Key Concepts:
 * - String Preprocessing
 * - Regular Expressions
 * - Symmetric Character Comparison
 *
 * Data Structure: String / Array
 *
 * @bhoomi Developer
 * @version 10.0
 */

import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Normalize string: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {

            // Compare symmetric characters
            if (normalized.charAt(i) !=
                    normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }
}