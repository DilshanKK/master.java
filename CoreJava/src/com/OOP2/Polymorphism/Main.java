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

class Jaw extends Movie {

    public Jaw() {
        super("Jaw");
    }

    @Override
    public String plot() {
        return " A shark eat lots of people ";
    }
}

class IndipendentDay extends Movie {

    public IndipendentDay() {
        super(" Independence Day ");
    }

    @Override
    public String plot() {
        return " Alience attempt to take plannet earth";
    }
}

class MazeRunner extends Movie {

    public MazeRunner() {
        super(" Maze Runner");
    }

    @Override
    public String plot() {
        return " Kids try and escape a maze";
    }
}

class StarWars extends Movie {

    public StarWars() {
        super(" Star Wars");
    }

    @Override
    public String plot() {
        return " Imperial forces try to over the universe";
    }
}

class Forgetable extends Movie {

    public Forgetable() {
        super("Forgetable");
    }
    // no plot method override
}


public class Main {
    //its purpose is return a ramdom movie
    public static void main(String[] args) {

        for (int i =0; i < 11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" +i + " : " + movie.getName() + "\n" + "Plot : "+ movie.plot() +" \n");
        }

    }

    public static Movie randomMovie(){ // Movie object ekak rturn karnawa.
        int randomNumber = (int) (Math.random() *5 +1);
        System.out.println("Genarated ramdom number was " + randomNumber);
        //Jaw is a movie
        //ID is a movie
        //MazeRunner is a movie.
        //Movie is the parents class eka nisa parents class eken allagnnawa meke return krnawa Jaw , inclide ithuru movies

        switch (randomNumber){

            case 1:
                return new Jaw();
               // break; return krnawa kynne break wag. return karama nawatha call karapu thanata ynawa
            case 2:
                return new IndipendentDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
            default:
        }
        return null;
    }

}
