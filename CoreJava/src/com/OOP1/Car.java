package com.OOP1;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engin;
    private String color;

    public void setModel(String model) {
        String validCarModels = model.toLowerCase();// added lowerCase bs java is case sensitive.
        if (validCarModels.equals("cayenne") || validCarModels.equals("Cherry QQ")) {// check these paramets which is getting values are valid(same) or not. if same assigned the value . not same got to else/
            this.model = model;

        } else {
            System.out.println("unknown car model");
        }

        //  this.model = model; // This model mean is parameter's name equal model in car class but if we change parameter model we dnt need to add this bs name is different.
    }

    public String getModel() {
        return model;
    }


}
