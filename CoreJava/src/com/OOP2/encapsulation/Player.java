package com.OOP2.encapsulation;

public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damange) {
        this.health = this.health - damange;
        if (this.health <= 0) {
            System.out.println("Player knock out");
            //reduce number of lives remaing for the player
        }
    }
    public int healthRemaining(){
       return health;
    }
}
