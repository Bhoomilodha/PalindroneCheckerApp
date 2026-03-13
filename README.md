# PalindromeChecker App

## Objective
To build a console-based PalindromeChecker App in Java that validates whether a string is a palindrome, while reinforcing programming fundamentals, data structure concepts, and introducing **performance benchmarking**.

## Flow of Project

- UC13 – Performance Comparison
   - Runs multiple palindrome algorithms (Stack, Deque, Two-Pointer).
   - Captures execution start and end time using `System.nanoTime()`.
   - Calculates total execution duration.
   - Displays benchmarking results for each algorithm.
## Use Case Summary

- UC13.1: Input handling for test string.
- UC13.2: Execute multiple palindrome strategies.
- UC13.3: Capture execution time with `System.nanoTime()`.
- UC13.4: Display results and compare performance.

## Key Concepts in UC13

- System.nanoTime() → High-resolution timer for benchmarking.
- Algorithm Comparison → Evaluates trade-offs between stack, deque, and two-pointer approaches.
- Strategy Pattern → Enables interchangeable algorithms at runtime.
- Performance Insight → Highlights efficiency differences in time and space complexity.
