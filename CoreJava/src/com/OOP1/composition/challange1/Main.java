package com.OOP1.composition.challange1;

public class Main {
    public static void main(String[] args) {

        BedRoom bedroom = new BedRoom(1, 1,4, 3, 1, 2, 1);

        House house = new House(bedroom);
        house.opeWindo();
        house.gettingBedroomsVariables();


    }
}
