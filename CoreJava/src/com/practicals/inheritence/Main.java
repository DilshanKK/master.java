package com.practicals.inheritence;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 6, 4, 3);

        Dog browny = new Dog("Browny", 1, 6, 5, 3, " Bow bow", 1);
        browny.HowManyeatPerDay(3);
        browny.waveTail("left right ");
        browny.MoveSpeed(200);
        Cat poose = new Cat(" Poose", 1, 6, 5, 3, "Meow Meow", 1);


    }
}
