package com.OOP1;

public class BankMain1 {
    public static void main(String[] args) {

        Bank1 babiAccount = new Bank1();
        Bank1 mageAccount = new Bank1();

        babiAccount.setName("Ramesha");
        babiAccount.setDob("1991-08-13");

        mageAccount.setName("Dilshan");
        mageAccount.setDob("1998-10-20");

        System.out.println(babiAccount.getName());
        System.out.println(babiAccount.getDob());
        System.out.println(babiAccount.getBalace());

        System.out.println(mageAccount.getName());
        System.out.println(mageAccount.getDob());
        System.out.println(mageAccount.getBalace());


    }


}
