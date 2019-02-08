package com.carmel.faunus.Solution1;

import java.util.ArrayList;
import java.util.List;

public class SimpleNumbers {
    /**
     * Use the sieve of Eratosthenes
     *
     * @param n - number of iterations
     * @return - list of simple numbers
     */
    public static List<Integer> simpleNumbersBeforeN(int n) {
        List<Integer> res = new ArrayList<>(n);

        boolean[] mass = new boolean[n + 2];

        for (int i = 0; i < n; i++) {
            mass[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (mass[i] == true) {
                for (int j = (i * i); j < n; j = j + i) {
                    mass[j] = false;
                }
            }
        }

        for (int i = 2; i < n; i++) {
            if (mass[i] == true) res.add(i);
        }

        return res;
    }
}
