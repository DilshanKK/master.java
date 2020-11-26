package com.OOP1;

public class Assiment2VipMain {
    public static void main(String[] args) {

        Assiment2VipClass person1 = new Assiment2VipClass();
        System.out.println(person1.getName());

        Assiment2VipClass person2 = new Assiment2VipClass("Dilshan" , 2000);
        System.out.println(person2.getName());

        Assiment2VipClass person3 = new Assiment2VipClass("Sunil", 3000, "Toiya@com");
        System.out.println(person3.getName());

    }
}
