package com.OOP2.Polymorphism.babiTeacher;


class X{

    public String x1(){
        return "X";
    }
}
class Y extends X{
//    @Override
//    public String x1() { // run  time polyposism
//        return "Y";
//    }
}


public class RuntimePolympism {
    public static void main(String[] args) {
        X x = new X();

        Y y = new Y();

        X xy = new Y();// compile time polypism

        System.out.println(x.x1());
        System.out.println(y.x1());
        System.out.println(xy.x1());

    }
}
