package com.ParsingValues;

import java.util.Scanner;

public class ScannerChallange2 {
    public static void main(String[] args) {

        int count = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            int order = count + 1;
            System.out.println("Enter number #" + order + ";");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                count++;
                sum += number;
                if (count == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();

        }
        System.out.println("Sum = " + sum);
        scanner.close();
    }


}