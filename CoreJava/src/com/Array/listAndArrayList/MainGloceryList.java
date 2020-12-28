package com.Array.listAndArrayList;

import javax.swing.*;
import java.util.Scanner;

public class MainGloceryList {
    private static Scanner scanner = new Scanner(System.in);
    private static GloceryList gloceryList = new GloceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choise = 0;
        printInstruction();
        while (!quit) {
            System.out.println(" Enter your choice ");
            choise = scanner.nextInt();
            scanner.nextLine();

            switch (choise) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    gloceryList.printGlossery();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }


    }

    public static void printInstruction() {
        System.out.println("\nPress");
        System.out.println("\t0 - To print choice options, ");
        System.out.println("\t1 - To print list of glossary item  ");
        System.out.println("\t2 - To add an item to the list ");
        System.out.println("\t3 - To modify an item in the list");
        System.out.println("\t4 - Remove an item from the list");
        System.out.println("\t5 - To search for an item in the list");
        System.out.println("\t6 - To quit the application");
    }

    public static void addItem() {
        System.out.println(" Please enter the glossary Items ");
        gloceryList.addGrocerryItems(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("current item name ");
        //int itemNo = scanner.nextInt(); // new update
        String itemNo = scanner.nextLine();
//        scanner.nextLine(); //newupdate
        System.out.println(" Enter replacement item ");
        String newItem = scanner.nextLine();
       // gloceryList.modifyGlosseryItems(itemNo - 1, newItem);newupdate
        gloceryList.modifyGlosseryItems(itemNo,newItem);
    }

    public static void removeItem() {
        System.out.println(" Enter Item name ");
        String itemNo = scanner.nextLine();
//        scanner.nextLine();
        gloceryList.removeGloceryItem(itemNo);
    }

    public static void searchForItem() {
        System.out.println(" Item to search for: ");
        String searchItem = scanner.nextLine();
        //if (gloceryList.findItem(searchItem) != null) {
        if(gloceryList.onFile(searchItem)){
            System.out.println(" Found " + searchItem + " in our glossary list");
        } else {
            System.out.println(searchItem + " is not your shopping list");
        }


    }

}
