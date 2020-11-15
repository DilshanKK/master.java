package com.DataTypes;

public class PrimitiveTypeChallange {

    public static void main(String[] args) {

        byte b = 10;
        short s = 20;
        int i  = 50;

        long l = 50000L + 10L * (b + s +i);
        System.out.println(l);

        short ss = (short) (1000 + 10 * (b+s+i));
        System.out.println(ss);

         // Pound conver to KG

        double pounds = 200d;
        double converToKgs = pounds * 0.4535937d;
        System.out.println(converToKgs);


        //--------------------------------------------------------------


        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        // mage nama dilshan
        //mage name dilshan , kumara

        String name = "Dilshan";
            System.out.println("my name is " + name);

        name = name + " Kumara ";
            System.out.println(" my name is  " + name );

        name = name + "\u00A9 2020 ";
            System.out.println("My name is " + name);

        name = name + " \u231B  \u231B \u231B \u231B \u23F2 \u2763";
            System.out.println("my name is " + name);

        System.out.println("------------------------------------------------");

        String addNumber = "20.43";
        String addNumber2 = " 30.32";
            System.out.println("Append a two string " + addNumber+addNumber2);

        System.out.println("------------------------------------------------");

        String appendNumber = "24.3";
        int appendNumber2 = 30;
            System.out.println("Append numbers are " + appendNumber + appendNumber2);
        System.out.println("------------------------------------------------");





    }
}
