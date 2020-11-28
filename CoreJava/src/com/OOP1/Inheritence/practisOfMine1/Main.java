package com.OOP1.Inheritence.practisOfMine1;

public class Main {
    public static void main(String[] args) {

        Father father = new Father();

        father.setSurName("Kodithuwakku");
        father.setEyes(2);
        father.setHands(2);
        father.setHeight(5);
        father.setLegs(2);
        father.setNose(1);
        father.setVoice("Soft");


        System.out.println("sure name:" + father.getSurName());
        System.out.println("eyes: " + father.getEyes());
        System.out.println("sex: " + father.getSex());
        System.out.println("Hands: " + father.getHands());
        System.out.println("height: " + father.getHeight());
        System.out.println("legs: " + father.getLegs());
        System.out.println("nose: " + father.getNose());
        System.out.println("voice: " + father.getVoice());
        System.out.println("-------------------------------------");

        Son putha = new Son();

        putha.setEyes(2);
        putha.setHands(2);
        putha.setHeight(4);
        putha.setLegs(2);
        putha.setNose(1);
        putha.setVoice("deep");
        putha.setBirthMarks("5");
        putha.setFairness("white");
        putha.setFingers(6);
        putha.setWeight(55);

        putha.setNose(3);

        System.out.println(putha.getSurName());
        System.out.println("eyes: " +putha.getEyes());
        System.out.println("sex: " + putha.getSex());
        System.out.println("Hands: "+ putha.getHands());
        System.out.println("height: " + putha.getHeight());
        System.out.println("legs: " +putha.getLegs());
        System.out.println("nose: " +putha.getNose());
        System.out.println("voice: " + putha.getVoice());

        System.out.println(putha.getWeight());
        System.out.println(putha.getFingers());
        System.out.println(putha.getFairness());
        System.out.println(putha.getBirthMarks());


    }
}
