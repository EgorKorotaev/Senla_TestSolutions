package com.carmel.faunus.Solution3;

import java.util.Arrays;

public class ArraySort {
    /**
     * Sorted by "Bubble sort"
     *
     * @param arr - unsorted array
     */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Quicksort the standard tools java
     *
     * @param arr - unsorted array
     */
    public void systemSort(int[] arr) {
        Arrays.sort(arr);
    }
}
