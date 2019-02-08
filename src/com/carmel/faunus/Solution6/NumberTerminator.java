package com.carmel.faunus.Solution6;

public class NumberTerminator {
    private static final String NUMBERS_PATTERN = "\\b-?\\d+(\\.\\d+)?\\b";
    private static final String EMPTY_STRING = "";

    /**
     * Replace each occurrence of one or more digits with an empty string
     *
     * @param str - original string
     * @return - string without numbers
     */
    public static String terminateNumbers(String str) {
        return str.replaceAll(NUMBERS_PATTERN, EMPTY_STRING);
    }
}
