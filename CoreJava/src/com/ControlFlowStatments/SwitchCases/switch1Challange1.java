package com.ControlFlowStatments.SwitchCases;

public class switch1Challange1 {
    public static void main(String[] args) {

        char c ='b';
        switch (c){
            case 'a':
                System.out.println("char value 1 : " + c);
            break;
            case 'b':
                System.out.println("char value 2 : " + c);
            break;
            case 'c':
                System.out.println("char value 3 : " + c );
            break;
            default:
                System.out.println("nane of them : " + c );
            break;
        }
    }
}
