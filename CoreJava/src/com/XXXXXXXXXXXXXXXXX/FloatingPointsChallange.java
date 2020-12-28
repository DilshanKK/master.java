package com.XXXXXXXXXXXXXXXXX;

import java.util.Scanner;

public class FloatingPointsChallange {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        poundsToKillos();

    }
    private static void poundsToKillos(){

        System.out.println(" Enter pound number you need to convert to kilos");
        double pounds = scanner.nextDouble();
        double lbToKg = pounds * 0.45359237;
        System.out.println(" killos " + lbToKg);


    }
}
