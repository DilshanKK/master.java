package com.OOP1;

public class MyBank1Main {

    public static void main(String[] args) {

        MyBank1 bobsAccount = new MyBank1();
        // MyBank1 bobsAccount = new MyBank1(100001, "Bob Marly", "Bob@com", 777846283, 10000);


        System.out.println(bobsAccount.getName());
        bobsAccount.deposit(100);
        bobsAccount.withdraw(50);

        MyBank1 dilshanAccount = new MyBank1( "dilshan", 1000);
        System.out.println("Holder name is "+ dilshanAccount.getName() +" " +"Holders balance is "+ dilshanAccount.getBalance() + "Holder accNo " + dilshanAccount.getAccNo());
    }


}
