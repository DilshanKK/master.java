package com.ParsingValues;

public class ParsingValuesStringToInt1 {
    public static void main(String[] args) {

        String numberAsString = "2020";
        System.out.println("Number is: " + numberAsString);

        //String pars to int

        int number = Integer.parseInt(numberAsString);
        System.out.println("String conver to integer" + number);

        //increment
        numberAsString += 1; // concate to 1 bs of String value
        number += 1;  // incremnt 1 bs of Integer value

        System.out.println(numberAsString);
        System.out.println(number);

        //chnage String value and ineger value
        String numberAsString1 = "2020b";
//        int number2 = Integer.parseInt(numberAsString1); //Compile error! Number format Exception
//        System.out.println("Append a value for String " + numberAsString1 );
//        System.out.println("Append a value for parsed int " + numberAsString1 );

        //String convert to double

        double doubleNumber = Double.parseDouble(numberAsString);
        float floatNumber = Float.parseFloat(numberAsString);

        numberAsString += 1;
        doubleNumber += 1;
        floatNumber += 1;

        System.out.println("String value " + numberAsString);
        System.out.println("Converted String to double " + doubleNumber);
        System.out.println("Converted String to float " + floatNumber);


    }
}
