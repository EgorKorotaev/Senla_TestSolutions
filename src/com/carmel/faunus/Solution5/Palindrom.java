package com.carmel.faunus.Solution5;

public class Palindrom {
    /**
     * Compare the original string with the inverted one
     *
     * @param str - string to check
     * @return - true if palindrom
     */
    public static boolean isPalindrom(String str) {
        String reversed = new StringBuilder(str).reverse().toString();

        return str.equals(reversed);
    }
}
