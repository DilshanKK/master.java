package com.Array.challange;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayChallange {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};


        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));
    }


    private static void reverse(int[] array) {


        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;

        }


    }


}


