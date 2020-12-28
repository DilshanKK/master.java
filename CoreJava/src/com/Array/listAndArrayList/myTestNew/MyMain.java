package com.Array.listAndArrayList.myTestNew;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MyMain {
    private static Scanner scanner = new Scanner(System.in);
    private static MyGlossary cmb = new MyGlossary();

    public static void main(String[] args) {

        boolean quit = false;
        int number = 0;
        discription();
        while (!quit) {
            System.out.println("  Enter a number ");
            number = scanner.nextInt();
            scanner.nextLine();
            //if -> no < 6
            switch (number) {
                case 0:
                    discription();
                    break;
                case 1:
                    cmb.print();

                    break;
                case 2:
                    add();

                    break;
                case 3:
                    update();
                    break;
                case 4:
                    remove();

                    break;
                case 5:
                    search();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }


    }

    private static void discription() {
        System.out.println("\nPress");
        System.out.println("\t0 - To print choice options, ");
        System.out.println("\t1 - To print list of glossary item  ");
        System.out.println("\t2 - To add an item to the list ");
        System.out.println("\t3 - To modify an item in the list");
        System.out.println("\t4 - Remove an item from the list");
        System.out.println("\t5 - To search for an item in the list");
        System.out.println("\t6 - To quit the application");

    }

    private static void add() {
        System.out.println(" enter name ");
        String name = scanner.nextLine();
        cmb.add(name);
    }

    private static void remove() {
        System.out.println(" Enter name you need to remove");
        String name = scanner.nextLine();
        cmb.remove(name);


    }

    private static void search() {
        System.out.println(" Enter the name you need to searh");
        String name = scanner.nextLine();
        int i = cmb.find(name);
        System.out.println(i);
        if (cmb.onFile(name)) {
            System.out.println(" your cart has " + name);
        } else {
            System.out.println(" your cart does not have " + name);
        }

    }

    private static void update() {

        System.out.println(" Enter the name you need to update");
        String oldname = scanner.nextLine();
        System.out.println("enter new name ");
        String newName = scanner.nextLine();

        cmb.update(oldname, newName);

    }

    //there are 3 ways to get array
    public void newArray() {
        //1 way to copy
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(MyGlossary.getCmbBank());
        //2nd way
        ArrayList<String> nextArray = new ArrayList<String>(MyGlossary.getCmbBank());
        //3rd way
        String[] myArray = new String[MyGlossary.getCmbBank().size()];
        myArray = MyGlossary.getCmbBank().toArray(myArray);
        //toArray assign index and values in to myArray and assign it to variable( arrayList eka normal array ekak karanne toArray eken.

    }

}


