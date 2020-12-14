package com.practicals.inheritence;

public class Dog extends Animal {

    private String shoutWay;
    private int lengthOfTaun;


    public Dog(String name, int brain, int body, int size, int weight, String shoutWay, int lengthOfTaun) {
        super(name, brain, body, size, weight);
    }


    @Override
    public void HowManyeatPerDay(int NoOfTimesEat) {
        System.out.println("Dog eat " + NoOfTimesEat +" per day");
    }

    @Override
    public void MoveSpeed(int speed) {
        System.out.println(" A dog's  speed is "+ speed );
        super.MoveSpeed(20);
    }

    public void waveTail(String waveTail) {
        System.out.println("Dog waving its tail because need to be friend " + waveTail);


    }
}
