package com.Array.listAndArrayList.challanage1;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> myContacts;

    public MobilePhone(String myNumber, ArrayList<Contacts> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }

    public boolean addNewContacts(Contacts contacts) {
        if (findContacts(contacts.getName()) >= 0) {
            System.out.println("Contact is already in the file");
            return false;
        } else {
            myContacts.add(contacts);
            return true;
        }

    }

    public boolean update(Contacts oldContacts, Contacts newContact) {
        int foundPosition = findContacts(oldContacts);
        if (foundPosition >= 0) {
            System.out.println(oldContacts.getName() + " was not found");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContacts.getName() + " , was replaced with " + newContact.getName());
        return true;
    }

    public int findContacts(Contacts contacts) {
        return this.myContacts.indexOf(contacts);

    }

    private int findContacts(String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contacts contacts = this.myContacts.get(i);
            if (contacts.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }


}
