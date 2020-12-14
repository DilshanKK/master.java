package com.practicals.noTwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank HnbBank = new Bank();
        Scanner touchMe = new Scanner(System.in);
        System.out.println(" enter the deposite money");
        double depsosite = touchMe.nextDouble();
        HnbBank.setDeposite(depsosite);

        System.out.println("ENter the withdraw money");
        double withdraw = touchMe.nextDouble();

        HnbBank.setWithdeaw(withdraw);


    }
}
