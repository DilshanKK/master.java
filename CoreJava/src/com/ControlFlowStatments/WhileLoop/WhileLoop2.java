package com.ControlFlowStatments.WhileLoop;

public class WhileLoop2 {
    public static void main(String[] args) {

        int count = 6;

        do {
            System.out.println(count);
            count++;
            if (count<1){
                break;
            }
        }while(count !=6);

    }
}
