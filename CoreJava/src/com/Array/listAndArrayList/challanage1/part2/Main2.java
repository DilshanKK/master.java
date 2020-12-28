package com.Array.listAndArrayList.challanage1.part2;

import java.util.Scanner;

public class Main2 {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone2 mobilePhone = new MobilePhone2("0710954");

    public static void main(String[] args) {


        boolean quit = false;
        startPhone();
        printAction();
        while (!quit) {
            System.out.println(" enter action (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println(" \nShutting down..");
                    quit = true;
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addNewContacts();
                    break;
                case 3:
                    updateContacts();
                    break;
                case 4:
                    removeContacts();
                    break;

                case 5:
                    queryContacts();
                    break;
                case 6:
                    printAction();
                    break;


            }
        }

    }

    private static void addNewContacts() {
        System.out.println(" enter new contact name ");
        String name = scanner.nextLine();
        System.out.println(" enter phone number ");
        String phoneNumber = scanner.nextLine();
        Contacts2 newContact = Contacts2.createContact(name, phoneNumber);
        if (mobilePhone.addNewContacts(newContact)) {
            System.out.println(" New contact add: name = " + name + ", phone " + phoneNumber);
        } else {
            System.out.println(" cannot add," + name + " already on file");
        }
    }

    private static void printContacts() {
        System.out.println(" Contact lists");
        mobilePhone.printContacts();
    }


    private static void updateContacts() {
        System.out.println(" Enter existing contact name ");
        String name = scanner.next();
        Contacts2 existingContactRecode = mobilePhone.queryContact(name);
        if (existingContactRecode == null) {
            System.out.println(" Contact not found");
            return ;
        }
        System.out.println(" enter new contact number");
        String newName = scanner.nextLine();
        System.out.println(" Enter new contact number ");
        String newNumber = scanner.nextLine();
        Contacts2 newContact = Contacts2.createContact(newName, newNumber);
        if (mobilePhone.update(existingContactRecode, newContact)) {
            System.out.println(" sucsss");

        } else {
            System.out.println(" error updating recode");
        }
    }

    private static void removeContacts() {
        System.out.println(" Enter existing contact name ");
        String name = scanner.nextLine();
        Contacts2 existingContactRecode = mobilePhone.queryContact(name);
        if (existingContactRecode == null) {
            System.out.println(" Contact not found");
            return;
        }
        if (mobilePhone.removeContacts(existingContactRecode)) {
            System.out.println(" sucsssfully deleted");

        } else {
            System.out.println(" error deleting recode");
        }

    }

    private static void queryContacts() {
        System.out.println(" Enter existing contact name ");
        String name = scanner.next();
        Contacts2 existingContactRecode = mobilePhone.queryContact(name);
        if (existingContactRecode == null) {
            System.out.println(" Contact not found");
            return;
        }
        System.out.println(" Name: " + existingContactRecode.getName() + " phone number is " + existingContactRecode.getPhonNumber());
    }

    private static void startPhone() {
        System.out.println(" phone started....");

    }


    private static void printAction() {
        System.out.println("\nAvailble action :\npress ");
        System.out.println(" 0 - to  shutdown \n" +
                "1 - to print contacts \n"
                + "2 - to add  a new contact \n"
                + " 3 - to update exitting an exisiting number\n " +
                "4 - to remove contact\n " +
                "5 - to query if an existing contct exits\n " +
                "6 - to print a list of available actions.");
        System.out.println(" choose your action");
    }
}
