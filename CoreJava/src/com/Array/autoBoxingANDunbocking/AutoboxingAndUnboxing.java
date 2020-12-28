package com.Array.autoBoxingANDunbocking;

import java.util.ArrayList;

public class AutoboxingAndUnboxing {

    public static void main(String[] args) {


        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        intArrayList.add(5);
        System.out.println("hbhb" + intArrayList.get(0));
        for (int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i));
            //valueOf is actually taking the valuOf i as the primitive type and converting it automatically into the integer class
            //now it can use it as a class (This is the autoBoxing)
        }
        for (int i = 0; i < intArrayList.size(); i++) {
            System.out.println(i + "-------->" + intArrayList.get(i).intValue());
            //int value() which is a value which converts it back from Integer from the Integer class back into an int type to a primitive type.
            //this is the unboxing. intValue();
        }
// we can do this another way
        Integer myInteger = Integer.valueOf(56);
        //Compile time , it gets converted.
        Integer myInt = 56;
        //This is a integer, an integer object so this is a class and you entered an integer here.
        int myInt1 = myInt.intValue(); //int is primitive type.  intValue() is object
        System.out.println(myInt1);


        //double arraylist
        ArrayList<Double> douArrayList = new ArrayList<Double>();
        for (double da = 0.0; da < 10.00; da += 0.5) {
            douArrayList.add(Double.valueOf(da));
        }
        for (int i =0; i<douArrayList.size(); i ++){
            System.out.println(douArrayList.get(i).doubleValue());
        }

    }


}
