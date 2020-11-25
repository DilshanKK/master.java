package com.ParsingValues;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter your name here ");
        String name = scanner.nextLine();
        System.out.println("Your name is : " + name);
        scanner.close();
    }
}
// if we put String value instend of int we can see InputMismatchException