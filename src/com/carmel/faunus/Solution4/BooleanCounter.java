package com.carmel.faunus.Solution4;

public class BooleanCounter {
    /**
     * True, if exactly two of the four truths
     *
     * @param arr array of boolean values
     * @return result
     */
    public static boolean twoOfFour(boolean... arr) {
        final int capacity = 4;
        final int expected = 2;

        int counter = 0;

        if (arr.length != capacity) {
            throw new IllegalArgumentException("Only 4 parameters");
        }

        for (boolean b : arr) {
            if (b) counter++;
        }

        return counter == expected;
    }
}
