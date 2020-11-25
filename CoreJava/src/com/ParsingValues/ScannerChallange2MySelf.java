package com.ParsingValues;

import java.util.Scanner;

public class ScannerChallange2MySelf {
    public static void main(String[] args) {


        int minNumber = Integer.MAX_VALUE;
        int MaxNumber = Integer.MIN_VALUE;
//        int minNumber = 0;
//        int MaxNumber = 0;
//        boolean onlyFirstAssign = true;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("enter your number");
            boolean isInt = scanner.hasNextInt();

            if (isInt) {//Is a number
                int userTyped = scanner.nextInt();

//                if (onlyFirstAssign) {
//                    onlyFirstAssign = false;
//                    minNumber = userTyped;
//                    MaxNumber = userTyped;
//
//                }//Both ways can do this job. first one is boolean flag and 2nd one is Max valud and Min Integer values


                if (userTyped > MaxNumber) {
                    MaxNumber = userTyped;// max number ekata wada type karapu no eka kudaanam


                }
                if (userTyped < minNumber) {
                    minNumber = userTyped;
                }


            } else {
                System.out.println("Invalid number");
                break;
            }


        }//endwhile
        System.out.println("Min value : " + minNumber);
        System.out.println("Max value is : " + MaxNumber);


    }//end psvm

}