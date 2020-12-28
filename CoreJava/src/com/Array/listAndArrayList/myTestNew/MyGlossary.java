package com.Array.listAndArrayList.myTestNew;


import java.util.ArrayList;

public class MyGlossary {
    private static ArrayList<String> cmbBank = new ArrayList<String>();

    public static ArrayList<String> getCmbBank() {
        return cmbBank;
    }

    public void add(String name) {

        int position = find(name);
        if (position >= 0) {
            System.out.println(name + " is already have in your cart");
        } else {

            cmbBank.add(name);
            System.out.println(name + " added");
            System.out.println(" size of list " + cmbBank.size());
        }


    }

    public void update(String currentName, String newName) {
        int position = find(currentName);
        if (position >= 0) {
            update(position, newName);
        } else {
            System.out.println(" your cart does not have the item");
        }


    }


    private void update(int position, String newName) {
        cmbBank.set(position, newName);

    }

    public void remove(String name) {
        int position = find(name);
        if (position >= 0) {
            remove(position);
        } else {

        }
    }

    private void remove(int name) {
        cmbBank.remove(name);
        System.out.println(name + " has been removed");

    }

    public void print() {

        for (int i = 0; i < cmbBank.size(); i++) {
            System.out.println(i+1 +". " +cmbBank.get(i));

        }
    }

    public int find(String name) {
        return cmbBank.indexOf(name);

    }

    public boolean onFile(String name) {
        int position = find(name);
        if (position >= 0) {
            return true;
        }
        return false;
    }
}
