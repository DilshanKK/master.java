package com.practicals.Reference;

public class Main {
    public static void main(String[] args) {
        House house = new House("Blue");
        House anotherHouse = house;

        System.out.println(house.getColor());
        System.out.println(anotherHouse.getColor());
        System.out.println("-----------------------");
        anotherHouse.setColor("Red");
        System.out.println(house.getColor());
        System.out.println(anotherHouse.getColor());
        System.out.println("-----------------------");
        House greenHouse = new House("Green");
        anotherHouse = greenHouse;

        System.out.println(house.getColor());
        System.out.println(anotherHouse.getColor());
        System.out.println(greenHouse.getColor());
        System.out.println("-----------------------");

        greenHouse = anotherHouse;
        System.out.println(house.getColor());
        System.out.println(anotherHouse.getColor());
        System.out.println(greenHouse.getColor());

        System.out.println("-----------------------");

    }
}
