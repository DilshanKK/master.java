package com.Array.arrayBasic;

public class Basic {
    public static void main(String[] args) {
// there a few way to create an array 1 way
//        int[] myIntArray;
//        myIntArray = new int[10];

        //2nd way to create an array
        int[] myIntArray = new int[10];
        myIntArray[0] = 0;
        myIntArray[1] = 1;
        myIntArray[2] = 2;
        myIntArray[4] = 3;
        myIntArray[5] = 5;
        myIntArray[6] = 6;
        myIntArray[7] = 7;
        myIntArray[8] = 8;
        myIntArray[9] = 9;
// we can create an array for primitive data type and objects types
        double[] myDoubleArray = new double[3];
//        myDoubleArray[0] = 10.54;
//        myDoubleArray[1] = 20.23;
//        myDoubleArray[2] = 30.21;
        System.out.println(myDoubleArray[2]);

        //An exsample of array create and data read using for loops
        int[] myIntDirectArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(myIntDirectArray[7]);

        int[] myIntArray1 = new int[10];

        for (int i = 0; i < 10; i++) {
            myIntArray1[i] = i * 10;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Array element is " + i + " value is " + myIntArray1[i]);
        }
        System.out.println("---------------");


// if we dont know the length of an array we can add in to the forloop
        for (int i = 0; i < myIntArray1.length; i++) {
            myIntArray1[i] = i * 10;
        }
        for (int i = 0; i < myIntArray1.length; i++) {
            System.out.println("Array element is " + i + " value is " + myIntArray1[i]);
        }

        System.out.println("------------------");
        printArray(myIntArray1);
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array element is " + i + " value is " + array[i]);
        }

    }
}
