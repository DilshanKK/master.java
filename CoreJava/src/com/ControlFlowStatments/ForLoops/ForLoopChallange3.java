package com.ControlFlowStatments.ForLoops;

public class ForLoopChallange3 {
    public static void main(String[] args) {

        int dv3 = 0;
        int step = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("Divided by 3 and 5: " + i);
                dv3 += i;
                step++;
                if (step == 5) {
                    break;
                }
            }
        }
        System.out.println("steps " + step);

        System.out.println("-------------------------------------------");
//evenOdd
        for (int i =1; i<=20; i++){
            if(i%2 == 0){
                System.out.println("This is EVEN "+ i);
            }else{
                System.out.println("This is ODDS "+ i  );
            }
        }
    }
}
