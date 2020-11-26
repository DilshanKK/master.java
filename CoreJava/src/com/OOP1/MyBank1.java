package com.OOP1;

public class MyBank1 {
    private int accNo;
    private String name;
    private String email;
    private int mobileNO;
    private double balance;

    public MyBank1() {
        this(1221, "Bobby", "boby@gmail.com", 777846283, 1000);
        System.out.println("Emty constracture");
    }

    public MyBank1(int accNo, String name, String email, int mobileNO, double balance) {
        // setName(name); dnt call setters from using  constructors
        this.accNo = accNo;
        this.name = name;
        this.email = email;
        this.mobileNO = mobileNO;
        this.balance = balance;

        System.out.println("1 constructor called");
    }
    public MyBank1(String name, double balance) {
       this(12121, name,"dilsahn@com", 7209098, balance);
        System.out.println("third constrcuter called");

    }

    public void deposit(double depositBalance) {
        this.balance += depositBalance;
        System.out.println("You have add fund of " + depositBalance + "your current balance is :" + this.balance);
    }

    public void withdraw(double withdrawBalance) {
        if (this.balance - withdrawBalance > 0) {
            this.balance -= withdrawBalance;
            System.out.println("withdraw balacne is " + withdrawBalance + " available balance is " + this.balance);
        } else {
            System.out.println("you dont have insfficiean balance to complete your withdraw");
        }
    }



    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobileNO() {
        return mobileNO;
    }

    public void setMobileNO(int mobileNO) {
        this.mobileNO = mobileNO;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
