package com.OOP1.composition.challange1;

public class House {
    private BedRoom bedroom;

    public House(BedRoom bedroom) {
        this.bedroom = bedroom;
    }

    public void opeWindo(){
        openWindow(1);
    }

    private void openWindow(int function){

        bedroom.openWindow(function);
    }
    //getting bedroom variables
    public void gettingBedroomsVariables(){
        gettingVariables();
    }
    private void gettingVariables(){
        bedroom.getBathroom();
        System.out.println("There are " + bedroom.getBathroom() + " Bedrooms");
        bedroom.getLaptops();
        System.out.println("There are " + bedroom.getLaptops() + " Laptops ");
    }




}
