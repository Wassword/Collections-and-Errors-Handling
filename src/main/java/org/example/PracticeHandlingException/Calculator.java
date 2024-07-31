package org.example.PracticeHandlingException;
public class Calculator {

    // Method to calculate factorial
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Invalid input: Factorial is only defined for non-negative integers.");
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Method to calculate binomial coefficient
    public int binomialCoefficient(int n, int k) {
        if (n < 0 || k < 0 || k > n) {
            throw new IllegalArgumentException("Invalid input: Ensure n >= 0, k >= 0, and k <= n.");
        }

        return factorial(n) / (factorial(k) * factorial(n - k));
    }

}
