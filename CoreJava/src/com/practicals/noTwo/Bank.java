package com.practicals.noTwo;

public class Bank {
    private int accNo;
    private String ownerName;
    private String email;
    private int MobileNo;
    private double accBalance;

    public Bank() {
        this(00001, "Dilshan", "comb@lk", 777846283, 2000);

    }

    public Bank(int accNo, String ownerName, String email, int mobileNo, double accBalance) {
        this.accNo = accNo;
        this.ownerName = ownerName;
        this.email = email;
        this.MobileNo = mobileNo;
        this.accBalance = accBalance;

    }

    public void setDeposite(double deposite) {
        System.out.println("Available is " + accBalance + " you have add of " + deposite);
        this.accBalance += deposite;
        System.out.println("New balance is " + accBalance);

    }

    public void setWithdeaw(double withdeaw) {

        double posibility = this.accBalance - 500;
        System.out.println("Your available balance is " + this.accBalance + " You can withdaw only  " + posibility);


        if (withdeaw < this.accBalance && this.accBalance > posibility) {
            this.accBalance -= withdeaw;
            System.out.println("Transation has completed. Your available balance is " + this.accBalance);

        } else {
            System.out.println("Sorry your account balance is insufficent this compete this transaction!");
        }

    }

}
