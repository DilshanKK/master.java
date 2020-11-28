package com.OOP1.Inheritence.practisOfMine2;

public class Main {
    public static void main(String[] args) {

        Father thatta = new Father("Kodithuwakku", 2, 2, 2, 2, "Deep", 5);
        System.out.println(thatta.getSurName());
        System.out.println(thatta.getEyes());
        System.out.println(thatta.getHands());
        System.out.println(thatta.getHeight());
        System.out.println(thatta.getLegs());
        System.out.println(thatta.getNose());
        System.out.println(thatta.getVoice());

        System.out.println("-------------------------------");

        Son son = new Son("Kodithuwakku", 2, 1, 2, 2, "Soft young", 6, 60, 5, "White", "black");
        son.shout();
        System.out.println(son.getSurName());
        System.out.println(son.getEyes());
        System.out.println(son.getHands());
        System.out.println(son.getHeight());
        System.out.println(son.getLegs());
        System.out.println(son.getNose());
        System.out.println(son.getVoice());

        System.out.println(son.getWeight());
        System.out.println(son.getFingers());
        System.out.println(son.getFairness());
        System.out.println(son.getBirthMarks());
        System.out.println("------------------------------");

        Daughter du = new Daughter("Kodithuwakku","Very soft",4,2,6);
        System.out.println(du.getSurName());
        System.out.println(du.getLogsHairs());
        du.shout();
    }
}
