package com.ParsingValues;

import java.util.Scanner;

public class ScannerChallange1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Birth year : ");
        boolean hasNextInt = scanner.hasNextInt();


        if (scanner.hasNextInt()) {

            int birthYear = scanner.nextInt();
            int age = 2020 - birthYear;

            if (age >= 0 && age <= 100) {

                scanner.nextLine();
                System.out.println("Enter your name ");
                if (scanner.hasNextInt()) {
                    System.out.println("Invalid name");
                } else {
                    String name = scanner.nextLine();
                    System.out.println("Your name is : " + name + " and you are " + age);
                }
            } else {
                System.out.println("Invalid year");
            }
        } else {
            System.out.println("Invalid year!");
        }
    }

}