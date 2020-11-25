package com.ParsingValues;

import java.util.Scanner;

public class ScannerChallange1Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Birth year : ");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter your name ");
            String name = scanner.nextLine();
            int age = 2020 - yearOfBirth;
            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are  " + age + " year old");
            } else {
                System.out.println("age should be less than 100 or greater than 0");
            }
        } else {
            System.out.println("int ekak neme");
        }
    }
}
