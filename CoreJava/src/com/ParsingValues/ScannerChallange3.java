package com.ParsingValues;

import java.util.Scanner;

public class ScannerChallange3 {
    public static void main(String[] args) {

        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        //boolean flags = true;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your number");
            boolean isNumber = scanner.hasNextInt();
            if (isNumber) {
                int numbers = scanner.nextInt();
//
//                if (flags){
//                    flags = false;
//                    minNumber = numbers;
//                    maxNumber = numbers;
//
//                }
                if (numbers > maxNumber) {

                    maxNumber = numbers;
                    scanner.nextLine();
                }else{}
                if (numbers < minNumber) {
                    minNumber = maxNumber;
                }else{}


//                System.out.println("ow");

//                System.out.println("na");
                //scanner.nextLine();
                //  minNumber = numbers;
            }

             else{

                System.out.println("Invalid number");
                break;

            }
        }
        System.out.println("Min value is " + minNumber);
        System.out.println("Max value is " + maxNumber);

        scanner.close();
    }
}
