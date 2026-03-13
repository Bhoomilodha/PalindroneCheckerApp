# PalindromeChecker App

## Objective
To extend the console-based PalindromeChecker App in Java by applying the **Strategy Design Pattern**, enabling dynamic selection of different palindrome validation algorithms at runtime. This reinforces concepts of **interfaces, polymorphism, and extensible algorithm design**.

## Flow of Project

1. UC12.1 – Define Strategy Interface**
   - Create `PalindromeStrategy` interface.
   - Declares `checkPalindrome(String input)` method.
   - Establishes a contract for all palindrome algorithms.

2. UC12.2 – Implement Concrete Strategies**
   - StackStrategy → Uses LIFO stack to reverse and compare.
   - DequeStrategy → Uses double-ended queue for front/back comparison.
   - TwoPointerStrategy → Uses array indices for efficient comparison.

3. UC12.3 – Context Class (PalindromeChecker)**
   - Holds a reference to `PalindromeStrategy`.
   - Delegates palindrome validation to the injected strategy.
   - Demonstrates polymorphism.

4. UC12.4 – Runtime Injection & Execution**
   - User chooses algorithm at runtime.
   - Strategy is injected into `PalindromeChecker`.
   - Executes chosen algorithm and displays result.

## Use Cases Summary

- UC12.1: Define common interface for palindrome algorithms.
- UC12.2: Implement multiple strategies (Stack, Deque, Two-Pointer).
- UC12.3: Context class delegates to chosen strategy.
- UC12.4: Runtime selection of algorithm + result display.

## Key Concepts in UC12
- Interface → Defines contract for algorithms.
- Polymorphism → Different strategies implement same interface.
- Strategy Pattern → Enables dynamic algorithm interchangeability.
- Data Structures → Stack, Deque, Array indices.
- Extensibility → Easy to add new strategies without modifying existing code.

