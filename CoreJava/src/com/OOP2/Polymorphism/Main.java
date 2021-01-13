package com.OOP2.Polymorphism;

class Movie {

    private String name;

    public Movie(String name) {
        this.name = name;

    }

    public String plot() {
        return " no plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {


    public Jaws() {
        super(" Jaws");
    }

    public String plot() {
        return " A shark eat lot of people";
    }
}


class IndependentDay extends Movie {


    public IndependentDay() {// Independent day is not Jaw.  super() call Movie consctruter()
        super("Independent Day");
    }

    @Override
    public String plot() {
        return " Aliens attemp to take over planet earth ";
    }
}

class MazeRunner extends Movie {

    public MazeRunner() {
        super(" Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie {

    public StarWars() {
        super(" Star wars ");
    }

    @Override
    public String plot() {
        return " Imperial forces try to take over the univers";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }
    // no plot method
}

class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 11; i++) {

            Movie movie = randomMovie(); // randomMovie method eka i genarate wena hama paarama randomMovie() eka call krnawa

            // randomMovie () eken return wana values allagannawa movie kyna varible name eken.

            System.out.println(" movie # " + i + " : " + movie.getName() + "\n" +
                    "plot :" + movie.plot() + " \n");

        }


    }

    public static Movie randomMovie() { // method return type eka movie object 1k

        //apita movies jathi okkoma return karangana on ekai parents class movie danne.
        // Movie wenuwata Jaws dala balanna ethkota therei passe amathka unoth

        int randomMovie = (int) (Math.random() * 5) + 1;
        System.out.println(" Random number generated was " + randomMovie);
        switch (randomMovie) {
            case 1:
                return new Jaws(); //object eka kyanne muli class eke public , instence dewal //return tynwam break one na.
            case 2:
                return new IndependentDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }
        return null;


    }
}
// 1. software eka run wenakotama constrcter and instence dewal ram eke load krnagwaw.
//2. Movie kyna object eke return krna hadanawanwa randomMovie kyna method ekak.
//3 random no ekak genarate krla switch ekata awama e case ekata adala switch eke tyna object eka reurn krnawa ex- Jaw()
//4 eta passe e return wela ena object eka allgannawa movie kyna variable name eken.   Movie movie = randomMovie(); methana Movie kiyana parent class eka
//ganne okkoma object tika gana ona nisa. ( ithuru movie names)
//5. forloop eken i value ekata adala reurn wena value eka arn getname gannawa.
// randomMovie method eka i genarate wena hama paarama randomMovie() eka call krnawa
