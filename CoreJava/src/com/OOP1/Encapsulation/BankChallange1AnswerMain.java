package com.OOP1.Encapsulation;

public class BankChallange1AnswerMain {
    public static void main(String[] args) {

        // BankChallange1AnswerBank bobAccount = new BankChallange1AnswerBank(12345, 0.0, "Bob Brown", "Bob@gmail.com", 777846283);
       BankChallange1AnswerBank bobAccount = new BankChallange1AnswerBank();
//        bobAccount.setAccount(12345);
//        bobAccount.setBalance(0.0);
//        bobAccount.setName("Bob Brown");
//        bobAccount.setEmail("Bob@gmail.com");
//        bobAccount.setPhoneNumber(777846283);
        System.out.println("Account number is " + bobAccount.getAccount());
        System.out.println("Account name is " + bobAccount.getName());
        System.out.println("Account balance is " + bobAccount.getBalance());

        bobAccount.withdraw(100);

        bobAccount.deposit(50);
        bobAccount.withdraw(100);

        bobAccount.deposit(51);
        bobAccount.withdraw(100);


    }
}
