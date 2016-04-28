package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by Oleg on 18.05.14.
 */
public class Hippodrome
{
    public static Hippodrome game;
    public static void main(String[] args)
    {

        game = new Hippodrome();
        Horse one = new Horse("sa", 3, 0);
        Horse two = new Horse("da", 3, 0);
        Horse three = new Horse("va", 3, 0);

       horses.add(one);
       horses.add(two);
       horses.add(three);

       game.run();
       game.printWinner();

    }

    public static ArrayList<Horse> horses = new ArrayList<>();

    public ArrayList<Horse> getHorses()
    {
        return horses;
    }

    public void run(){
        for (int i = 0; i < 100; i++)
        {

            try
            {
                move();
                print();
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
    public void move(){
        for (Horse horse : getHorses()) {
            horse.move();
        }
    }
    public void print(){
        for (Horse horse: getHorses()){
            horse.print();
        }
        System.out.println();
        System.out.println();
    }
    public Horse getWinner(){
        Horse winner = horses.get(0);
        for (Horse horse : horses){
            if (horse.getDistance() > winner.getDistance())
                winner = horse;
        }
        return winner;
    }
    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

}
