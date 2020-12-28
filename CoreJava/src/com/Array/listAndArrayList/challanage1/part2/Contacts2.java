package com.Array.listAndArrayList.challanage1.part2;

import com.Array.listAndArrayList.challanage1.Contacts;

public class Contacts2 {
    private String name;
    private String phonNumber;

    public Contacts2(String name, String phonNumber) {
        this.name = name;
        this.phonNumber = phonNumber;

    }

    public String getName() {
        return name;
    }

    public String getPhonNumber() {
        return phonNumber;
    }

    public static Contacts2 createContact(String name, String phoneNumber) {
        return new Contacts2(name, phoneNumber);
    }
}
