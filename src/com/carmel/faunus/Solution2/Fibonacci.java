package com.carmel.faunus.Solution2;

public class Fibonacci {
    /**
     * Recursively find Fibonacci numbers
     *
     * @param n - number of Fibonacci numbers
     * @return - Fibonacci number
     */
    public static int recursively(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return recursively(n - 1) + recursively(n - 2);
        }
    }
}
