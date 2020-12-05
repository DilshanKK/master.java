package com.OOP2.encapsulation;

public class Main {
    public static void main(String[] args) {
        Player plyer = new Player();
        plyer.name = "Dil";
        plyer.health = 50;
        plyer.weapon = "AKG 45";

        int damage = 5;

        plyer.loseHealth(damage);
        damage = 45;

        plyer.loseHealth(damage);

        System.out.println(plyer.health);
    }
}
