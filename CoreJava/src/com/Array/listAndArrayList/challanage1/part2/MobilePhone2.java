package com.Array.listAndArrayList.challanage1.part2;


import java.util.ArrayList;

public class MobilePhone2 {

    private String myNumber;
    private ArrayList<Contacts2> myContacts2;

    public MobilePhone2(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts2 =new ArrayList<Contacts2>();
    }

    public boolean addNewContacts(Contacts2 contacts) {
        if (findContacts(contacts.getName()) >= 0) {
            System.out.println("Contact is already in the file");
            return false;
        } else {
            myContacts2.add(contacts);
            return true;
        }

    }

    public boolean update(Contacts2 oldContacts, Contacts2 newContact) {
        int foundPosition = findContacts(oldContacts);
        if (foundPosition >= 0) {
            System.out.println(oldContacts.getName() + " was not found");
            return false;
        }else if(findContacts(newContact.getName())!= -1){
            System.out.println(" contact with name"+ newContact.getName()+ " already existing. update" +
                    "was not success");
            return false;

        }
        this.myContacts2.set(foundPosition, newContact);
        System.out.println(oldContacts.getName() + " , was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContacts(Contacts2 contacts2) {
        int foundPosition = findContacts(contacts2);
        if (foundPosition < 0) {
            System.out.println(contacts2.getName() + ", was not found");
            return false;
        }
        this.myContacts2.remove(foundPosition);
        System.out.println(contacts2.getName() + " was deleted ");
        return true;
    }


    public int findContacts(Contacts2 contacts) {
        return this.myContacts2.indexOf(contacts);

    }

    private int findContacts(String contactName) {
        for (int i = 0; i < this.myContacts2.size(); i++) {
            Contacts2 contacts = this.myContacts2.get(i);
            if (contacts.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }
    public Contacts2 queryContact (String name){
        int position = findContacts(name);
        if(position >=0){
            return this.myContacts2.get(position);
        }
        return null;
    }


    public String queryContact(Contacts2 contacts2) {
        if (findContacts(contacts2) >= 0) {
            return contacts2.getName();

        }
        return null;

    }

    public void printContacts() {
        System.out.println(" contacts list");
        for (int i = 0; i < this.myContacts2.size(); i++) {
            System.out.println(i + 1 + "." +
                    this.myContacts2.get(i).getName() + " ->"
                    + this.myContacts2.get(i).getPhonNumber());

        }
    }
}

