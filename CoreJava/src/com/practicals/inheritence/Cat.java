package com.practicals.inheritence;

public class Cat extends Animal {

    private String shoutWay;
    private int lengthOfTaun;


    public Cat(String name, int brain, int body, int size, int weight, String shoutWay, int lengthOfTaun) {
        super(name, brain, body, size, weight);
    }

    @Override
    public void HowManyeatPerDay(int NoOfTimesEat) {
        super.HowManyeatPerDay(NoOfTimesEat);
    }

    @Override
    public void MoveSpeed(int speed) {
        super.MoveSpeed(speed);
    }

    public void waveTail(String waveTail) {

    }

}
