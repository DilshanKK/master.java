package com.Array.listAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 2;
        array[1] = 22;
        array[2] = 24;
        array[3] = 25;
        array[4] = 26;

        for (int i = 0; i < array.length; i++) {

            System.out.println(Arrays.toString(array));

        }

        int[] newArray = Arrays.copyOf(array, array.length);

        array = new int[7];

        for (int i = 0; i < newArray.length; i++) {

            array[i] = newArray[i];

        }
        array[5] = 3;
        array[6] = 30;

        System.out.println(Arrays.toString(array));


    }
}
