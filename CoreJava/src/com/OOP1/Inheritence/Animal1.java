package com.OOP1.Inheritence;

public class Animal1 {
    //Common Charactiristics for animals
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal1(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
        //create a constructor bs we can construct an animal class easily.
    }

    public void eat() {
        //behaviors
        System.out.println("Animal eat() called");
    }

    public void move(int speed) {
        System.out.println("Animal.move() Animal is moving at " + speed);

    }


    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
