package com.Array.arrayBasic;

public class ArrayPrintUsingMethod {
    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i * 10;
        }
        arrayPrint(myIntArray);

    }

    public static void arrayPrint(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("Element is " + i + " value " + array[i]);

        }
    }


}
