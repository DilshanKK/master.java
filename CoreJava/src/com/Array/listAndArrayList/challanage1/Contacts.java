package com.Array.listAndArrayList.challanage1;

public class Contacts {
    private String name;
    private String phonNumber;

    public Contacts(String name, String phonNumber) {
        this.name = name;
        this.phonNumber = phonNumber;

    }

    public String getName() {
        return name;
    }

    public String getPhonNumber() {
        return phonNumber;
    }

    public static Contacts myContact(String name, String phoneNumber) {
        return new Contacts(name, phoneNumber);
    }


}
















