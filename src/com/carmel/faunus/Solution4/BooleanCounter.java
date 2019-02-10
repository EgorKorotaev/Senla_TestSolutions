package com.carmel.faunus.Solution4;

import java.util.Arrays;
import java.util.List;

public class BooleanCounter {
    /**
     * True, if exactly two of the four truths
     *
     * @param bools array of boolean values
     * @return result
     */
    public static boolean twoOfFour(List<Boolean> bools) {
        final int capacity = 4;
        final int expected = 2;

        if (bools.size() != capacity) {
            throw new IllegalArgumentException("Only " + capacity + " parameters");
        }

        return bools.stream().filter(b -> b).count() == expected;
    }
}
