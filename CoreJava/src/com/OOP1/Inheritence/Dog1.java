package com.OOP1.Inheritence;

public class Dog1 extends Animal1 {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    //these are the only for dogs have.

    public Dog1(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);// super use for pass the values inside the parameters list of parents class's constructor
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    public void chew() {
        System.out.println("cheew method called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() overide method called.");
        chew();
        super.eat();
    }
    public void walk(){
        System.out.println("Dog.walked () called");
        move(5);
    }
    public void run(){
        System.out.println("dog.run() called");
       move(10);
    }
    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog moved callied");
        moveLegs(speed);
        super.move(speed);
    }



}


//    public Dog1() {
//        super("name", 0, 0, 0, 0);// super use for pass the values inside the parameters list of parents class's constructor
//    }// we just need to pass the value so its not important create above list.
