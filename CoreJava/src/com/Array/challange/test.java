package com.Array.challange;


import java.util.Arrays;
import java.util.Scanner;

public class test {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] getIntergerValues = getIntger(5);
        int[] copyArray = sortInteger(getIntergerValues);
        printArray(copyArray);

    }

    private static int[] getIntger(int number) {
        int[] myArray = new int[number];
        System.out.println("ENTER " + number + " any numbers");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    private static int[] sortInteger(int[] arrayValues) {
//        int[] forArray = new int[arrayValues.length];
//        for(int i = 0; i<arrayValues.length; i++){
//            forArray[i] = arrayValues[i];}
        int[] copyOfArray = Arrays.copyOf(arrayValues, arrayValues.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;

            for (int i = 0; i < copyOfArray.length - 1; i++) {
                if (copyOfArray[i] < copyOfArray[i + 1]) {
                    temp = copyOfArray[i];
                    copyOfArray[i] = copyOfArray[i + 1];
                    copyOfArray[i + 1] = temp;
                   // flag = true;
                } flag = true;
            }
        }
        return copyOfArray;
    }

    //print
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(" index " + i + " value " + array[i]);

        }
    }
}