package com.OOP1.Encapsulation;

public class BankChallengeMain1 {
    public static void main(String[] args) {

        BankChallange1 mircrosoftOwner = new BankChallange1();

        mircrosoftOwner.setName("Bill Gates");
        mircrosoftOwner.setBalance(10_0000);
        mircrosoftOwner.setEmail("BillGates@outlook.com");
        mircrosoftOwner.setPhoneNumber(94719754741L);

        //deposit
        double balance = mircrosoftOwner.getBalance();

        System.out.println("Account name is : " + mircrosoftOwner.getAccountNumber());
        System.out.println("Available balance is : " + mircrosoftOwner.getBalance());
        System.out.println("Account's name : " + mircrosoftOwner.getName());
        System.out.println("Email address is " + mircrosoftOwner.getEmail());
        System.out.println("Phone number is :" + mircrosoftOwner.getPhoneNumber());
        //reDeposit balance
        double reDepositBalance = depositBank(balance);
        mircrosoftOwner.setBalance(reDepositBalance);
        System.out.println("New Avalilabale balance is : " + reDepositBalance);

        //withdraw funds
        double countWithdraw = withdrawFunds(reDepositBalance);
        if (countWithdraw != -1) {
            mircrosoftOwner.setBalance(countWithdraw);
            System.out.println("your available balance is: " + countWithdraw);
        } else {
            System.out.println("Your account suspended! Please Refund your account");
        }


    }


    private static double depositBank(double depBalance) {
        int newBalance = 4000;
        System.out.println("Funds Deposit " + newBalance);
        return depBalance += newBalance;
    }

    private static double withdrawFunds(double widrwBalance) {

        int w = 2000000;
        if (widrwBalance > w) {
            System.out.println("You have been withdraw " + w);
            return widrwBalance -= w;
        } else {
            return -1;
        }


    }


}
