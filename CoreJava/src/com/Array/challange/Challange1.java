package com.Array.challange;

import java.util.Arrays;
import java.util.Scanner;

public class Challange1 {
    //Create a prgam using arrys that sorts a list of integer in descending order
    //in other word if the array had the values in it 106,26,81,15, your program should
    //ultimately have an array with     106 , 81 , 26 , 15, 5 in fit
    //set up the program so that the number to sort are read in from the keyboard
    //implement the following methods - getinteger , printarray and sortInteger
    //getIntegers return an array of enterd intergers from keyboard
    //printArray prints out the contents of the array
    //and sortIntegers should sort the array and return a new array containing the sorted numbers
    //ypi willl have to fingure out how to copy the array elements from the passed aray into a new
    //array and sort them and return the new sorted array.
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int[] myInteger = getInteger(5);
        int[] sorted = sortInteger(myInteger);
        printArray(sorted);

    }

    public static int[] getInteger(int number) {

        int[] getValues = new int[number];
        System.out.println("Enter " + number + "Integer value:\r");
        for (int i = 0; i < getValues.length; i++) {
            getValues[i] = scanner.nextInt();
        }
        return getValues;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + "Contents " + array[i]);
        }
    }


    public static int[] sortInteger(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];

        //100,200,300,400,500
        //200,100,300,400,500
        //200,300,100,400,500
        //200,300,400,100,500
        //200,300,400,500,100

        //200,300,400,500,100
//        300,200,400,500,100

        //500,400,300,100,200
        //500,400,300,200,100

        int[] sortedArray = Arrays.copyOf(array, array.length);
     //bubble sort algorithm
        boolean flag = true;
        int temp; //100 //100 //100 //200
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {//4
                if (sortedArray[i] < sortedArray[i + 1]) { // 100 < sortedArray[1] 100 < 200|| 100 < 300
                    temp = sortedArray[i];         //100 saved,
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                   flag = true;

                }
            }
        }
        return sortedArray;
    }
//You are the best babi. You can do this! <3

}
// primitive pass by value (copy)
//object types pass by reference