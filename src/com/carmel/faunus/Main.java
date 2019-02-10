package com.carmel.faunus;

import com.carmel.faunus.Solution1.SimpleNumbers;
import com.carmel.faunus.Solution2.Fibonacci;
import com.carmel.faunus.Solution3.ArraySort;
import com.carmel.faunus.Solution4.BooleanCounter;
import com.carmel.faunus.Solution5.Palindrom;
import com.carmel.faunus.Solution6.NumberTerminator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    private static final String MULTIPLE_SPACES_PATTERN = "\\s+";

    public static void main(String[] args) {
        solution1();
        solution2();
        solution3();
        solution4();
        solution5();
        solution6();
    }


    private static void solution6() {
        /*
         * Text for test:
         * 12-го числа сего месяца в 13.20 Вася пошел на рынок и 5 раз торговался с 18-ю продавцами, облапошив их рублей на 25. Или 25.5.
         */
        System.out.print("6: Enter the string with digits: ");
        System.out.println(NumberTerminator.terminateNumbers(inputString()));
    }

    private static void solution5() {
        System.out.print("5: Enter the word to checking: ");
        System.out.println("Is" + (Palindrom.isPalindrom(inputString()) ? " " : " NOT ") + "palindrom");
    }

    private static void solution4() {
        System.out.print("4: Enter four boolean values (true or false) separated by space: ");

        List<Boolean> list = Arrays.stream(inputString().trim().split(MULTIPLE_SPACES_PATTERN))
                .map(Boolean::parseBoolean).collect(Collectors.toList());

        System.out.println(BooleanCounter.twoOfFour(list) ? "True" : "");
    }

    private static void solution3() {
        System.out.print("3: Enter a list of numbers separated by a space: ");
        int[] arr = Arrays.stream(inputString().trim().split(MULTIPLE_SPACES_PATTERN))
                .mapToInt(Integer::parseInt).toArray();

        // Simple sort
        ArraySort.bubbleSort(arr);

        // Quick sort
//        ArraySort.systemSort(arr);

        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));

        System.out.println();
    }

    private static void solution2() {
        System.out.print("2: Enter Fibonacci number: ");
        System.out.println(Fibonacci.recursively(inputInt()));
    }

    private static void solution1() {
        System.out.print("1: Enter Max integer number: ");

        List<Integer> numbers = SimpleNumbers.simpleNumbersBeforeN(inputInt());
        numbers.forEach(i -> System.out.print(i + " "));

        System.out.println();
    }

    private static String inputString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static int inputInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
