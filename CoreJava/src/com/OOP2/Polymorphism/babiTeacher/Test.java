package com.OOP2.Polymorphism.babiTeacher;

class A {
    public A a() { //class ekak nam return karana one e class ekata adala object eka.
        return new B();

    }

}

class B extends A {
    @Override
    public A a() {
        return new C();
    }
}

class C extends A {
    @Override
    public A a() {
        return new B();
    }
}

public class Test {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();

        A a1 = new B();// compile time polymopism
        A c1 = new C();

        int i = (int) (Math.random() * 5) + 1;// double eka * 5n eta passe int 1 ekathu krnne
        System.out.println(i);

       String text = m();
        System.out.println(text);

    }

    public static String m() {
        return " m call una";
    }
}
