package com.Array.arrayBasic;

import java.util.Scanner;

public class ArrayWithScanner {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//1
        int[] myInteger = getInteger(5);
        //3
        for (int i = 0; i < myInteger.length; i++) {
            System.out.println("Element "+ i + " Type value was " + myInteger[i]);

        }

    }

    //2
    public static int[] getInteger(int number) {
        System.out.println("Enter " + number + " Integer Value \r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();

        }
        return values;

    }


}
