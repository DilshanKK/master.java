package com.Array.listAndArrayList;

import java.util.ArrayList;

public class GloceryList {

    private ArrayList<String> grocerryList = new ArrayList<String>();

    public void addGrocerryItems(String item) {
        grocerryList.add(item);

    }

    public void printGlossery() {
        System.out.println(" You have " + grocerryList.size() + " items in your glossery list");
        for (int i = 0; i < grocerryList.size(); i++) {
            System.out.println((i + 1 + " ." + grocerryList.get(i)));

        }
    }

    //newUpdate
    public void modifyGlosseryItems(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGlosseryItems(position, newItem);
        }
    }


    public void modifyGlosseryItems(int position, String newItem) {
        grocerryList.set(position, newItem);
        System.out.println("Glocsery Itm " + (position + 1) + " has been modified");
    }

    //newUpdate
    public void removeGloceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGloceryItem(position);
        }


    }

    private void removeGloceryItem(int position) {
//        String theItem = grocerryList.get(position);
        grocerryList.remove(position);



    }

    private int findItem(String searchItem) {
        //public String findItem(String searchItem) {
////        boolean exits = grocerryList.contains(searchItem);
//        int position = grocerryList.indexOf(searchItem);
//
//
//        if (position >= 0) {
//            return grocerryList.get(position);
//        }
//        return null;
        return grocerryList.indexOf(searchItem);

    }

    //new
    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if (position >= 0) {
            return true;
        }
        return  false;
    }


}