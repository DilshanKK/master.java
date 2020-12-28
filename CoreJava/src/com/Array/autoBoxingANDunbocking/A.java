package com.Array.autoBoxingANDunbocking;

import java.util.ArrayList;

public class A {
    public static void main(String[] args) {

        String[] styArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

        // String is a class, but int is not a class. primitive data type can not assign it.

      //  ArrayList<int> intArrayList = new ArrayList<int>();// can not assign int
        //there are some solution. 1. autoboxing and unboxking. 2. create a int class
        ArrayList<IntClass> intArrayList1 = new ArrayList<IntClass>();
        intArrayList1.add(new IntClass(40));
        System.out.println(intArrayList1.get(0));

        Integer integes = new Integer(3);
        Double doubles = new Double(4);

    }
}

class IntClass {

    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}
