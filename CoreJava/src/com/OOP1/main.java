package com.OOP1;

public class main {
    public static void main(String[] args) {
        Car pourch = new Car();
        Car bmw = new Car();

//        pourch.model = " Careena ";
//        bmw.model = " I series ";
        System.out.println("Model is " + pourch.getModel()); // model is null bs of String default value is null
        pourch.setModel("Cayenne");
        pourch.setModel("Cherry QQ");
        pourch.setModel("Cayenee123"); // already has been validatd the setModel. so it is a unknown car model
        System.out.println("Model is " + pourch.getModel());


    }
}
