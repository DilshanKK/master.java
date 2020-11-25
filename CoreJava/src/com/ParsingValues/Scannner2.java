package com.ParsingValues;

import java.util.Scanner;

public class Scannner2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birth year");
        int birthYear = scanner.nextInt();
        int old = 2020 - birthYear;
        scanner.nextLine();
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
        System.out.println("Your name is "+ name + " and you are  " + old + " years old");
        scanner.close();

    }
}
