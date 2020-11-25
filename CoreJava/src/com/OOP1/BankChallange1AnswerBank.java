package com.OOP1;

public class BankChallange1AnswerBank {

    private int account;
    private double balance;
    private String name;
    private String email;
    private long phoneNumber;

    public BankChallange1AnswerBank() {
        this(5678, 100.0, "Bob marly", "Bob@gail.com", 777846283);
        System.out.println("Empty Constructor!");
        //call the other constructer using this key word and pass parameters values.
    }


    public BankChallange1AnswerBank(int account, double balance, String name, String email, long phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.account = account;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public void deposit(double depositrFunds) {
        this.balance += depositrFunds;
        System.out.println("Deposit balance of " + depositrFunds + " available balance is " + this.balance);

    }

    public void withdraw(double withdawFunds) {
        if (this.balance - withdawFunds < 0) {
            System.out.println("Insufficent balance. Only " + this.balance + " available ");
        } else {
            this.balance -= withdawFunds;
            System.out.println("withdraw of " + withdawFunds + " processed. Reminded balance =  " + this.balance);
        }

    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
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

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
