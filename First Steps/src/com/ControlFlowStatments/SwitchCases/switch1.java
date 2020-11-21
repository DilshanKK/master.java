package com.ControlFlowStatments.SwitchCases;

public class switch1 {
    public static void main(String[] args) {
        int value = 13;

        if (value == 3){
            System.out.println("value eqal to 3");
        }else if(value == 1){
            System.out.println("Value equal to 1");
        }else{
            System.out.println( "was not 1 or 2" );
        }
        //like for loop we can do it in the switch cases;

        int switchValue = 2;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case  2:
                System.out.println("value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("value was 3");
                break;
            default:
                System.out.println("Value 1 , or 3 not found");
                break;
        }
        //more Code here
    }

}

