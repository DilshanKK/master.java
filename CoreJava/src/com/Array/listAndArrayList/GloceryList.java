package com.Array.listAndArrayList;

import java.util.ArrayList;

public class GloceryList {
    private int[] myNumber = new int[50];
    private ArrayList<String> grocerryList = new ArrayList<String>();

    public void addGrocerry(String item) {
        grocerryList.add(item);

    }

    public void printGlossery() {
        System.out.println(" You have " + grocerryList.size() + " itms in your glossery list");
        for (int i = 0; i < grocerryList.size(); i++) {
            System.out.println((i + 1 + " ." + grocerryList.get(i)));

        }
    }

    public void modifyGlosseryItems(int position, String newItem) {
        grocerryList.set(position, newItem);
        System.out.println("Glocsery Itm " + (position + 1) + " has been modified");
    }
    public void removeGloceryItem(int position){
            String theItem = grocerryList.get(position);
            grocerryList.remove(theItem);
            //milk
        //cheese
        //Bread
    }


}