package com.Array.arrayBasic;

import java.util.Scanner;

public class ArrayWithScannerAVG {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] values = getInteger(3);
        for (int i = 0; i < values.length; i++) {
            System.out.println("array index no " + i + " value " + values[i]);
        }
        //pass avg

        System.out.println("average is " + getAverage(values));

    }

    public static int[] getInteger(int number) {
        System.out.println("enter " + number + " numbers \r");
        int[] getValues = new int[number];
        for (int i = 0; i < getValues.length; i++) {
            getValues[i] = scanner.nextInt();
        }
        return getValues;
    }
    //lets find the AVG

    public static double getAverage(int[] array) {

        int sumValues = 0;
        for (int i = 0; i < array.length; i++) {
            sumValues += array[i];
        }
        return (double) sumValues / (double) array.length;


    }


}

