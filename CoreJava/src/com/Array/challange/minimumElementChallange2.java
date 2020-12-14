package com.Array.challange;

import java.util.Arrays;
import java.util.Scanner;

public class minimumElementChallange2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a count");
        int count = scanner.nextInt();
        int[] arrayOfInteger = readInteger(count);
        int min = findMin(arrayOfInteger);
        System.out.println("Min value is " + min);

    }

    private static int[] readInteger(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value < min) {
                min = value;
            }
        }
        return min;

    }


}
