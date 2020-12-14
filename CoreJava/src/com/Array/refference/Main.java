package com.Array.refference;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int myIntValue = 10;
        int anotherIntValue = myIntValue;
        System.out.println("MyIntValue " + myIntValue);
        System.out.println("anotherIntValue " + anotherIntValue);

        myIntValue++;

        System.out.println("MyIntValue " + myIntValue);
        System.out.println("anotherIntValue " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray " + Arrays.toString(myIntArray));
        System.out.println("anotherArray" + Arrays.toString(anotherArray));

        myIntArray[0] = 1;

        System.out.println(" after changed myIntArray " + Arrays.toString(myIntArray));
        System.out.println("after changed  anotherArray" + Arrays.toString(anotherArray));

        anotherArray = new int[]{100,200,300,400,500};

        modifyArray(myIntArray);

        System.out.println("after modified myIntArray " + Arrays.toString(myIntArray));
        System.out.println("after modified  anotherArray" + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {
        array[1] = 2;
        array =new int[]{1, 2 , 3 , 4, 5};



    }
}
